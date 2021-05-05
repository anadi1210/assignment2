package com.meritamerica.assignment2;

public class CheckingAccount extends BankAccount{
	
	private double balance;
	
	public CheckingAccount() {
		
	}
	
	CheckingAccount(double openingBalance){
		this.balance = openingBalance;
	}
	

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}


	// This method  will receive the amount to be withdrawn and will return boolean value as output
	boolean withdraw(double amount) {
		boolean flag = false;
		if(amount != 0 && amount <= balance) {
			balance -= amount;
			flag = true;
		}
		
		return flag;
	}
	
	// This method  will receive the amount to be deposited and will return boolean value as output.
	boolean deposit(double amount) {
		boolean flag=false;
		if(amount >= 0.0)
		{
			balance += amount;
			flag = true;
		}
		return flag;
	}
}
