package Day04_02_26_tostring;

import java.util.ArrayList;
import java.util.Collections;

public class SortingComplexObject {
    public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(100);
		al.add(50);
		al.add(150);
		al.add(25);
		al.add(75);
		al.add("Rupesh");
		al.add(10.5);
		al.add(true);
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
	}
}
