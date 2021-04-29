package com.meritamerica.assignment2;

import java.util.Date;

public class CDAccount {

	private double balance;
	private double interestRate;
	private int term;
	private long accountNumber;
	
	CDAccount(CDOffering offering, double balance) {
		
	}
	
	
	
	public void setBalance(double balance) {
		this.balance = balance;
	}


	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}


	public void setTerm(int term) {
		this.term = term;
	}


	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}


	
	
	java.util.Date getStartDate() {
		
		java.util.Date currentDate = new java.util.Date();
		return currentDate;
	}
	
	double futureValue() {
		
		return 0.0;
	}

}
