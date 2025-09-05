package oopsdemo3;

/**
 * Author  : Vedant.Raturi
 * Date    : Sep 5, 2025
 * Time    : 12:10:05 PM
 * Project : CoreJava

 */

public class HomeLoanFinalDemo {
	public static void main(String[] args) {
		
		//Using RBI Rules
		
		RBI rbi =new RBI();
		rbi.showRBIGuidelines();
		
		//Creating customer home loans
		HomeLoan loan1=new HomeLoan("Alice", 3000000, 1000);
		HomeLoan loan2=new HomeLoan("Bob", 5000000, 15000);
		
		loan1.showLoanDetails();
		System.out.println("-------------");
		loan2.showLoanDetails();
	
		
		// ❌ ERROR if you try to modify final variable
        // RBI.MIN_HOME_LOAN_RATE = 7.0;  // Not allowed
        // loan1.PROCESSING_FEE = 20000;  // Not allowed
		
	}
}
