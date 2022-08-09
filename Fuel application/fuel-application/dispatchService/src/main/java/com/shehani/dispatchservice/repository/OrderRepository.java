package com.shehani.dispatchservice.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.shehani.dispatchservice.model.Order;

@Repository
public interface OrderRepository extends MongoRepository<Order,String>{
	
	Order findByOrderId(String id);

}
