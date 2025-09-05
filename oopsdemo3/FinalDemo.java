package oopsdemo3;

/**
* Author  : Vedant.Raturi
* Date    : Sep 5, 2025
* Time    : 11:54:49 AM
* Project : CoreJava
/*
Final Variable - Variable’s content cannot be modified
Final Method - A final method cannot be overridden. 
Final Class - Cannot extend a Final class
*/
final class Hello{
	final void display() {
		System.out.println("This is final method");
	}
}

//class World extends Hello{ //final classes cannot be extended
// 	//final methods cannot be overridden
//	final void display() {
//		System.out.println("This is a final method");
//	}
//}
public class FinalDemo {
	public static void main(String[] args) {
		
		final int AGE=20;
		final float PI=3.142f;
		
		//AGE=30;   //compilation error- final variable values cannot be changed
		
	}
}
