package controlflow;

import java.util.Scanner;

/**
* Author  : Vedant.Raturi
* Date    : Sep 1, 2025
* Time    : 3:00:35 PM
* Project : CoreJava
* // Program to find Factorial of a Number
*/

public class Factorial {

	public static void main(String[] args) {
		int num, fact=1;
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter a Number : ");
        num=scanner.nextInt();
        scanner.close();

        for (int i = 1; i <=num; i++) {
           fact*=i;
        }
        System.out.println("The Factorial of "+num+" is: "+fact);

	}

}
