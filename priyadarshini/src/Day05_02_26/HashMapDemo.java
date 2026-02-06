package Day05_02_26;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 HashMap h = new HashMap();
	      
	      h.put(100,99);
	      h.put(50,999);
	      h.put(150,9999);
	      h.put(25,99999);
	      h.put(75,999999);
	      h.put(125,9999999);
	      System.out.println(h);
	      
	      System.out.println("===========KEYS================");
	      Set s = h.keySet();
	      
	      Iterator itr =  s.iterator();
	      while (itr.hasNext()) {
	    	  System.out.println(itr.next());
	      }
	      
	      System.out.println("============VALUES===============");
	      Collection c= h.values();
	      Iterator it =  c.iterator();
	      while (it.hasNext()) {
	    	  System.out.println(it.next());
	      }
	      
	      System.out.println("============KEY VALUES===============");
	      Set s1 = h.entrySet();
	      Iterator itx = s1.iterator();
	      while (itx.hasNext()) {
	    	  System.out.println(itx.next());
	      }
	}

}
