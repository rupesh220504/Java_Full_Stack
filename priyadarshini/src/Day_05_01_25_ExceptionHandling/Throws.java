package Day_05_01_25_ExceptionHandling;

import java.util.Scanner;



class Test30  {
	void gamma() throws Exception{
		System.out.println("Conn 3 Established");
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter Value 1:-");
		int a = scan.nextInt();
		
		System.out.println("Please Enter Value 2:-");
		int b = scan.nextInt();
		
		int c = a/b;
		System.out.println(c);
        
		System.out.println("Conection 3 Terminated");
		
		scan.close();
	}
}

public class Throws {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.out.println("Main Connection Eastablished");
         Test30 t1 = new Test30();
         try {
        	 t1.gamma();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception handles by main");
		}
         
         System.out.println("Main Terminated");
	}

}
