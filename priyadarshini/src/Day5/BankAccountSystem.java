package Day5;

import java.util.HashMap;
import java.util.Map;

public class BankAccountSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Map<Integer, String> accounts = new HashMap<>();
       accounts.put(101, "Rupesh");
       accounts.put(102, "Ravi");
       accounts.put(103, "Raj");
       
       System.out.println("Account Details:");
       for(Map.Entry<Integer, String> entry : accounts.entrySet()) {
    	   System.out.println("Account No: " + entry.getKey() 
           + " Name: " + entry.getValue());
       }
       
       System.out.println("\nAccount Holder for 102: " 
               + accounts.get(102));
	}

}
