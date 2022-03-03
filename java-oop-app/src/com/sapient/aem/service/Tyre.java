package com.sapient.aem.service;

public class Tyre {
	private String brand;
	private Integer size;
	
	public Tyre() {
		
	}

	public Tyre(String brand, Integer size) {
		super();
		this.brand = brand;
		this.size = size;
	}

	public String getBrand() {
		return brand;
	}

	public Integer getSize() {
		return size;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Tyre [brand=" + brand + ", size=" + size + "]";
	}
	
	
}
