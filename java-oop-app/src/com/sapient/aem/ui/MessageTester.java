package com.sapient.aem.ui;

import com.sapient.aem.service.Message;
/*
 * instance methods will implicitly receive the invoking objects into
 * this reference variable
 */
public class MessageTester {

	public static void main(String[] args) {
		Message message1= new Message(); // default constructor
		System.out.println(message1.getLocalMessage()); //Local Message
		System.out.println(Message.getGlobalMessage()); // Global Message
		
		Message message2= new Message("Customized message"); // 1-arg constructor
		System.out.println(message2.getLocalMessage());
		//invoking object is message1, so "this" will contain message1
		message1.setLocalMessage("Greetings of the day!");
		System.out.println(message1.getLocalMessage());
		//invoking object is message2, so "this" will contain message2
		message2.setLocalMessage("Hi, Good Morning!");
		System.out.println(message2.getLocalMessage());
		
		System.out.println("-----------------------------");
		//If Message class doesn't override toString() method
		// reference: packagename.classname@hexadecimal representation of object's hashcode
		System.out.println(message1+","+message1.hashCode()); 
		System.out.println(message2+","+message2.hashCode());
		System.out.println("-----------------------------");
		String string=new String("Hi");
		/*
		 * In the String class, toString() method is already overridden. so when we place
		 * String object in println(), JVM will internally call toString() method which returns
		 * String representation of the object displaying current state.
		 */
		System.out.println(string);
	}

}
