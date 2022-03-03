package com.sapient.aem.ui;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

import com.sapient.aem.service.Person;
import com.sapient.aem.service.PersonValidator;

public class PersonTester {
	private static Scanner scanner= new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Enter number of persons: ");
		int ne= Integer.parseInt(scanner.nextLine());
		
		Person persons[]= new Person[ne];
		
		enterDetails(persons);
		System.out.println("Details of the persons residing in colony, "+ Person.getColonyName());
		showDetails(persons);
		
		

	}

	private static void enterDetails(Person[] persons) {
		PersonValidator validator= new PersonValidator();
		
		for(int i=0;i<persons.length;i++) {
			Person person= new Person();
			System.out.println("Enter adharcard number of person:"+(i+1));
			person.setAdharCard(Long.parseLong(scanner.nextLine()));
			System.out.println("Enter name: ");
			person.setName(scanner.nextLine());
			try {
				System.out.println("Enter birthdate(yyyy-mm-dd)");
				String bdate= scanner.nextLine();
				person.setBirthdate(LocalDate.parse(bdate));				
			}catch(DateTimeParseException e) {
				e.printStackTrace();
			}
			System.out.println("Enter address: ");
			person.setAddress(scanner.nextLine());
			System.out.println("Enter email: ");
			person.setEmail(scanner.nextLine());
			System.out.println("Enter mobile number: ");
			person.setMobile(Long.parseLong(scanner.nextLine()));
			
			if(validator.isValidPerson(person))	{		
				persons[i]=person;
			}else {
				System.out.println("Invalid data. Re-enter");
				i--;
			}
			
		}
		
	}

	private static void showDetails(Person[] persons) {
		for(Person p: persons) {
			System.out.println(p);
		}
		
	}

}
