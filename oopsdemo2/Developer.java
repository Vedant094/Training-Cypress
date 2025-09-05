package oopsdemo2;

/**
* Author  : Vedant.Raturi
* Date    : Sep 3, 2025
* Time    : 4:27:09 PM
* Project : CoreJava

*/

//child class-Inheritance- is a relationship
public class Developer extends Employee{
	private String skillSet;
	private String projectName;
	
	
	public Developer(int empId, String name, String skillSet, String projectName) {
		super(empId, name); //invokes parent class contructor by passing empId and name
		this.skillSet = skillSet;
		this.projectName = projectName;
	}
	
	// method to display developer details
		public void displayDeveloperDetails() {
			System.out.println("Skill Set: " + skillSet);
			System.out.println("Project Name: " + projectName);
		}
}
