package assignments;

import java.util.Scanner;

public class ItCity {

	public static void main(String[] args) {
		String city;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the city: ");
		city=sc.nextLine();
		if(city.equals("Delhi") || city.equals("Mumbai" )|| city.equals("Kolkata")|| city.equals("Bangalore")|| city.equals("Chennai")|| city.equals("Hyderabad")) {
			System.out.println("Entered city is an IT city");
		}
		else {
			System.out.println("Entered city is not an IT city");
		}
		sc.close();
	}

}
