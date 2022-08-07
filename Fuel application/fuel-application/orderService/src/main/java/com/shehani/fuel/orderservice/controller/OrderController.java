package com.shehani.fuel.orderservice.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.shehani.fuel.orderservice.model.Order;
import com.shehani.fuel.orderservice.service.OrderService;

@RestController
//@EnableBinding(Processor.class)
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	OrderService orderService;
	
	//@Autowired
    //RestTemplate restTemplate;
	//@Autowired
    //private Processor processor;
	
	@PostMapping("/")
	//@SendTo(Processor.OUTPUT)
	public Order saveEmp(@RequestBody Order order) {
		
		//LOGGER.info("::successfully Employee added ::::EmpDetails-saveEmp :: ");
		
		 return orderService.submitOrder(order);
		 
		 //Order newOrder = new Order(order.getOrderId(),order.getFuelStationId(),order.getFuelStationName(),order.getFuelType(),order.getCapacity());
		
		//processor.output().send(MessageBuilder.withPayload("hi Shehani").build());
		
		
		
		//return newOrder;
		
		
	}
	

}
