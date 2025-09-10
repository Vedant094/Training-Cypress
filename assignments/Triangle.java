package assignments;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		int side1,side2,side3;
		System.out.println("Enter the values for the three sides of traingle: ");
		Scanner sc=new Scanner(System.in);
		side1=sc.nextInt();
		side2=sc.nextInt();
		side3=sc.nextInt();
		if(side1==side2 && side2==side1) {
			System.out.println("The triangle is an Equilateral Triangle.");
		}
		else if(side1==side2 || side1==side3 ||side2==side3) {
			System.out.println("The triangle is an Isoceles Triangle.");
		}
		else {
			System.out.println("The triangle is a Scalene Triangle.");
		}
		sc.close();

	}

}
