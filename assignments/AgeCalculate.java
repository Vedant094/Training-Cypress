package assignments;

import java.util.Scanner;

public class AgeCalculate {

	public static void main(String[] args) {
		int birthYear=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your year of birth: ");
		birthYear=sc.nextInt();
		final int  CURRENTYEAR=2025;
		
		System.out.println("The age of person born in: "+birthYear+" is "+(CURRENTYEAR-birthYear));
		sc.close();

	}

}
