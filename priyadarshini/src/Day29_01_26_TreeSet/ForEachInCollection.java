package Day29_01_26_TreeSet;

import java.util.ArrayList;

public class ForEachInCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ArrayList al = new ArrayList();
      al.add(100);
      al.add(50);
      al.add(150);
      al.add(25);
      al.add(75);
      al.add(125);
      al.add(175);
      
      System.out.println(al);
      
      
      
      System.out.println("For loop->");
      for(int i=0;i<al.size();i++) {
    	  System.out.print(al.get(i)+" ");
      }
      System.out.println();
      
      
      
      System.out.println("For Each ->");
      for(Object x : al) {
    	  System.out.print(x+" ");
      }
	}

}
