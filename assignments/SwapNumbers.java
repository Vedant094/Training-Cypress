package assignments;
//Java program to swap two numbers without a third variable
public class SwapNumbers {

	public static void main(String[] args) {
		int a=5,b=4;
		System.out.println("The values of two numbers before swapping are: a = "+a+" b = "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("The values of two numbers after swapping are: a = "+a+" b = "+b);
		
		
		

	}

}
