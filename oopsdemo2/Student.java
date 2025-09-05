package oopsdemo2;

/**
* Author  : Vedant.Raturi
* Date    : Sep 4, 2025
* Time    : 11:49:39 AM
* Project : CoreJava

*/
//Student has a Address- Unidirectional Relationship
public class Student {
	int rollNo;
	String name;
	Address ad;//Entity Reference- Aggregation -has a relationship
	
	
	//Constructor
  public Student(int rollNo, String name, Address ad) {
		this.rollNo = rollNo;
		this.name = name;
		this.ad = ad;
	}

  	void display()
	{
		System.out.println("---------- Student Details ------------");
		System.out.println("Student Id   :"+rollNo );
		System.out.println("Student Name :"+name);
		
		System.out.println("Address: "+ad.city+" "+ad.state+" "+ad.country+" "+
		ad.pincode);
	}


  public Student(int rollNo, String name) {
	this.rollNo = rollNo;
	this.name = name;
  }
}
