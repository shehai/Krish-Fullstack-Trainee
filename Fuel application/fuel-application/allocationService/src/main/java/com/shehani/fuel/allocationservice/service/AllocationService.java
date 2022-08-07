package com.shehani.fuel.allocationservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
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
	
	@Value("${order.topic.name}")
	  private String topicName;
	
	@Autowired
	OrderRepository orderRepo;
	
	@Autowired
	AllocationRepository allocationRepo;
	
	@Autowired
	StockRepository stockRepo;
	
	 ObjectMapper object = new ObjectMapper();
	 
	 @KafkaListener(topics = "order-topic", groupId = "allocation")
	 public void listenGroupAllocation(String message) {
		    System.out.println("Received Message in group allocation: " + message);
		   
		    
		    try {
		      Order order = object.readValue(message, Order.class);
		      Stock stock = stockRepo.findById(order.getFuelId()).get();
			    if (stock.getCapacity() > order.getCapacity()) {
			      stock.setCapacity(stock.getCapacity() - order.getCapacity());
			      order.setStatus("ALLOCATION COMPLETED");
			      orderRepo.save(order);
			      stockRepo.save(stock);
			    
			    } else {
			      order.setStatus("ALLOCATION FAILED");
			      orderRepo.save(order);
			     
			    }
			    
			   
		    } catch (JsonProcessingException e) {
		      e.printStackTrace();
		    }
		    

		  }
	
	
}
