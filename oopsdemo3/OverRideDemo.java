package oopsdemo3;

/**
* Author  : Vedant.Raturi
* Date    : Sep 4, 2025
* Time    : 3:15:24 PM
* Project : CoreJava
Overriding is a feature that allows a subclass or
 * child class to provide a specific implementation of a method
 * that is already provided by one of its super-classes or parent classes.
*/
class Bank{
	 private String name;
	 
	 //constructor
	 public Bank(String name) {
		this.name = name;
	 }
	 
	 int getRateOfInterest(){
	        return 0;
	    }
	  void display(){
	        System.out.println("Welcome to "+name+" Bank");
	    }	 
}

class SBI extends Bank{

	public SBI(String name) {
		super(name);
	}

	@Override
	int getRateOfInterest() { //method overridden in child class
		
		return 5;
	}
	
}

class ICICI extends Bank{

	public ICICI(String name) {
		super(name);
	}

	@Override
	int getRateOfInterest() { //method overridden in child class
		
		return 7;
	}
}

class AXIS extends Bank{

	public AXIS(String name) {
		super(name);
	}

	@Override
	int getRateOfInterest() { //method is overridden in child class
		return 6;
	}
}
public class OverRideDemo {

	public static void main(String[] args) {
		SBI s=new SBI("V");
		int a=s.getRateOfInterest();
		s.display();
		System.out.println("Rate of Interest of SBI: "+a);
		
		ICICI i=new ICICI("VE");
		int b=i.getRateOfInterest();
		i.display();
		System.out.println("Rate of Interest of ICICI: "+b);
		
		AXIS x=new AXIS("R");
		int c=x.getRateOfInterest();
		x.display();
		System.out.println("Rate of Interest of AXIS: "+c);
	}

}
