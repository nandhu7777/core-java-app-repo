package com.sapient.aem.bean;

public class Employee {
	private int id;
	private String name;
	private int salary;
	private String designation;
	private String insurenceScheme;
	
	public Employee() {
		
	}

	public Employee(int id, String name, int salary, String designation, String insurenceScheme) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.designation = designation;
		this.insurenceScheme = insurenceScheme;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getInsurenceScheme() {
		return insurenceScheme;
	}

	public void setInsurenceScheme(String insurenceScheme) {
		this.insurenceScheme = insurenceScheme;
	}
	

}
