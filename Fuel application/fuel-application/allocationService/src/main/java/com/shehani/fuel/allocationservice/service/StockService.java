package com.shehani.fuel.allocationservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shehani.fuel.allocationservice.model.Stock;
import com.shehani.fuel.allocationservice.repository.StockRepository;

@Service
public class StockService {

	@Autowired
	StockRepository stockRepo;
	
	
	public Stock saveStock(Stock stock) {
		
		
		return stockRepo.save(stock);
		
		
	}
	
	
	public List<Stock>getAllStock() {
		
		
		return stockRepo.findAll();
	}
}
