package com.shehani.fuel.allocationservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shehani.fuel.allocationservice.model.Stock;
import com.shehani.fuel.allocationservice.service.StockService;

@RestController
@RequestMapping("/stock")
public class StockController {
	
	@Autowired
	StockService stockService;
	
	@PostMapping("/")
	public Stock submitStock(@RequestBody Stock stock) {
		
		
		return stockService.saveStock(stock);
		
		
	}

}
