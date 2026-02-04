package Day_05_01_25_ExceptionHandling;

import java.util.Scanner;

public class BankApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Bank b = new Bank();
        b.banking();
	}

}
class Bank{
	void banking() {
		System.out.println("Bank Conn Established");
		ATM card = new ATM();
		try {
			card.transaction();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Info received by the bank your amount will refunded in next 24 working hours.");
		}
		System.out.println("Bank Conection Terminated");
	}
	
}
class ATM{
	void transaction() throws Exception {
		System.out.println("ATM Conn Established");
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter Value 1:-");
		int a = scan.nextInt();
		
		System.out.println("Please Enter Value 2:-");
		int b = scan.nextInt();
		try {
			int c = a/b;
			System.out.println(c);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception handled by ATM");
			throw e;
		}
		
        
		System.out.println("ATM Conection Terminated");
		
		scan.close();
	}
}