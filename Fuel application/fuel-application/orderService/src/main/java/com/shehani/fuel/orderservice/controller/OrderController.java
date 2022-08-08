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
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	OrderService orderService;
	
	@PostMapping("/")
	public Order saveOrder(@RequestBody Order order) {
		
		 return orderService.submitOrder(order);
		 
		
		
	}
	

}
