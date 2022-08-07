package com.shehani.fuel.allocationservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shehani.fuel.allocationservice.model.Stock;
import com.shehani.fuel.allocationservice.service.StockService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/stock")
public class StockController {
	
	@Autowired
	StockService stockService;
	
	@PostMapping("/")
	public Stock submitStock(@RequestBody Stock stock) {
		
		
		return stockService.saveStock(stock);
		
		
	}
	
	@GetMapping("/")
	public List<Stock> getAllStock() {
		
		return stockService.getAllStock();
		
		
	}

}
