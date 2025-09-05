package controlflow;

/**
* Author  : Vedant.Raturi
* Date    : Sep 1, 2025
* Time    : 12:26:34 PM
* Project : CoreJava
* Program to display your name 10 times & nos from 1-10
*/

public class WhileDemo {

	public static void main(String[] args) {
		int i=1; //Loop Initialization
		
		while(i<=10) {// Set a Condition for loop
			System.out.println(i+".Vedant");
			
			i=i+1; //Increment the loop
		}
		System.out.println("Exit Loop");
		
		System.out.println("*****Reverse Loop*****");
		int j=10;
		while(j>=1) {
			System.out.println(j+"\t");
			j=j-1; // Decrement Loop
		}
	}

}
