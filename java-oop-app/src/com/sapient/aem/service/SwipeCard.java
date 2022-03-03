package com.sapient.aem.service;

import java.time.LocalDate;

public class SwipeCard {
	//1001IDsapientDTAEM
	private String swipeCardID;
	private LocalDate issueDate;
	private LocalDate expiryDate;
	
	public SwipeCard() {
		
	}

	public SwipeCard(String swipeCardID, LocalDate issueDate, LocalDate expiryDate) {
		super();
		this.swipeCardID = swipeCardID;
		this.issueDate = issueDate;
		this.expiryDate = expiryDate;
	}

	public String getSwipeCardID() {
		return swipeCardID;
	}

	public LocalDate getIssueDate() {
		return issueDate;
	}

	public LocalDate getExpiryDate() {
		return expiryDate;
	}

	public void setSwipeCardID(String swipeCardID) {
		this.swipeCardID = swipeCardID;
	}

	public void setIssueDate(LocalDate issueDate) {
		this.issueDate = issueDate;
	}

	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}

	@Override
	public String toString() {
		return "SwipeCard [swipeCardID=" + swipeCardID + ", issueDate=" + issueDate + ", expiryDate=" + expiryDate
				+ "]";
	}
	
	public Boolean swipe(Employee employee) {
		if(swipeCardID.contains(employee.getEmpno().toString())){
			if(LocalDate.now().isAfter(this.issueDate) &&
					LocalDate.now().isBefore(this.expiryDate)) {
				return true;
			}
		}
		return false;
	}
	
	
	
}
