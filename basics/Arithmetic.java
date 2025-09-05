package basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
* Author  : Vedant.Raturi
* Date    : Aug 30, 2025
* Time    : 11:25:53 AM
* Project : CoreJava
* Program to perform Arithmetic Operations using BufferedReader Input
*/

public class Arithmetic {

	public static void main(String[] args) throws IOException {
		//Declaration of variables
		int a, b, sum, sub, mul;
		float div;
		String name;
		
		//BufferedReader for input
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		//Input Statement - Take Input using BufferedReader
		System.out.println("Enter 2 Numbers :");
		a=Integer.parseInt(br.readLine());
		b=Integer.parseInt(br.readLine());
		
		System.out.println("Enter your name: ");
		name=br.readLine(); //Accepts multiple words directly
		
		
		//Process
		sum = a + b;
		sub = a - b;
		mul = a * b;
		div=(float)a / b;
		
		System.out.println("The sum of two numbers is: "+sum);
		System.out.println("The difference of two numbers is: "+sub);
		System.out.println("The product of two numbers is: "+mul);
		System.out.println("The division of two numbers is: "+div);
		System.out.println("Coded by: "+name);
		
	}

}
