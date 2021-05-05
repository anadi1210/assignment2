package com.meritamerica.assignment2;

public class MeritAmericaBankApp {
	public static void main(String[] args) {
	
		
		CDOffering[] cdOfferings = new CDOffering[5];
		cdOfferings[0] = new CDOffering(1, .018);
		cdOfferings[1] = new CDOffering(2, .019);
		cdOfferings[2] = new CDOffering(3, .02);
		cdOfferings[3] = new CDOffering(5, .025);
		cdOfferings[4] = new CDOffering(10, .022);
		
		MeritBank.setCDOfferings(cdOfferings);
		
		AccountHolder accountHolder1 = new AccountHolder("John", "B", "Smith", "123-45-5487");
		
	 	CheckingAccount checkingAccount1 = accountHolder1.addCheckingAccount(1000);
    	SavingsAccount savingsAccount1 = accountHolder1.addSavingsAccount(10000);
    	
    	//accountHolder1.addCheckingAccount(checkingAccount1);
    	//accountHolder1.addSavingsAccount(savingsAccount1);
    	
    	
    	CheckingAccount checkingAccount2 =accountHolder1.addCheckingAccount(5000);
    	SavingsAccount savingsAccount2 = accountHolder1.addSavingsAccount(50000);
    	
      	//accountHolder1.addCheckingAccount(checkingAccount2);
    	//accountHolder1.addSavingsAccount(savingsAccount2);
    	
    	
    	CheckingAccount checkingAccount3 =accountHolder1.addCheckingAccount(50000);
    	SavingsAccount savingsAccount3 = accountHolder1.addSavingsAccount(500000);
    	
      //	accountHolder1.addCheckingAccount(checkingAccount3);
    	//accountHolder1.addSavingsAccount(savingsAccount3);
    	
    	
       	CheckingAccount checkingAccount4 =accountHolder1.addCheckingAccount(5000);
    	SavingsAccount savingsAccount4 = accountHolder1.addSavingsAccount(50000);
    	
    	
      //	accountHolder1.addCheckingAccount(checkingAccount4);
    	//accountHolder1.addSavingsAccount(savingsAccount4);
		
		
		CDOffering bestCDoffering = MeritBank.getBestCDOffering(10000);
		
		
		if(bestCDoffering != null) {
			CDAccount cdAccount1 = accountHolder1.addCDAccount(bestCDoffering, 10000);
			//accountHolder1.addCDAccount(cdAccount1);
		}
		
		MeritBank.addAccountHolder(accountHolder1);

		AccountHolder accountHolder2 = new AccountHolder("Arti", "Anadi", "Khandelwal", "985-45-1254");
		
		CheckingAccount checkingAccount5 = accountHolder2.addCheckingAccount(1000);
    	SavingsAccount savingsAccount5 = accountHolder2.addSavingsAccount(10000);
 
    	
    //	accountHolder2.addCheckingAccount(checkingAccount5);
    //	accountHolder2.addSavingsAccount(savingsAccount5);
		
    	CDOffering secondBestCDoffering1 = MeritBank.getSecondBestCDOffering(10000);
		
		

    	if(secondBestCDoffering1 != null) {
    		CDAccount cdAccount2 = accountHolder1.addCDAccount(secondBestCDoffering1, 10000);
    		//accountHolder2.addCDAccount(cdAccount2);
    	}
    	
    	MeritBank.addAccountHolder(accountHolder2);
    	
    	MeritBank.clearCDOfferings();
    	
    	AccountHolder accountHolder3 = new AccountHolder("Shikha", "Rahul", "Sharma", "666-88-9999");
    	
    	CDOffering secondBestCDoffering2 = MeritBank.getSecondBestCDOffering(50000);
		
    	if(secondBestCDoffering2 != null) {
    		CDAccount cdAccount3 = accountHolder3.addCDAccount(secondBestCDoffering2, 50000);
    		//accountHolder3.addCDAccount(cdAccount3);
    	}
    	else {
    		System.out.println("secondBestCDoffering2 is null, CD Account can not be created.");
    	}
    	
    	CheckingAccount checkingAccount6 = accountHolder3.addCheckingAccount(1000);
    	SavingsAccount savingsAccount6 = accountHolder3.addSavingsAccount(10000);
    
    //	accountHolder3.addCheckingAccount(checkingAccount6);
    //	accountHolder3.addSavingsAccount(savingsAccount6);
    	
    	MeritBank.addAccountHolder(accountHolder3);
    	
    	double totalBalance = MeritBank.totalBalances();
    	System.out.println("Total Balance : "+totalBalance);
    	
    	System.out.println("Account holder 1 combined balance : " +accountHolder1.getCombinedBalance());
    	System.out.println("Account holder 2 combined balance : " +accountHolder2.getCombinedBalance());
    	System.out.println("Account holder 3 combined balance : " +accountHolder3.getCombinedBalance());
    	
    	System.out.println("Number of Checking account : "+accountHolder1.getCheckingAccounts().length);
    	System.out.println("Number of Savings account : "+accountHolder1.getSavingsAccounts().length);
    	System.out.println("Number of CD account : "+accountHolder1.getCDAccounts().length);
    	
	}
	
	
}
	
	
	
	
	
	
	
	
	
	
