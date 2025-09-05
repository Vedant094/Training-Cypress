package arraysdemo;

/**
* Author  : Vedant.Raturi
* Date    : Sep 2, 2025
* Time    : 9:39:50 AM
* Project : CoreJava
* to display enhanced for loop
*/

public class EnhancedForLoopDemo {

	public static void main(String[] args) {
		String arr[]= {"Rahul","Rajesh","Mohan","Raj","Mahesh"};
		
		//Enhanced For Loop      
		System.out.println("Enhanced for loop: ");
		System.out.println();
		for(String x:arr) {
			System.out.println(x);
		}
		
		//CLassic For Loop
		System.out.println();
		System.out.println("Classic For Loop: ");
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
