package com.workshop2;

public class SavingsAccount {

	private double savingBalance;
	static private double annualInterestRate;

	public SavingsAccount(double savingBalance) {
		this.savingBalance = savingBalance;
	}

	// Get saving balance
	public double getSavingBalance() {
		return this.savingBalance;
	}

	public static void getInterestRate(double newInterestRate) {
		annualInterestRate = newInterestRate;
	}

	public static double annualInterestRate(double rate) {
		double annualInterestRate = rate / 100;
		return annualInterestRate;
	}

	public void calculateMonthlyInterest() {
		System.out.println("Current savings balance: " + this.savingBalance);
		double monthlyInterest;
		monthlyInterest = (double) (this.savingBalance * annualInterestRate / 12);
		this.savingBalance += monthlyInterest;
		System.out.println("New savings balance: " + this.savingBalance);

	}

}
