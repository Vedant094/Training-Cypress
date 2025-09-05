package oopsdemo2;

/**
* Author  : Vedant.Raturi
* Date    : Sep 3, 2025
* Time    : 4:18:53 PM
* Project : CoreJava
Single Inheritance Example
*/

public class Employee {
	private int empId;
	private String name;
	
	//Constructor
	public Employee(int empId, String name) {
		this.empId = empId;
		this.name = name;
	}
	
	void display()
	{
		System.out.println("********** Employee Details ***************");
		System.out.println("Employee Id :"+empId);
		System.out.println("Employee Name: "+name);
	}
	
}

