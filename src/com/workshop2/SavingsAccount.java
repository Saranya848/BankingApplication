package com.workshop2;

public class SavingsAccount {
	/**
	 * getSavingsBalance - it returns the savings balance amount
	 * modifyInterestRate -  it modifies the interest with new interest
	 * getAnnualInterestRate - it returns the interest rate
	 * calculateMonthlyInterest -  calculate monthly interest
	 * 
	 */
	private double savingBalance;
	static private double annualInterestRate;

	/**
	 * Saving constructor
	 * 
	 * @param savingBalance
	 */
	public SavingsAccount(double savingBalance) {
		this.savingBalance = savingBalance;
	}

	/**
	 * returns the savings balance amount
	 * 
	 * @return
	 */
	// Get saving balance
	public double getSavingBalance() {
		return this.savingBalance;
	}

	/**
	 * modifies the interest with new interest
	 * 
	 * @param newInterestRate
	 */
	public static void getInterestRate(double newInterestRate) {
		annualInterestRate = newInterestRate;
	}

	/**
	 * returns the interest rate
	 * 
	 * @param rate
	 * @return
	 */
	public static double annualInterestRate(double rate) {
		double annualInterestRate = rate / 100;
		return annualInterestRate;
	}

	/**
	 * calculate monthly interest
	 */
	public void calculateMonthlyInterest() {
		System.out.println("Current savings balance: " + this.savingBalance);
		double monthlyInterest;
		monthlyInterest = (double) (this.savingBalance * annualInterestRate / 12);
		this.savingBalance += monthlyInterest;
		System.out.println("New savings balance: " + this.savingBalance);

	}

}
