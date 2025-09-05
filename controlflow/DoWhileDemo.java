package controlflow;

import java.util.Scanner;

/**
* Author  : Vedant.Raturi
* Date    : Sep 1, 2025
* Time    : 2:19:38 PM
* Project : CoreJava
* Program to enter a Positive Number & display it
*/

public class DoWhileDemo {

	public static void main(String[] args) {
		
		 int number;
	        Scanner scanner=new Scanner(System.in);

	        do{
	            System.out.println("Enter a Number : ");
	            number=scanner.nextInt();
	            System.out.println(number);
	        }while(number>0);
	        scanner.close();
	        System.out.println("The Entered Number is : "+number);
	}

}
