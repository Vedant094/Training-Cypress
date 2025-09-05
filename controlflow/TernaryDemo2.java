package controlflow;

import java.util.Scanner;

/**
* Author  : Vedant.Raturi
* Date    : Sep 1, 2025
* Time    : 11:51:57 AM
* Project : CoreJava
* Program to Check whether entered alphabet using Ternary Operator
*/

public class TernaryDemo2 {

	public static void main(String[] args) {
		char myChar;
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter a Character :");
        myChar=scanner.next().charAt(0); // Take Single character Input

        // Ternary Operator
        String output=(myChar>='a' && myChar<='z') || (myChar>='A' && myChar<='Z')?
        		myChar+" is an Alphabet":myChar+" is not an Alphabet";
        System.out.println(output);
        scanner.close();
	}

}
