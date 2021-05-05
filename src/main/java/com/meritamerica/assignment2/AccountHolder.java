package com.meritamerica.assignment2;

import java.util.Arrays;

public class AccountHolder {

	private String firstName;
	private String middleName;
	private String lastName;
	private String ssn;
	
	private CheckingAccount[] checkingAccountArray = new CheckingAccount[0];
	private SavingsAccount[] savingsAccountArray = new SavingsAccount[0];
	private CDAccount[] cdAccountArray = new CDAccount[0];
	private CheckingAccount checkingAccount;
	private SavingsAccount savingsAccount;
	private CDAccount cdAccount;

	public AccountHolder() {
	
	}

	AccountHolder(String firstName, String middleName, String lastName, String ssn) {
		
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.ssn = ssn;
	}


	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	


	CheckingAccount addCheckingAccount(double openingBalance) {
		checkingAccount = new CheckingAccount(openingBalance);
		addCheckingAccount(checkingAccount);
		return checkingAccount;
		
	}
	CheckingAccount addCheckingAccount(CheckingAccount checkingAccount) {
		double checkingAndSavingsBalance  = getCheckingBalance() + getSavingsBalance() + checkingAccount.getBalance();
		if(checkingAndSavingsBalance < 250000) {
			
			CheckingAccount[] temp = new CheckingAccount[this.checkingAccountArray.length + 1];
			for(int i = 0; i<checkingAccountArray.length; i++)
				temp[i] = this.checkingAccountArray[i];
			temp[temp.length - 1] = checkingAccount;
			this.checkingAccountArray = temp;
			return checkingAccount;
		}
		else {
			System.out.println("Checking Account can not be created, total account balance exceeds $250,000");
			return null;
		}
	}
	CheckingAccount[] getCheckingAccounts() {
		
		return checkingAccountArray;
		
	}

	int getNumberOfCheckingAccounts() {
		return checkingAccountArray.length;
	}
	double getCheckingBalance() {
		double checkingBalance = 0.0;
		
		if(checkingAccountArray != null) {
			for(int i = 0 ; i < checkingAccountArray.length ; i++) {
				checkingBalance += checkingAccountArray[i].getBalance();
				
			}
		}
		return checkingBalance;
	}
	SavingsAccount addSavingsAccount(double openingBalance) {
		savingsAccount = new SavingsAccount(openingBalance);
		addSavingsAccount(savingsAccount);
		return savingsAccount;
		 
	}
	SavingsAccount addSavingsAccount(SavingsAccount savingsAccount) {
		if((getCheckingBalance() + getSavingsBalance() + savingsAccount.getBalance()) < 250000) {
			SavingsAccount[] temp = new SavingsAccount[this.savingsAccountArray.length + 1];
			for(int i = 0; i<savingsAccountArray.length; i++)
				temp[i] =this.savingsAccountArray[i];
			
			temp[temp.length - 1] = savingsAccount;
			this.savingsAccountArray = temp;
			return savingsAccount;
		}
		else {
			System.out.println("Savings Account can not be created, total account balance exceeds $250,000");
			return null;
		}
	}
	SavingsAccount[] getSavingsAccounts() {
		
		return savingsAccountArray;
	}
	int getNumberOfSavingsAccounts() {
		return savingsAccountArray.length;
	}
	double getSavingsBalance() {
		double savingsBalance = 0.0;
		if(savingsAccountArray != null) {
			for(int i = 0 ; i < savingsAccountArray.length ; i++) {
				savingsBalance += savingsAccountArray[i].getBalance();
				
			}
		}
		return savingsBalance;
	}
	CDAccount addCDAccount(CDOffering offering, double openingBalance) {
		cdAccount = new CDAccount(offering, openingBalance);
		addCDAccount(cdAccount);
		return cdAccount;
	}
	CDAccount addCDAccount(CDAccount cdAccount) {
		
		CDAccount[] temp = new CDAccount[this.cdAccountArray.length + 1];
		for(int i = 0; i<cdAccountArray.length; i++)
			temp[i] = this.cdAccountArray[i];
		temp[temp.length - 1] = cdAccount;
		this.cdAccountArray = temp;
		
		return cdAccount;
		
	}
	CDAccount[] getCDAccounts() {
		
		return cdAccountArray;
	}
	int getNumberOfCDAccounts() {
		return cdAccountArray.length;
	}
	double getCDBalance() {
		double cdBalance = 0.0;
		
		if(cdAccountArray != null) {
			for(int i = 0 ; i < cdAccountArray.length ; i++) {
				cdBalance += cdAccountArray[i].getBalance();
				
			}
		}
		return cdBalance;
	}
	double getCombinedBalance() {
		double combinedBalance =
					getCheckingBalance() + getSavingsBalance() + getCDBalance();
		
		return combinedBalance;
	}
}
