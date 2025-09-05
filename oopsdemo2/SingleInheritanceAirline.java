package oopsdemo2;

/**
* Author  : Vedant.Raturi
* Date    : Sep 3, 2025
* Time    : 4:54:31 PM
* Project : CoreJava

*/

public class SingleInheritanceAirline {

	public static void main(String[] args) {
		//Create booking(child class object)
		AirlineBooking booking1=new AirlineBooking("James Gosling",32,"FG567766");
		
		booking1.bookTicket();
		booking1.displayPassengerDetails();
		booking1.displayBookingDetails();
		
		//create booking(Child class object)
		AirlineBooking booking2=new AirlineBooking("Rod Johnson",32,"ZWER34567");
		
		booking2.bookTicket();
		booking2.displayPassengerDetails();
		booking2.displayBookingDetails();
		

	}

}
