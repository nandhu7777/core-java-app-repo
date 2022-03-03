package com.sapient.aem.service;

import java.time.LocalTime;

public class Employee {
	private Integer empno;
	private String ename;
	
	
	public Employee() {
		
	}


	public Employee(Integer empno, String ename) {
		super();
		this.empno = empno;
		this.ename = ename;
	}


	public Integer getEmpno() {
		return empno;
	}


	public String getEname() {
		return ename;
	}


	public void setEmpno(Integer empno) {
		this.empno = empno;
	}


	public void setEname(String ename) {
		this.ename = ename;
	}


	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", ename=" + ename + "]";
	}
	
	// login() of Employee class is using swipe() of SwipeCard class to perform the task
	//dependency -  uses-a
	public  void login(SwipeCard card) {
		if(card.swipe(this)) {
			System.out.println("Welcome, "+this.ename+" Login time: "+ LocalTime.now());
		}else {
			System.out.println("Sorry! Contact admin");
		}
	}
}
