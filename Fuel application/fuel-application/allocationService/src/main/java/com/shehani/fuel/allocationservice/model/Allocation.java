package com.shehani.fuel.allocationservice.model;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="FuelAllocation")
public class Allocation implements Serializable {
	@Id
	private String fuelAllocationId;
	private String orderId;
	private String fuelId;
	public String getFuelAllocationId() {
		return fuelAllocationId;
	}
	public void setFuelAllocationId(String fuelAllocationId) {
		this.fuelAllocationId = fuelAllocationId;
	}
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
	
	
	

}
