package com.sapient.aem.ui;

import com.sapient.aem.service.MyTread;

public class MyTreadDemo {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		Thread t1= new MyTread("worker-1");
		t1.start();//invokes run() method
		System.out.println("End of main() method");

	}
}

