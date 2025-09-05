package oopsdemo2;

/**
* Author  : Vedant.Raturi
* Date    : Sep 4, 2025
* Time    : 9:48:29 AM
* Project : CoreJava
* Multi level Inheritance
*/

public class Account {
	int accNo;
	String name;
	
	//Constructor
	public Account(int accNo, String name) {
		this.accNo = accNo;
		this.name = name;
	}
	
	void display()
	{
		System.out.println("************ Account Details ************");
		System.out.println("Account Number :"+accNo);
		System.out.println("Customer Name :"+name);
	}
}
