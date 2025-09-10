package assignments;

import java.util.Scanner;

public class Password {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String password;
		System.out.println("Enter your password: ");
		password=sc.nextLine();
		boolean hasLower=false,hasUpper=false,hasSpecial=false,hasDigit=false;
		
		for(char ch:password.toCharArray()) {
			if(Character.isDigit(ch)) {
				hasDigit=true;
			}
			else if(Character.isUpperCase(ch)) {
				hasUpper=true;
			}
			else if(Character.isLowerCase(ch)) {
				hasLower=true;
			}
			else {
				hasSpecial=true;
			}
		}
		
		if(password.length()>=8 && hasDigit && hasUpper && hasSpecial && hasLower) {
			System.out.println("Password Strength: Strong");
		}
		else if(password.length()>=6 && hasDigit && hasUpper && hasLower) {
			System.out.println("Password Strength: Medium");
		}
		else {
			System.out.println("Password Strength: Weak");
		}
		
		sc.close();

	}

}
