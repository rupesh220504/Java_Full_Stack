package Day4;

import java.util.Scanner;

public class LoginPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your Name:-");
		String name = scan.nextLine();
		
		System.out.println("Enter your Age:-");
		int age = scan.nextInt();
		
		System.out.println("Enter your Gender:-");
		String gender = scan.nextLine();
		scan.nextLine();
		
		System.out.println("Enter your Mobile No:-");
		String number = scan.next(); 
		
		System.out.println("Enter your Address:-");
		String address = scan.next();
		
		System.out.println("Enter your College Name:-");
		String collegename = scan.next();
		
		System.out.println("Enter your College ID:-");
		String collegeid = scan.next();
		
		System.out.println("Enter your Adhar No:-");
		String adhar = scan.next();
		
		System.out.println("Enter your Email:-");
		String email = scan.next();
		
		
		System.out.println("Enter your Marriagial Status:-");
		String status = scan.next();
		
		System.out.println("Name:-" +name);
		System.out.println("Age:-"+age);
		System.out.println("Gender:-"+gender);
		System.out.println("Mobile No:-"+number);
		System.out.println("Address:-"+address);
		System.out.println("College Name"+collegename);
		System.out.println("College ID:-"+collegeid);
		System.out.println("Adhar No:-"+adhar);
		System.out.println("Email:-"+email);
		System.out.println("Marraigial Status:-"+status);
		
		
		scan.close();

	}

}
