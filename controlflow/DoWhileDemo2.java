package controlflow;

import java.util.Scanner;

/**
* Author  : Vedant.Raturi
* Date    : Sep 1, 2025
* Time    : 2:22:07 PM
* Project : CoreJava
* Display nos from 20 to 50 and guess the name.
*/

public class DoWhileDemo2 {

	public static void main(String[] args) {
		int i=20;
		do {
			System.out.print(i+"\t");
			i=i+1;
		} while (i<=50);
		System.out.println();
		System.out.println("*************Guess Names*************");
		String guess;
		Scanner scanner=new Scanner(System.in);
	
		do {
			System.out.println("Guess My Name: ");
			guess=scanner.next();
		} while (!"James".equals(guess));
		System.out.println("Congratulations you guessed name correctly!!!! "+guess);
		scanner.close();
	}

}
