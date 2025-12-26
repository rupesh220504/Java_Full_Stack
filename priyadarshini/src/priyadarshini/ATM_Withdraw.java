package priyadarshini;

import java.util.Scanner;

public class ATM_Withdraw {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
	
		
		System.out.println("Enter Balance Amount:-");
		long bal = scan.nextLong();
		
		System.out.println("Enter a withdraw Amount:-");
		long with = scan.nextLong();
		
		if(bal > with) {
			long totalbalance = bal - with;
			System.out.println("Remaining Balance:-" +totalbalance);
		}else{
			System.out.println("Insufficient Balance");
		}
		
		scan.close();
	}

}
