package assignments;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		int number=0;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		number=sc.nextInt();
		if(number%2==0) {
			System.out.println("The number entered is even");
		}
		else {
			System.out.println("The number entered is odd");
		}
		sc.close();

	}

}
