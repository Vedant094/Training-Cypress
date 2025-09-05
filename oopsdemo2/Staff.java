package oopsdemo2;

/**
* Author  : Vedant.Raturi
* Date    : Sep 4, 2025
* Time    : 10:10:06 AM
* Project : CoreJava

*/

public class Staff {
	private int staffId;
    private String name;
    protected float basic,hra;     //protected variables can be accessed in Child class
    
    
    
    public Staff(int staffId, String name, float basic) {
		this.staffId = staffId;
		this.name = name;
		this.basic = basic;
	}
	void getHRA() {
        hra=(basic*60)/100;
        System.out.println("HRA :"+hra);
    }
    void display() {
        System.out.println(staffId+" "+name+" "+basic);
    }
    void printSal() {
        System.out.println("Total basic : "+(basic+hra));
    }
}

//Manager is a Staff

class Manager extends Staff{
	protected float da;
    private float gross;
    
    //Constructor
    public Manager(int staffId, String name, float basic) {
		super(staffId, name, basic);
	}
	
	void getDA() {
        da=(basic*60)/100;
        System.out.println("Dearness Allowance : "+da);
    }
   
	void print() {
        gross=basic+hra+da;
        System.out.println("Total basic of Manager : "+gross);
    }
   
}
//Staff -> Manager -> Director - Multilevel Inheritance
class Director extends Manager{
	private float ta,gross;
	
	//Constructor
	public Director(int staffId, String name, float basic) {
		super(staffId, name, basic);
	}
	
	void getTA() {
        ta=(basic*30)/100;
        System.out.println("Travelling Allowance : "+ta);
    }
    void print() {
        gross=basic+hra+da+ta;
        System.out.println("Total basic of Director : "+gross);
    }
	
}
