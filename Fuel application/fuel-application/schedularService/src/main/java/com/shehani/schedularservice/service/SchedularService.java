package com.shehani.schedularservice.service;

import java.time.LocalDate;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.shehani.schedularservice.model.Order;
import com.shehani.schedularservice.repository.OrderRepository;

@Service
public class SchedularService {
	
	@Value("${schedule.topic.name}")
	private String scheduleTopic;
	
	@Autowired
	OrderRepository orderRepo;
	
	ObjectMapper objMapper = new ObjectMapper();
	
	 @KafkaListener(topics = "schedule-topic", groupId = "schedular")
	 public void listenGroupSchedular(String message) {
		 
		    System.out.println("Received Message to Schedular group: " + message);
		    
		    try {
		    	
		    	Order order = objMapper.readValue(message,Order.class);
			      order.setStatus("SCHEDULING COMPLETED");
			      
			      Random randomDays = ThreadLocalRandom.current();
			      LocalDate date = LocalDate.now().plusDays(randomDays.nextInt(7) + 1);
			      order.setScheduleDate(date);
			      orderRepo.save(order);
			     
			   
		    } catch (JsonProcessingException e) {
		      e.printStackTrace();
		    }
		    
		    //kafkaTemplate.send(scheduleTopic,message);
		    

		  }
	 
	
	
	
	
	

}
