package com.sapient.aem.ui;

import java.time.LocalDate;

import com.sapient.aem.service.Employee;
import com.sapient.aem.service.SwipeCard;

public class EmployeeLogin {

	public static void main(String[] args) {
		Employee employee= new Employee(1001,"Rohit Sharma");
		SwipeCard swipeCard= 
				new SwipeCard("1001IDsapientDTAEM",LocalDate.of(2018, 10, 10),
						LocalDate.of(2022, 10, 31));
		
		employee.login(swipeCard);

	}

}
