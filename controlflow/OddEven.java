
package controlflow;

import java.util.Scanner;

/**
* Author  : Vedant.Raturi
* Date    : Sep 1, 2025
* Time    : 10:04:44 AM
* Project : CoreJava
* Program to Check entered number is odd or even.
*/

public class OddEven {	
	public static void main(String[] args) {
        int num;
		
        Scanner scan =new Scanner(System.in);
		System.out.println("Enter the number: ");
		num=scan.nextInt();
		
		if(num%2==0) {
			System.out.println(num+" is a even number");
		}
		else {
			System.out.println(num+" is a odd number");
		}
	scan.close();
	}
}
