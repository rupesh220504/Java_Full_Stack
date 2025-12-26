package priyadarshini;

import java.util.Scanner;

public class LoginSystemValidation {
	static void authenticate(String user, String pass) { 
		// logic 
		if(!user.equals("Rupesh") || !pass.equals("12345")) {
			throw new IllegalArgumentException("Invalid Login");
			
		}
		System.out.println("Login Successful");
		} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		try {
			System.out.println("Enter a UserName:-");
			String user = scan.next();
			System.out.println("Enter Password:-");
			String pass = scan.next();
			
			authenticate(user,pass);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("Login Attempt Completed");
		}
		scan.close();

	}

}
