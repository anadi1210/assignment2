package com.meritamerica.assignment2;

public class BankAccount {

	private long accountNumber;
	private double balance;
	private double interestRate;
	
	public BankAccount() {
		
	}
	
	BankAccount(double balance, double interestRate){
		this.balance = balance;
		this.interestRate = interestRate;
	}
	BankAccount(long accountNumber, double balance, double interestRate) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.interestRate = interestRate;
	}

	boolean withdraw(double amount) {
		
		return false;
	}
	boolean deposit (double amount) {
		
		return false;
	}
	double futureValue(int years) {
		double futureBalance = 0.0;
		
		return futureBalance;
	}
	
	
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
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
	
}
