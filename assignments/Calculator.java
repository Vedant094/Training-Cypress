package assignments;
//Program to implement the features of a calculator
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		int a=10,b=5,choice=0;
		Scanner sc=new Scanner(System.in);

		do {
			System.out.println("Enter your choice: ");
			System.out.println("Press enter 1 for additon: ");
			System.out.println("Press enter 2 for subtraction: ");
			System.out.println("Press enter 3 for multiplication: ");
			System.out.println("Press enter 4 for division: ");
			System.out.println("Press enter 5 to exit: ");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("The addition of a and b are: "+(a+b));
				break;
				
			case 2:
				System.out.println("The substraction of a and b are: "+(a-b));
				break;

			case 3:
				System.out.println("The product of two numbers a and b: "+(a*b));
				break;

			case 4:
				if(b==0) {
					System.out.println("Second value cannot be zero.");
				}
				else {
					System.out.println("The division of a and b is: "+(float)(a/b));
				}
				break;
				
			default:
				System.out.println("Invalid choice.");

			}

		}while(choice==1);
		sc.close();
	}

}
