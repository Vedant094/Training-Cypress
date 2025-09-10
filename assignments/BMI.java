package assignments;

import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		float weight=0,height=0,BMI=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the weight and height in Kgs and Meters respectively -");
		System.out.println("Enter your weight: ");
		weight=sc.nextFloat();
		System.out.println("Enter your height: ");
		height=sc.nextFloat();
		
		BMI=(weight)/(height*height);
		
		System.out.println("Your BMI is: "+BMI);
		
		sc.close();

	}

}
