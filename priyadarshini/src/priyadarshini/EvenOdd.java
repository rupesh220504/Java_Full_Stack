package priyadarshini;

import java.util.Scanner;

public class EvenOdd {


	
	
	public static void main(String[] args) {
	
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter A Number");
		int n = scan.nextInt();
		
		if(n%2 == 0) {
			System.out.println("It is a Even Number");
		}else {
			System.out.println("It is Odd Number");
		}
				
		scan.close();

	}

}
