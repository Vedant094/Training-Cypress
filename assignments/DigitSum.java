package assignments;

import java.util.Scanner;

public class DigitSum {

	public static void main(String[] args) {
		int number;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		number=sc.nextInt();
		int sum=0,temp;
		while(number!=0) {
			temp=number%10;
			sum=sum+temp;
			number=number/10;
		}
		System.out.println("The sum of digits of the number entered is: "+sum);
		sc.close();
	}

}
