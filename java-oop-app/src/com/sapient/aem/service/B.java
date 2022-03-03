package com.sapient.aem.service;

public class B extends A{
	private int b;
	
	public B() {
		
	}
	
	public B(int b) {
		super(); //implicit, invoking default constructor of super class
		this.b=b;
	}
	
	/*
	 * To invoke parameterized constructor methods of super class,
	 * use super() in subclass constructor methods
	 */
	public B(int a, int b) {
		super(a); //invoking 1-arg constructor method of super class
		this.b=b;
	}

	public int getB() {
		return b;
	}
	
	
	

	public void setB(int b) {
		this.b = b;
	}

	@Override
	public void greet() {		
		super.greet(); //invokes greet() of class A
		System.out.println("Method overriding");
	}
	
	
	
	
	
}
