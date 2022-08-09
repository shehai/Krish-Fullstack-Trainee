package com.shehani.dispatchservice.service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.shehani.dispatchservice.model.Order;
import com.shehani.dispatchservice.repository.OrderRepository;

@Service
public class DispatchService {
	
	@Autowired
	OrderRepository orderRepo;
	
	@Autowired
	KafkaTemplate<String,String> kafkaTemplate;
	
	@Value("${dispatch.topic.name}")
	private String dispatchTopic;
	
	
	
	ObjectMapper objMapper=new ObjectMapper();
	
	public Order dispatchOrder(String orderId) {
		
		Order order = orderRepo.findByOrderId(orderId);
		order.setStatus("ORDER DISPATCHED");
		order.setDispatchDate(LocalDate.now());
		order= orderRepo.save(order);
		
		String dispatchMessage =null;
		
	    try {
	    	
	      dispatchMessage = objMapper.writeValueAsString(order);
	    } catch (JsonProcessingException e) {
	      e.printStackTrace();
	    }
	    kafkaTemplate.send(dispatchTopic,dispatchMessage);
		
		
		return order ;
		
	}
	
	

}
