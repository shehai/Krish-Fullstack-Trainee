package com.shehani.fuel.orderservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.kafka.annotation.EnableKafka;



@SpringBootApplication
@EnableKafka
@EnableConfigurationProperties
public class orderServiceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SpringApplication.run(orderServiceMain.class, args);
		
		//System.out.println("Order service started");

	}

}
