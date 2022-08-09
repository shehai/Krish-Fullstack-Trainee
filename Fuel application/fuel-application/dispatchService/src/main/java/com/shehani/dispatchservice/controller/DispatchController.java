package com.shehani.dispatchservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.shehani.dispatchservice.model.Order;
import com.shehani.dispatchservice.service.DispatchService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/dispatch")
public class DispatchController {
	
	@Autowired
	DispatchService dispatchService;
	
	@GetMapping("/id/{id}")
	@ResponseBody
	public Order dispatchOrde(@PathVariable String id) {
		
		return dispatchService.dispatchOrder(id);
	}
	
	
	

}
