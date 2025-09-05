package controlflow;

import java.util.Scanner;

/**
* Author  : Vedant.Raturi
* Date    : Sep 1, 2025
* Time    : 3:09:38 PM
* Project : CoreJava
// Program to display Multiplication Table of a number
*/

public class Multiplication {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n;
		System.out.println("Enter the value of n: ");
		n=scan.nextInt();
		System.out.println("Multiplication table of: "+n);
		for (int i = 1;  i<=10; i++) {
			System.out.println(n+" * "+i+" = "+ n*i);
		}
		scan.close();
	}

}
