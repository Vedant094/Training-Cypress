package oopsdemo3;

/**
* Author  : Vedant.Raturi
* Date    : Sep 4, 2025
* Time    : 2:36:13 PM
* Project : CoreJava
*Program to demonstrate Method Overloading. - Static Polymorphism
 *
 * Overload add() method with different type/no. of Arguments
*/
class Addition{
	public void add() {
		System.out.println("Method Overloading Demo: ");
	}
	public void add(int a,int b) {
		System.out.println("The Addition of 2 Nos: "+(a+b));
	}
	public void add(float a,float b) {
		System.out.println("The Addition of 2 float Nos: "+(a+b));
	}
	public void add(int a,int b,int c) {
		System.out.println("The Addition of 3 Nos: "+(a+b+c));
	}
	public void add(String s1,String s2) {
		System.out.println("The Addition of 2 Strings: "+(s1+s2));
	}
	
}
public class OverLoadDemo {

	public static void main(String[] args) {
		Addition a1=new Addition();
		
		//Invoke Overloaded add() method
		
		a1.add();
		a1.add(10, 45);
		a1.add(44.6f, 5.4f);//Type Promotion -float-> double
		a1.add("vedant","raturi");
		a1.add(34,56,10);
		
		
	}

}
