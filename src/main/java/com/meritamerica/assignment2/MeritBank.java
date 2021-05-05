package com.meritamerica.assignment2;

import java.util.Arrays;
import java.util.Random;

public class MeritBank {

	private static CDOffering[] cdOffering ;
	private static AccountHolder accountHolders[] = new AccountHolder[0];

	static void addAccountHolder(AccountHolder accountHolder) {
		AccountHolder[] temp =  new AccountHolder[accountHolders.length + 1];
		for(int i = 0; i < accountHolders.length;i++)
			temp[i] = accountHolders[i];
		temp[temp.length - 1] = accountHolder;
		accountHolders = temp;
	}


	static AccountHolder[] getAccountHolders() {
		return accountHolders;
	}


	static CDOffering[] getCDOfferings() {
		if(cdOffering != null)
			return cdOffering;
		else
			return null;
	}


	static CDOffering getBestCDOffering(double depositAmount) {
		if (cdOffering != null) {
			double bestCDoffering = 0.0;
			int index = 0;
			for(int i = 0;i<cdOffering.length;i++) {
				double currentValue = futureValue(depositAmount, cdOffering[i].getInterestRate(), cdOffering[i].getTerm());
				
				if(currentValue > bestCDoffering) {
					bestCDoffering = currentValue;
					index = i;
				}
			}
			return cdOffering[index];
		}
		else
			return null;
	}


	static CDOffering getSecondBestCDOffering(double depositAmount) {
		if(cdOffering != null) {
			int index = 0;
			double best = 0.0;
			double secondBest = 0.0;
			double[] currentValue = new double[cdOffering.length];
			for(int i = 0;i<cdOffering.length;i++) {
				currentValue[i] = futureValue(depositAmount, cdOffering[i].getInterestRate(), cdOffering[i].getTerm());
				if(currentValue[i] > best) {
					secondBest = best;
					best = currentValue[i];
				}else if(currentValue[i] > secondBest) {
					secondBest = currentValue[i];
				}
			}
			for(int i = 0; i<currentValue.length;i++) {
				if(currentValue[i] == secondBest)
					index = i;
			}
			return cdOffering[index];
		}
		else
			return null;
	}



	static void clearCDOfferings() {
		cdOffering = null;
	}



	static void setCDOfferings(CDOffering[] offerings) {
		if(offerings != null) {
			cdOffering = new CDOffering[offerings.length];
			for(int i = 0 ; i < offerings.length ; i++) {
				cdOffering[i] = new CDOffering(offerings[i].getTerm(), offerings[i].getInterestRate());
			}
		}
	}

	static long getNextAccountNumber() {
		return 0;
	}


	static double totalBalances() {
		
		double balance = 0.0;
		for(int i = 0; i<accountHolders.length;i++) {
			balance += accountHolders[i].getCheckingBalance()+accountHolders[i].getCDBalance()+accountHolders[i].getSavingsBalance();
		}
		return balance;
	}


	static double futureValue(double presentValue, double interestRate, int term) {
		double futureAmount = presentValue * (Math.pow(1 + interestRate,term));
		return futureAmount;
	}

}

