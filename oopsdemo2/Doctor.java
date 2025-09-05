package oopsdemo2;
//Java program to implement Hierarchical Inheritance
/**
* Author  : Vedant.Raturi
* Date    : Sep 4, 2025
* Time    : 10:35:36 AM
* Project : CoreJava

*/

public class Doctor {
	int idNumber;
	String name;
	String address;
	
	//Constructor
	public Doctor(int idNumber, String name, String address) {
		this.idNumber = idNumber;
		this.name = name;
		this.address = address;
	}
	
	 void display() {
			System.out.println("********* Doctor Details ***********");
	        System.out.println("The name is :" + name);
	        System.out.println("The number is :" + idNumber);
	        System.out.println("The address is :" + address);
	   }
}

class Specialist extends Doctor{
	
	String speciality;

	public Specialist(int idNumber, String name, String address, String speciality) {
		super(idNumber, name, address);
		this.speciality = speciality;
	}

	
	void display() {
		super.display();
		System.out.println("The Speciality is : "+speciality);
	}
	
	
	
	
}



class NonSpecialist extends Doctor{

	public NonSpecialist(int idNumber, String name, String address) {
		super(idNumber, name, address);
	}
	
}
