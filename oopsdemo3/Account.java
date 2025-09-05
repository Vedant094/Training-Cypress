package oopsdemo3;

/**
* Author  : Vedant.Raturi
* Date    : Sep 4, 2025
* Time    : 4:09:12 PM
* Project : CoreJava

*/

public class Account {
	private String name;
    protected double balance;
	
    //Using constructors to assign/initialize values for properties
    //Hence not using setter() methods

    public Account(String name, double balance) {
		this.name = name;
		this.balance = balance;
	}
    
    
    //Generate only getters
	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}
	//final methods cannot be overridden
	
	final void deposit(double amt) {
		balance+=amt;
		System.out.println("Depositing: "+amt);
	}
	
	 public void withdraw(double amt){
	        balance-=amt;
	        System.out.println("Withdrawing :"+amt);
	    }
    
}
