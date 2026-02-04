package Day29_01_26_TreeSet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class BasicIterator {

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
//      Iterator itr = al.iterator();
//      
//      while(itr.hasNext()) {
//    	  System.out.println(itr.next());
//      }
//      
       ListIterator litr = al.listIterator(al.size());
      
      while(litr.hasPrevious()) {
    	  System.out.print(litr.previous()+" ");
      }
	}

}
