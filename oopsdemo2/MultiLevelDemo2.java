package oopsdemo2;

/**
* Author  : Vedant.Raturi
* Date    : Sep 4, 2025
* Time    : 10:25:33 AM
* Project : CoreJava

*/

public class MultiLevelDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Director d1=new Director(101,"Keane Raeves", 5000);
		//Director will have basic+hra+da+ta
        System.out.println("************** Director Details ****************");
        d1.display(); // Staff - Director is a Manager/Staff
        d1.getHRA();  // Staff
        d1.getDA(); //Manager
        d1.getTA(); //Director
        d1.print(); //Director

        Manager m1=new Manager(201,"Mary Kenneth",4000);
        //Manager will have basic+hra+da
        System.out.println("************** Manager Details ****************");
        m1.display(); // Staff -Manager is a Staff
        m1.getHRA();  // Staff
        m1.getDA(); //Manager
        m1.print(); //Manager

       Staff s1=new Staff(301,"Helen Mark",2000) ;
        //Staff will have basic +hra
       System.out.println("************* Staff Details ******************");
       s1.display();
       s1.getHRA();
       s1.printSal();
	}

}
