package com.shehani.fuel.allocationservice.model;

public class Order {
	//private String orderId;
	private String fuelStationId;
	private String fuelStationName;
	private String fuelType;
	private int capacity;
	/*public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}*/
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
