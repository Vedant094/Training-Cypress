package controlflow;

import java.util.Scanner;

/**
* Author  : Vedant.Raturi
* Date    : Sep 1, 2025
* Time    : 10:10:00 AM
* Project : CoreJava
* Program to check whether entered number is single digit or not.
*/

public class SingleDigit {

	public static void main(String[] args) {
		int num;
		
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the number: ");
		num=scan.nextInt();
		if(num>-10 && num<10) {
			System.out.println(num+" is a single digit number");
		}
		else {
			System.out.println(num+" is not a single digit number");
		}
		
		scan.close();
	}

}
