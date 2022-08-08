package com.shehani.fuel.allocationservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.stereotype.Service;

import com.shehani.fuel.allocationservice.model.Order;



@SpringBootApplication
@EnableKafka
@EnableConfigurationProperties
public class allocationServiceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SpringApplication.run(allocationServiceMain.class, args);

		
	}
	
	
}
