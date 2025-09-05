
package controlflow;

import java.util.Scanner;

/**
 * Author  : Vedant.Raturi
 * Date    : Sep 1, 2025
 * Time    : 10:21:56 AM
 * Project : CoreJava
 * Program to find greatest of 3 numbers
 */

public class Greatest3 {
	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		int num1, num2 , num3;

		System.out.println("Enter 3 Numbers :");
		num1=scanner.nextInt();
		num2=scanner.nextInt();
		num3=scanner.nextInt();

		if(num1>num2 && num1>num3) {
			System.out.println(num1+" is the greatest");
		}
		else if(num2>num3) {
			System.out.println(num2+" is the greatest");
		}
		else if(num1==num2 && num2==num3) {
			System.out.println("All numbers are equal");
		}
		else {
			System.out.println(num3+" is the greatest");
		}

		scanner.close();
	}
}
