package controlflow;

import java.util.Scanner;

/**
* Author  : Vedant.Raturi
* Date    : Aug 30, 2025
* Time    : 9:34:00 AM
* Project : CoreJava

* This program calculates the sum and average of 3 numbers which are greater than 100.

*/

public class SumAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1,number2,number3,sum;
		float avg;
		String name;
		Scanner scan=new Scanner(System.in);//Declare Scanner Object
		System.out.println("Enter our organization: ");
		String org=scan.nextLine();
		System.out.println("Enter your name: ");
		name=scan.nextLine();
		System.out.println("Enter number 1: ");
		number1=scan.nextInt();
		System.out.println("Enter number 2: ");
		number2=scan.nextInt();
		System.out.println("Enter number 3: ");
		number3=scan.nextInt();
		
		if((number1>100) && (number2>100) && (number3>100)){
		sum=number1+number2+number3;
		avg=(float)sum/3;
		System.out.println("*****************************");
		System.out.println("The sum of 3 numbers is: "+sum);
		System.out.println("The average of 3 number is: "+avg);
		System.out.println("Coded by "+name+" at "+org+" Training");
		}
		
		else{
			System.out.println("Please enter numbers greater than 100.");
		}
		System.out.println("*****************************");
		      
		scan.close();
	}

}
