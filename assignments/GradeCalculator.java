package assignments;

import java.util.Scanner;

public class GradeCalculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int grade=0;
		System.out.println("Enter your marks: ");
		grade=sc.nextInt();
		if(grade<0 || grade>100) {
			System.out.println("Please Enter valid marks.");
		}
		else {
			if(grade>=90) {
				System.out.println("Your grade is A");
			}
			else if(grade>=80) {
				System.out.println("Your grade is B");
			}
			else if(grade>=70) {
				System.out.println("Your grade is C");
			}
			else if(grade>=60) {
				System.out.println("Your grade is D");

			}
			else {
				System.out.println("Your grade is F");
			}
			
		}
		sc.close();

	}

}
