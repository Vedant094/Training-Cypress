package controlflow;

import java.util.Scanner;

/**
* Author  : Vedant.Raturi
* Date    : Sep 1, 2025
* Time    : 9:37:07 AM
* Project : CoreJava
* Program to find greatest of 2 numbers
*/

public class Greatest2 {

	public static void main(String[] args) {
		int a,b;
		
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter 2 numbers: ");
		a=scan.nextInt();
		b=scan.nextInt();
		
		if(a>b) {
			System.out.println(a+" is the Greatest");
		}
		
		else {
			System.out.println(b+" is the Greatest");
		}
		scan.close();
	}

}
