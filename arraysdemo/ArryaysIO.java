package arraysdemo;

import java.util.Arrays;
import java.util.Scanner;

/**
* Author  : Vedant.Raturi
* Date    : Sep 2, 2025
* Time    : 10:01:26 AM
* Project : CoreJava
* Program to enter values in a array and display it
*/

public class ArryaysIO {

	public static void main(String[] args) {
		
		int [] marks= {78,56,23,44,90,67,55,35,84};
		
		System.out.println("**************Array Of Marks*************");
		for (int i = 0; i < marks.length; i++) {
			System.out.println(marks[i]+"\t");
		}
		System.out.println();
		System.out.println("The Size of Array: "+marks.length);
		System.out.println("First Element of Array is: "+marks[0]);
		System.out.println("The last element of Array is: "+marks[marks.length-1]);
		
		//Enter values to array at Run-time
		
		System.out.println("*****************************************");
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter total number of students :");
		int n=scan.nextInt();
		
		int[] marks2=new int[n];//declare array & allocate memory of size n
		System.out.println("Enter the marks for marks2: ");
		for (int i = 0; i < marks2.length; i++) {
			marks2[i]=scan.nextInt();
		}
		
		System.out.println("Marks2 contents: ");
		for (int i = 0; i < marks2.length; i++) {
			System.out.println(marks2[i]+" ");
		}
		
		System.out.println();
		System.out.println("Display marks array without loop: ");
		System.out.println(Arrays.toString(marks2));
		scan.close();
	}

}
