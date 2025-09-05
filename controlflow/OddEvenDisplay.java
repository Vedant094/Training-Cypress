package controlflow;

/**
* Author  : Vedant.Raturi
* Date    : Sep 1, 2025
* Time    : 12:51:11 PM
* Project : CoreJava
* Program to display Odd & Even Numbers between 1-10
 *
 * ODD  EVEN
 * ---  ----
 * 1    2
 * 3    4
 * 5    6
 * 7    8
 * 9    10
*/

public class OddEvenDisplay {

	public static void main(String[] args) {
		int i=1;
		System.out.println("Odd     Even");
		while(i<=10) {
			if(i%2!=0){
				System.out.print(i+"\t");
			}
			else{
				System.out.println(i);
			}
			i=i+1;
		}

	}

}
