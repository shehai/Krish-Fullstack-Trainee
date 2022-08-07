package com.shehani.schedularservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.shehani.schedularservice.model.Order;


public interface OrderRepository  extends MongoRepository<Order,String>{

}
