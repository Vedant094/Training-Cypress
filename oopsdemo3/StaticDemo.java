package oopsdemo3;

/**
* Author  : Vedant.Raturi
* Date    : Sep 5, 2025
* Time    : 11:31:46 AM
* Project : CoreJava

*/
class Count{
	 
	private static int cnt; //Static Variable
	private int a; //instance variable
	
	
	public Count() {
		cnt++;
		a=100;
	}

	//static method-It can use only static variables
	public static void display() {
		System.out.println("The Number of objects created: "+cnt);
		//a=a+10;
	}
	
	 public void print(){
	        System.out.println("Instance Method Variable : "+a);
	 }
	}
public class StaticDemo {
	public static void main(String[] args) {
		
	
	Count c1=new Count();
	Count c2=new Count();
	Count c3=new Count();
	Count c4=new Count();
	c1.print(); //Invokes Instance Methods
	
	Count.display();
}
}

