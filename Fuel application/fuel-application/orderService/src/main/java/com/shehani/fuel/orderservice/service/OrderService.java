package com.shehani.fuel.orderservice.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.shehani.fuel.orderservice.model.Order;
import com.shehani.fuel.orderservice.model.Stock;
import com.shehani.fuel.orderservice.repository.OrderRepository;
import com.shehani.fuel.orderservice.repository.StockRepository;

@Service
public class OrderService {
	@Autowired
	OrderRepository orderRepository;
	
	@Autowired
	StockRepository stockRepo;
	
	@Autowired
	KafkaTemplate<String,String> kafkaTemplate;
	
	@Value("${order.topic.name}")
	private String orderTopic;
	
	ObjectMapper objMapper=new ObjectMapper();
	
	public Order submitOrder(Order order) {
		
		order.setStatus("ORDER CREATED");
		String id = order.getFuelId();
		Stock stock = stockRepo.findByFuelId(id);
		order.setFuelType(stock.getFuelType());
		order = orderRepository.save(order);
		
		String message= null;
	    try {
	      message = objMapper.writeValueAsString(order);
	    } catch (JsonProcessingException e) {
	      e.printStackTrace();
	    }
	    kafkaTemplate.send(orderTopic,message);
		
		//return orderRepository.findByFuelStationId(order.getFuelStationId());	
		return order;
	}
	
	public Order findOrderById(String id) {
		
		return orderRepository.findByOrderId(id);		
		
	}
	
	public List<Order> getAllOrders(){
		
		return orderRepository.findAll();
	}
	
	public List<Order> getScheduledOrders(){
		
		String orderStatus="SCHEDULING COMPLETED";
		
		return orderRepository.findByStatus(orderStatus);
	}
	
	 @KafkaListener(topics = "dispatch-topic", groupId = "dispatch")
	public void ListenGroupAllDispatch(String message) {
		 
		 System.out.println("Received Message Order is disaptched: " + message);
		   
		    
		    try {
		      Order order = objMapper.readValue(message, Order.class);

			   
		    } catch (JsonProcessingException e) {
		      e.printStackTrace();
		    }	   	
		
	}
	 
	 public Order orderConfirm(String id) {
		 
		 //Optional <Order> orders= orderRepository.findById(id);
			
			//Order order =orders.get();
		 
		 Order order= orderRepository.findByOrderId(id);
			order.setStatus("ORDER COMPLETED");
			
			
			return orderRepository.save(order);
		 
	 }
}
