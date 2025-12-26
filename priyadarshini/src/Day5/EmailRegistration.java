package Day5;

import java.util.HashSet;
import java.util.Set;

public class EmailRegistration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Set<String> emails = new HashSet<>(); 
		 
	        emails.add("rahangdalerupesh2@gmail.com"); 
	        emails.add("rahangdalerupesh103@gmail.com"); 
	        emails.add("rahangdalerupesh2@gmail.com"); // duplicate 
	 
	        System.out.println("Registered Emails:"); 
	        for (String email : emails) { 
	        	System.out.println(email);
	        }
	}

}
