package basics;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Author  : Vedant.Raturi
 * Date    : Aug 30, 2025
 * Time    : 10:35:21 AM
 * Project : CoreJava

 */

public class BufferReaderDemo {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		InputStreamReader r=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(r);

		System.out.println("Enter your name");
		String name=br.readLine();

		System.out.println("Enter your age: ");
		int age=Integer.parseInt(br.readLine());

		System.out.println("Enter your salary: ");
		float salary=Float.parseFloat(br.readLine());


		System.out.println("Welcome "+name+" your age is: "+age+" and salary is: "+salary);
	}

}
