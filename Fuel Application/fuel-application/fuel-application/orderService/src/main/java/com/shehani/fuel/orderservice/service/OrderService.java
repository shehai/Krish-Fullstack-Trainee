package com.shehani.fuel.orderservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shehani.fuel.orderservice.model.Order;
import com.shehani.fuel.orderservice.repository.OrderRepository;

@Service
public class OrderService {
	@Autowired
	OrderRepository orderRepository;
	
	public void submitOrder(Order order) {
		
		orderRepository.save(order);
		
		//return orderRepository.findByFuelStationId(order.getFuelStationId());
		
		
	}

}
