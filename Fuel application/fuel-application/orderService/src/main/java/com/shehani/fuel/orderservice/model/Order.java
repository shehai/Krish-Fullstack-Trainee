package com.shehani.fuel.orderservice.model;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Order")
public class Order implements Serializable {
	@Id
	private String orderId;
	private String fuelStationId;
	private String fuelStationName;
	private String fuelType;
	private int capacity;
	
	public Order(String orderId, String fuelStationId, String fuelStationName, String fuelType, int capacity) {
		
		this.orderId = orderId;
		this.fuelStationId = fuelStationId;
		this.fuelStationName = fuelStationName;
		this.fuelType = fuelType;
		this.capacity = capacity;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getFuelStationName() {
		return fuelStationName;
	}
	public void setFuelStationName(String fuelStationName) {
		this.fuelStationName = fuelStationName;
	}
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public String getFuelStationId() {
		return fuelStationId;
	}
	public void setFuelStationId(String fuelStationId) {
		this.fuelStationId = fuelStationId;
	}
	
	
	

}
