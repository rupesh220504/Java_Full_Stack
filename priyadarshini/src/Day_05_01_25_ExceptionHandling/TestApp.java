package Day_05_01_25_ExceptionHandling;

import java.util.Scanner;

class Test1{
	void alpha() {
		System.out.println("Conn  1 Established");
		Test2 t2 = new Test2();
		try {
		t2.beta();
		} catch (Exception e) {
			System.out.println("Eception handled");
		}
		System.out.println("Conn 1 terminated");
	}
}

class Test2{
	void beta() {
		System.out.println("Conn  2 Established");
		Test3 t3 = new Test3();
		
			t3.gamma();
	
		System.out.println("Conn 2 terminated");

}}

class Test3{
	void gamma() {
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

public class TestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.out.println("Main Connection Eastablished");
         Test1 t1 = new Test1();
         t1.alpha();
         System.out.println("Main Terminated");
	}

}
