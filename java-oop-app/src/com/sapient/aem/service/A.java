package com.sapient.aem.service;

public class A {
	private int a;
	
	public A() {
		System.out.println("default constructor of class A invoked");
	}
	
	public A(int a) {
		this.a=a;
		System.out.println("1-arg constructor of class A invoked");
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
	
	//instance method
	public void greet() {
		System.out.println("Hi, Welcome");
	}
	
	
}
