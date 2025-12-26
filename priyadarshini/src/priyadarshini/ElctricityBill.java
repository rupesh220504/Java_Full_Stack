package priyadarshini;

import java.util.Scanner;

public class ElctricityBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int units,bill;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Units");
        units = scan.nextInt();

        if(units >= 1 && units <= 100)
        {
           bill = units * 3;
           System.out.println("Bill is Rs : " +bill);
        }
        else if(units >= 101 && units <= 200)
        {
            bill = ( 100 * 3 ) + (units - 100) * 5;
            System.out.println("Bill is Rs : " +bill);
        }
        else if(units > 200 )
        {
            bill = ( 100 * 3 ) + (100 * 5) + (units - 200) * 7;
            System.out.println("Bill is Rs : " +bill);
        }
        scan.close();
	}
	

}
