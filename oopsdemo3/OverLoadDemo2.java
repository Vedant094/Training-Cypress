package oopsdemo3;

/**
* Author  : Vedant.Raturi
* Date    : Sep 4, 2025
* Time    : 2:59:08 PM
* Project : CoreJava
*Java program for product storage and management
*/

public class OverLoadDemo2 {

	public static void main(String[] args) {
		Outlet outlet=new Outlet();
		 System.out.println("---------------------------------------------");
	        //Add Product with only Name & price
	        outlet.addProduct("T-Shirt",20.50);
	         //outlet.addProduct("T-Shirt",20.50);
	        System.out.println("---------------------------------------------");
	        //Add Product with only Name ,price, quantity
	        outlet.addProduct("Jeans",45.50,100);
	        System.out.println("---------------------------------------------");
	        //Add Product with only Name , price, quantity, category
	        outlet.addProduct("Sneakers",75.50,30,"Footwear");
	        System.out.println("---------------------------------------------");

	}

}
