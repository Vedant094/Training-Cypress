package controlflow;

/**
* Author  : Vedant.Raturi
* Date    : Sep 1, 2025
* Time    : 2:54:13 PM
* Project : CoreJava
// For Loop Demonstration -
// use For Loop, when u want to execute a loop fixed no. of times
*/

public class ForDemo {

	public static void main(String[] args) {
		int i ,j;
		System.out.println("Display nos from 1-25");
		for (i=1; i <=25; i++) {
			System.out.println(i+"\t");	
		}
		System.out.println();
		System.out.println("Display Nos from 100-75");
		for (j = 100;  j>=75; j--) {
			System.out.println(j+"\t");
		}
	}

}
