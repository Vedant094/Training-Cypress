package assignments;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		int number;
		int reversed=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		number=sc.nextInt();
		System.out.println("The number before reversing is: "+number);
		System.out.println();
		while(number!=0) {
			int digit=number%10;
			reversed=reversed*10+digit;
			number=number/10;
		}
		System.out.println("The number after reversing is: "+reversed);
		
		sc.close();
	}

}
