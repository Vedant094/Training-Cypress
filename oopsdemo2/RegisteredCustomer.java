package oopsdemo2;

/**
* Author  : Vedant.Raturi
* Date    : Sep 4, 2025
* Time    : 10:48:52 AM
* Project : CoreJava
//child class of Customer
*/

public class RegisteredCustomer extends Customer1 {
	private  int customerId;
    private String[] cart;
    private int cartSize;
    
    //Constructor
	public RegisteredCustomer(String name, String email, int customerId) {
		super(name, email);
		this.customerId = customerId;
		this.cart = new String[20]; //Registered Constructor can add 20 items to cart
		this.cartSize = 0;
	}
	 public void displayCustomerInfo() {
	        System.out.println("Customer ID: " + customerId);
	        super.display();
	    }

	    public void addToCart(String item) {
	        if (cartSize < cart.length) {
	            cart[cartSize] = item;
	            cartSize++;
	            System.out.println(item + " added to cart.");
	        } else {
	            System.out.println("Cart is full. Cannot add more items.");
	        }
	    }

	    public void displayCart() {
	        System.out.println("Items in Cart:");
	        for (int i = 0; i < cartSize; i++) {
	            System.out.println(cart[i]);
	        }
	    }
    
    
}	
