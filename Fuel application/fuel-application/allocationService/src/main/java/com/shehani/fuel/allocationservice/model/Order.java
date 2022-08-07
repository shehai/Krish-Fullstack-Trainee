package com.shehani.fuel.allocationservice.model;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Order")
public class Order implements Serializable {
	@Id
	private String orderId;
	private String fuelStationId;
	private String fuelStationName;
	private String fuelId;
	private int capacity;
	private String status;
	
	
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getFuelId() {
		return fuelId;
	}
	public void setFuelId(String fuelId) {
		this.fuelId = fuelId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getFuelStationId() {
		return fuelStationId;
	}
	public void setFuelStationId(String fuelStationId) {
		this.fuelStationId = fuelStationId;
	}
	public String getFuelStationName() {
		return fuelStationName;
	}
	public void setFuelStationName(String fuelStationName) {
		this.fuelStationName = fuelStationName;
	}
	
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	
}
