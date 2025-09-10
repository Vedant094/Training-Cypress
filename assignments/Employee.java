package assignments;

public class Employee {
	
	private int salary;
	private int workHours;
	
	public void getInfo(int salary,int workHours) {
		this.salary=salary;
		this.workHours=workHours;
	}
	
	public void addSal() {
		if(this.salary<500) {
			this.salary=this.salary+10;
		}
	}
	public void addWork() {
		if(this.workHours>6) {
			this.salary=this.salary+5;
		}
	}
	public void display(){
		System.out.println("The total Salary of employee is: "+salary);
	}
	

}
