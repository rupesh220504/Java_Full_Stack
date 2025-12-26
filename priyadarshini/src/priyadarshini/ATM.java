package priyadarshini;

import java.util.Scanner;

public class ATM  {
	static void withdraw(int balance, int amount) { 
		if(amount>balance) {
			throw new ArithmeticException("Insufficient Balance");
		}
		else {
			balance = balance - amount;
            System.out.println("Withdrawal Successful");
            System.out.println("Remaining Balance: " + balance);
		}
			
		
		} 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		try {
			
			System.out.println("Enter the Balance Ammount:- ");
			int bal=sc.nextInt();
			System.out.println("Enter the withdrawal Ammount:- ");
			int with=sc.nextInt();
			withdraw(bal,with);
			
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Transaction Finished");
		}

	}

}
