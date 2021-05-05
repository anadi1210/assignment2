package com.meritamerica.assignment2;

public class CDOffering {

	private int term;
	private double interestRate;
	
	public CDOffering() {
		
	}
	
	CDOffering(int term, double interestRate) {
		this.term = term;
		this.interestRate = interestRate;
	}
	
	public int getTerm() {
		return term;
	}
	public void setTerm(int term) {
		this.term = term;
	}
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	

}
