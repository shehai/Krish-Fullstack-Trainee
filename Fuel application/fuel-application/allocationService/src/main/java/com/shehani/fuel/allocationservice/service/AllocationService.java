package com.shehani.fuel.allocationservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.shehani.fuel.allocationservice.model.Order;
import com.shehani.fuel.allocationservice.model.Stock;
import com.shehani.fuel.allocationservice.repository.AllocationRepository;
import com.shehani.fuel.allocationservice.repository.OrderRepository;
import com.shehani.fuel.allocationservice.repository.StockRepository;

@Service
public class AllocationService {
	
	@Autowired
	KafkaTemplate<String,String> kafkaTemplate;
	
	@Value("${schedule.topic.name}")
	private String scheduleTopic;
	
	@Value("${order.topic.name}")
	  private String orderTopic;
	
	@Autowired
	OrderRepository orderRepo;
	
	@Autowired
	AllocationRepository allocationRepo;
	
	@Autowired
	StockRepository stockRepo;
	
	 ObjectMapper objMapper = new ObjectMapper();
	 
	 @KafkaListener(topics = "order-topic", groupId = "allocation")
	 public void listenGroupAllocation(String message) {
		 
		    System.out.println("Received Message to Allocation group: " + message);
		   
		    String allocationMessage=null;
		    
		    try {
		      Order order = objMapper.readValue(message, Order.class);
		      Stock stock = stockRepo.findById(order.getFuelId()).get();
			    if (stock.getCapacity() > order.getCapacity()) {
			      stock.setCapacity(stock.getCapacity() - order.getCapacity());
			      order.setStatus("ALLOCATION COMPLETED");
			      orderRepo.save(order);
			      stockRepo.save(stock);
			      
			      allocationMessage = objMapper.writeValueAsString(order);
			    
			    } else {
			      order.setStatus("ALLOCATION FAILED");
			      orderRepo.save(order);
			     
			    }    
			   
		    } catch (JsonProcessingException e) {
		      e.printStackTrace();
		    }
		    
		    kafkaTemplate.send(scheduleTopic,message);
		    

		  }
	
	
}
