package com.sapient.aem.service;

import java.util.Arrays;
/* 
 * Aggregation, has-a
 */
public class Car {
	private String brand;
	private Engine engine;
	private Tyre tyres[];
	
	
	public Car() {
		
	}


	public Car(String brand, Engine engine, Tyre[] tyres) {
		super();
		this.brand = brand;
		this.engine = engine;
		this.tyres = tyres;
	}


	public String getBrand() {
		return brand;
	}


	public Engine getEngine() {
		return engine;
	}


	public Tyre[] getTyres() {
		return tyres;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public void setEngine(Engine engine) {
		this.engine = engine;
	}


	public void setTyres(Tyre[] tyres) {
		this.tyres = tyres;
	}


	@Override
	public String toString() {
		return "Car [brand=" + brand + ", engine=" + engine + ", tyres=" + Arrays.toString(tyres) + "]";
	}
	
	
	
}
