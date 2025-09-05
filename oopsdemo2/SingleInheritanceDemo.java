package oopsdemo2;

/**
* Author  : Vedant.Raturi
* Date    : Sep 3, 2025
* Time    : 4:30:19 PM
* Project : CoreJava

*/

public class SingleInheritanceDemo {

	public static void main(String[] args) {
		Developer V=new Developer(121232,"Vedant","JAVA","SDLC");
		Developer A=new Developer(136853,"A","C++","JDBC");
		
		V.displayDeveloperDetails();
		V.display();
		
		A.displayDeveloperDetails();
		A.display();

	}

}
