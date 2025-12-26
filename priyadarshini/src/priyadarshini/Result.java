package priyadarshini;

import java.util.Scanner;

class Result { 
static void checkMarks(int marks) { 
// validation logic 
	if(marks < 0 || marks > 100) {
		throw new IllegalArgumentException("Invalid Marks");
	}
	if(marks >= 40) {
		System.out.println("Pass");
	}else {
	   System.out.println("Fail");
	}
	
	
} 
public static void main(String[] args) { 
// call method
	Scanner scan = new Scanner(System.in);
	try {
		System.out.println("Enter a marks");
		int marks = scan.nextInt();
		checkMarks(marks);
	}catch(IllegalArgumentException e) {
		System.out.println(e.getMessage());
	}
	
	
	scan.close();
} 
}
