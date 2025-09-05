package oopsdemo2;

/**
* Author  : Vedant.Raturi
* Date    : Sep 4, 2025
* Time    : 9:54:59 AM
* Project : CoreJava
* Multilevel inheritance 
* ACcount-->SavingsBank-->AccountDetails
*/

public class AccountDetails extends SavingsBank {
	//child class of Savings Bank
	 
	 int withdrawl,deposit,finalBalance;

	public AccountDetails(int accNo, String name, int min_bal, int balance, int withdrawl, int deposit) {
		super(accNo, name, min_bal, balance);
		this.withdrawl = withdrawl;
		this.deposit = deposit;
		
	}
	 
	void display()
    {
            super.display(); // invokes savings bank display()method
            System.out.println ("Deposit: "+deposit);
            System.out.println ("Withdrawals: "+withdrawl);
            finalBalance=(balance+deposit)-withdrawl;
            System.out.println("Final Balance:" + finalBalance);
    }
}
