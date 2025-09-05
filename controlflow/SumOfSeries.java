package controlflow;

import java.util.Scanner;

/**
* Author  : Vedant.Raturi
* Date    : Sep 1, 2025
* Time    : 12:39:39 PM
* Project : CoreJava
* Program to find Sum of Series . 1+2+3+ .....+n
*/

public class SumOfSeries {

	public static void main(String[] args) {
		int i=1,n,sum=0;
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter Value of N : ");
        n=scanner.nextInt();
        scanner.close();
        
        while(i<=n) {
        	sum=sum+i;
        	i=i+1;
        	
        }
        System.out.println("The Sum of Series of : "+n+" is :"+sum);

	}

}
