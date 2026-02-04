package Day29_01_26_TreeSet;

import java.util.TreeSet;

public class AdditionalMethodsTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          TreeSet ts = new TreeSet();
          ts.add(100);
          ts.add(50);
          ts.add(150);
          ts.add(25);
          ts.add(75);
          ts.add(125);
          ts.add(175);
          System.out.println(ts);
          System.out.println("--------------------");
          
          System.out.println(ts.ceiling(75));
          System.out.println(ts.floor(75));
          System.out.println("-------------------");
          System.out.println(ts.higher(75));
          System.out.println(ts.lower(75));
          System.out.println("-------------------");
          
          System.out.println("-------------------");
          System.out.println(ts.ceiling(70));
          System.out.println(ts.floor(70));
          System.out.println("-------------------");
          System.out.println(ts.higher(70));
          System.out.println(ts.lower(70));
          
          System.out.println("-------------------");
          System.out.println(ts.headSet(75));
          System.out.println(ts.tailSet(75));
          System.out.println(ts.);
          }
     
}
