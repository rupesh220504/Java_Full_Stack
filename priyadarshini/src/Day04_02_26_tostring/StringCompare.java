package Day04_02_26_tostring;

public class StringCompare {
	public static void main(String[] args) {
		String s1="VIRAT";
		String s2="VIRU";
		
		
		int res=s1.compareTo(s2);
		 System.out.println(res);
		 
		 if(res>0) {
			 System.out.println("S1 is greater");
		 }
		 else if(res<0) {
			 System.out.println("S2 is greater");
		 }
		 
		 else {
			 System.out.println("Both are same");
		 }
	}
}
