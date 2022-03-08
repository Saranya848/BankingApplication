package com.workshop2;

public class Main {

	public static void main(String[] args) {
		SavingsAccount saver1, saver2;
		saver1 = new SavingsAccount(2000);
		saver2 = new SavingsAccount(3000);
		/**
		 * Procedure
		 * Call method monthlyInterset
		 * Printing updated balance of two savers
		 * 
		 */

		/**
		 * Set the annual interest rate to 4%=0.04
		 */
		SavingsAccount.getInterestRate(0.04);

		/**
		 * calling Calculate monthly interest
		 */
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();

		/**
		 * 
		 * Print out the new balances for both savers
		 */
		System.out.println("This month:\nSaver 1 balance= " + saver1.getSavingBalance());
		System.out.println("Saver 2 balance= " + saver2.getSavingBalance());

		/**
		 * Change annual interest rate to 5%=0.05
		 */
		SavingsAccount.getInterestRate(0.05);

		/**
		 * Calculate the next monthly interest rate
		 */
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();

		/**
		 * 
		 * Print out the new balances for both savers
		 */
		System.out.println("Next month:\nSaver 1 balance= " + saver1.getSavingBalance());
		System.out.println("Saver 2 balance= " + saver2.getSavingBalance());
	}

}
