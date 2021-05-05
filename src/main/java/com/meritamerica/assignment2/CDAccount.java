package com.meritamerica.assignment2;

import java.util.Date;

public class CDAccount extends BankAccount{

	private double balance;
	private double interestRate;
	private int term;
	private long accountNumber;
	CDOffering offering ;

	CDAccount(CDOffering offering, double balance){
		this.offering = offering;
		this.term = offering.getTerm();
		this.interestRate = offering.getInterestRate();
		this.balance = balance;
	}
	
	
	
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public int getTerm() {
		return term;
	}

	public void setTerm(int term) {
		this.term = term;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public CDOffering getOffering() {
		return offering;
	}

	public void setOffering(CDOffering offering) {
		this.offering = offering;
	}

	Date getStartDate(){
		
		return null;
	}
	
	double futureValue() {
		
		return 0.0;
	}


}
