package oopsdemo3;

/**
* Author  : Vedant.Raturi
* Date    : Sep 4, 2025
* Time    : 4:14:45 PM
* Project : CoreJava

*/

public class SavingsAccount extends Account {
	private double interestRate;
	
	//Constructor
	public SavingsAccount(String name, double balance, double interestRate) {
		super(name, balance);
		this.interestRate = interestRate;
	}
}

class CheckingAccount extends Account{
	private double overDraft; //pre-sanctioned loan
	
	//Constructor
	public CheckingAccount(String name, double balance, double overDraft) {
		super(name, balance);
		this.overDraft = overDraft;
	}

	@Override
	public void withdraw(double amt) {
		System.out.println("Overdraft Amount: " + overDraft);
        if (amt <= balance) {
            balance -= amt;
            System.out.println("Withdrawing: " + amt);
        } else if ((amt > balance) && (amt > (balance + overDraft))) {
            System.out.println("Sorry! You cannot withdraw");
        } else {
            double result = amt - balance;
            overDraft -= result;
            balance = 0;

            System.out.println("Withdrawing: " + amt);
            System.out.println("Current Overdraft Amount: "
                    + overDraft);
        }
	}
}
