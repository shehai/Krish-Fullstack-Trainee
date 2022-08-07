package com.shehani.fuel.allocationservice.model;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="FuelStock")
public class Stock implements Serializable {
	@Id
	private String fuelId;
	private String fuelType;
	private int capacity;
	
	public String getFuelId() {
		return fuelId;
	}
	public void setFuelId(String fuelId) {
		this.fuelId = fuelId;
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
	
	
	
	

}
