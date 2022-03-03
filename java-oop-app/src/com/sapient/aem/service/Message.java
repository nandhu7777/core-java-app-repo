package com.sapient.aem.service;
/*
 * If a class doesn't have any explicit constructors, Java provides a
 * default constructor. 
 * 
 * But if you define constructors explicitly, Java withdraws default constructor.
 * 
 * Thumb Rule:
 * 
 * Whenever you are overloading constructor methods, explicitly define default constructor
 * 
 *  public ClassName(){
 *  
 *  }
 *  
 *  
 *  Within an instance method, this indicates invoking object
 */
public class Message {
	//instance variable
//	private String localMessage="Local Message";
	//static variable
//	private static String globalMessage= "Global Message";
	
	
	
	//instance variable
	private String localMessage;
	//static variable
	private static String globalMessage;
	
	//default value in instance variable
	//instance block
	//The statement in the instance are implicitly placed in the constructor methods of the class
	{
		localMessage="Local Message";
	}
	
	
	//static block: to initialize static variables
	//statements in static block are executed during class loader time
	static {
		globalMessage= "Global Message";
	}

	
	//default constructor
	public Message() {
		
	}
	
	
	//1-arg constructor
	public Message(String localMessage) {
		super();
		this.localMessage = localMessage;
	}


	public String getLocalMessage() {
		return localMessage;
	}


	public static String getGlobalMessage() {
		return globalMessage;
	}

	// message1.setLocalMessage(), "this" will contain message1
	// message2.setLocalMessage(), "this" will contain message2
	// "this" will contain reference of invoking object
	/*
	 * All the instance methods implicitly receive the invoking object
	 * into "this" reference variable
	 */
	public void setLocalMessage(String localMessage) {
		// "this" is current/invoking object
		this.localMessage = localMessage;
	}


	public static void setGlobalMessage(String globalMessage) {
		Message.globalMessage = globalMessage;
	}


	/*
	 * We are overriding toString() method of Object class in Message class
	 * 
	 * When object of this class is placed in println() method, JVM will
	 * execute this method returning String representation of the object
	 */
	@Override
	public String toString() {
//		return "Message [localMessage=" + localMessage + "]";
		return  localMessage ;
	}
	
	
	
	
	
	
	
	
	
	
}
