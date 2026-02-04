package Day29_01_26_TreeSet;

import java.util.ArrayList;

public class ArrayListForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   ArrayList<Integer> list = new ArrayList<>();
   list.add(10);
   list.add(20);
   list.add(30);
   list.add(40);
   list.add(50);
 
   for(Integer li : list) {
	   System.out.println(li);
   }
   
   System.out.println("-------------------");
   
   
   ArrayList<String> strlist = new ArrayList<>();
   strlist.add("Rupesh");
   strlist.add("Ram");
   strlist.add("Raj");
   strlist.add("Rahul");
   strlist.add("Rohit");
 
//   for(String li : strlist) {
//	   System.out.println(li);
//   }
   
   for(int i = 0;i<strlist.size();i++) {
	   System.out.println(strlist.get(i));
   }

   
   
	}

}
