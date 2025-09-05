package oopsdemo2;

/**
* Author  : Vedant.Raturi
* Date    : Sep 4, 2025
* Time    : 10:47:09 AM
* Project : CoreJava
//Hierarchical Inheritance Demo
*/

public class Customer1 {
	private String name;
    private String email;
    
    //Constructor
    public Customer1(String name, String email) {
		this.name = name;
		this.email = email;
	}


	public void display(){
        System.out.println("********** Customer Details ************");
        System.out.println("Customer Name    : "+name);
        System.out.println("Email            : "+email);
    }
}
