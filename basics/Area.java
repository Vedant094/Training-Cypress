package basics;
/**
 * This program calculates the area of as circle.
 * It demonstrates the use of variables, arithmetic operations,
 * and console output in Java.
 */
public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double radius=7.5;//Radius of the Circle
		double area;//Variable to store the area
		final double PI=3.14159;//Constant vale for Pi
		
		//Calculate the area of the Circle
		
		area=PI*radius*radius;
		
		System.out.println("The area of Circle with radius "+radius +" is: "+area);
	}
 
	
}
