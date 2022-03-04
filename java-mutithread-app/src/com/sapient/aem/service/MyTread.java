package com.sapient.aem.service;

public class MyTread extends Thread{
	
	public MyTread() {
		
	}
	
	public MyTread(String threadName) {
		super(threadName);
	}
	

	@Override
	public void run() {
//		super.run();
		
		System.out.println(Thread.currentThread());
		System.out.println("End of run() method");
		
	}
	

}


