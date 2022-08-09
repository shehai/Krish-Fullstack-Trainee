package com.shehani.fuel.orderservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.shehani.fuel.orderservice.model.Stock;

public interface StockRepository extends MongoRepository<Stock, String> {
	
	Stock findByFuelId(String id);

}
