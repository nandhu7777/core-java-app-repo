package com.sapient.aem.service;

import java.time.LocalDate;

public class PersonValidator {

	/**
	 * 
	 * @param person
	 * @return returns true if adharcard number is 12-digit number
	 * else returns false
	 */
	public Boolean isValidAdharCardNumber(Person person) {
		String pattern="^[//d]{12}$";
		String adharCard= person.getAdharCard().toString();
		if(adharCard.matches(pattern)) {
			return true;
		}
		return false;
	}
	
	/**
	 * 
	 * @param person
	 * @return returns true if person name contains only alphabets, spaces and dot
	 */
	public Boolean isValidName(Person person) {
		String pattern= "^[a-zA-Z\\s.]+$";
		if(person.getName().matches(pattern)) {
			return true;
		}
		return false;
	}
	
	/**
	 * 
	 * @param person
	 * @return returns true if birthdate is less than current date else
	 * returns false
	 */
	public Boolean isValidBirthdate(Person person) {
		if(person.getBirthdate().isBefore(LocalDate.now())) {
			return true;
		}
		return false;
	}
	
	/**
	 * 
	 * @param person
	 * @return returns ture if it is valid email ( xxxx@yyyy.zzz) else
	 * returns false
	 */
	public Boolean isValidEmail(Person person) {
		String pattern="^[a-zA-Z0-9.]+@[a-zA-Z0-9]+.[a-zA-Z]{2,3}$";
		if(person.getEmail().matches(pattern)) {
			return true;
		}
		return false;
	}
	
	/**
	 * 
	 * @param person
	 * @return returns true if mobile number is 10-digit number
	 * else returns false
	 */
	public Boolean isValidMobile(Person person) {
		String pattern="^[//d]{10}$";
		if(person.getMobile().toString().matches(pattern)) {
			return true;
		}
		return false;
	}
	
	
	public Boolean isValidPerson(Person person) {
		if(isValidAdharCardNumber(person) &&
				this.isValidName(person) &&
				this.isValidBirthdate(person) &&
					this.isValidEmail(person) &&
						this.isValidMobile(person)
				) {
			return true;
		}else {
			return false;
		}
			
	}
	
}
