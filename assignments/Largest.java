package assignments;

import java.util.Scanner;

public class Largest {

	public static void main(String[] args) {
		int a,b,c;
		System.out.println("Enter the value of a,b and c: ");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if(a==b && b==c) {
			System.out.println("A,B and C are equal");
		}
		else if(a>b && a>c) {
			System.out.println("A is the largest");
		}
		else if(b>a && b>c) {
			System.out.println("B is the largest");
		}
		else {
			System.out.println("C is the largest");
		}
		sc.close();
	}

}
