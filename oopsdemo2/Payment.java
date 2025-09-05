package oopsdemo2;

/**
* Author  : Vedant.Raturi
* Date    : Sep 4, 2025
* Time    : 12:33:16 PM
* Project : CoreJava
/*
	 * Airline Booking System to demonstrate Composition (Has-A relationship).
	👉 In this case:

	A Booking has-a Payment.

	When the Booking object is destroyed, the Payment object is also destroyed 
	(strong lifecycle dependency → Composition).
	 */

	//Payment class (cannot exist without Booking)

public class Payment {
	private String paymentId;
    private double amount;
    private String mode;  // e.g., Credit Card, UPI, NetBanking
    
    //Constructor
	public Payment(String paymentId, double amount, String mode) {
		this.paymentId = paymentId;
		this.amount = amount;
		this.mode = mode;
	}
	
	
	    
	    
	public void displayPayment() {
	        System.out.println("Payment ID: " + paymentId);
	        System.out.println("Amount: " + amount);
	        System.out.println("Mode: " + mode);
	    }
    
    
}
