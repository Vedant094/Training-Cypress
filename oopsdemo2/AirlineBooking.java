package oopsdemo2;

import java.util.Scanner;

/**
 * Author  : Vedant.Raturi
 * Date    : Sep 3, 2025
 * Time    : 4:45:04 PM
 * Project : CoreJava

 */

public class AirlineBooking extends Passenger {


	String flightName;
	String fromCity;
	String toCity;
	int seatNo;
	float ticketPrice;

	Scanner scanner=new Scanner(System.in);

	//generate constructor for only super class
	public AirlineBooking(String name, int age, String passportNumber) {
		super(name, age, passportNumber);
		// TODO Auto-generated constructor stub
	}

	void bookTicket() {
		System.out.println("Enter Flight Name :");
		flightName = scanner.next();
		System.out.println("Enter From City :");
		fromCity = scanner.next();
		System.out.println("Enter To City :");
		toCity = scanner.next();
		System.out.println("Enter Seat No :");
		seatNo = scanner.nextInt();
		System.out.println("Enter Ticket Price :");
		ticketPrice = scanner.nextFloat();
	}

	void displayBookingDetails() {
		System.out.println("************* Booking Details ***********");
		System.out.println("Flight Name  :  " + flightName);
		System.out.println("From City    :  " + fromCity);
		System.out.println("To City      :  " + toCity);
		System.out.println("Seat No      :  " + seatNo);
		System.out.println("Ticket Price :  " + ticketPrice);
	}






}
