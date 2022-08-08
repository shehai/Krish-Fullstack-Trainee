package com.shehani.fuel.orderservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.shehani.fuel.orderservice.model.Order;

@Repository
public interface OrderRepository extends MongoRepository<Order,String> {
	
	Order findByOrderId(String id);
	

}
