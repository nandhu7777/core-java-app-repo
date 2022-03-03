package com.sapient.aem.service;

public class Engine {
	private Long serialNumber;
	private String engineType;
	private Integer capacity;
	
	public Engine() {
		
	}

	public Engine(Long serialNumber, String engineType, Integer capacity) {
		super();
		this.serialNumber = serialNumber;
		this.engineType = engineType;
		this.capacity = capacity;
	}

	public Long getSerialNumber() {
		return serialNumber;
	}

	public String getEngineType() {
		return engineType;
	}

	public Integer getCapacity() {
		return capacity;
	}

	public void setSerialNumber(Long serialNumber) {
		this.serialNumber = serialNumber;
	}

	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}

	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return "Engine [serialNumber=" + serialNumber + ", engineType=" + engineType + ", capacity=" + capacity + "]";
	}
	
	
	
}
