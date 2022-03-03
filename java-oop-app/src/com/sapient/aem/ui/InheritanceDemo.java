package com.sapient.aem.ui;

import com.sapient.aem.service.A;
import com.sapient.aem.service.B;

public class InheritanceDemo {

	public static void main(String[] args) {
		B bobj= new B(5,10);
		System.out.println(bobj.getA()+","+bobj.getB());
		
		//invokes greet() of class B
		bobj.greet();
		
		// instance of sub class is stored in super class reference
		A aobj= new B(100,200);
		/*
		 * greet() method of which class will be called?
		 * 
		 * greet() method of class B is called. This is called polymorphism.
		 * 
		 * JVM resolves the method call during run time.
		 */
		aobj.greet();

	}

}
