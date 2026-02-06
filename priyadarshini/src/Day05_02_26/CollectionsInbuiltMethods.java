package Day05_02_26;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsInbuiltMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		ArrayList<Integer> al = new ArrayList<>();
		al.add(100);
		al.add(50);
		al.add(150);
		al.add(25);
		al.add(75);
		al.add(125);
		al.add(175);
		System.out.println(al);

		Collections.sort(al);
		System.out.println(Collections.binarySearch(al,75));
		System.out.println(Collections.binarySearch(al,7589));
		
		Collections.rotate(al, 2);
		System.out.println(al);
		
		System.out.println(Collections.min(al));
		System.out.println(Collections.max(al));
		System.out.println(Collections.frequency(al, 75));
		
		System.out.println(Collections.replaceAll(al, 75, 55));
		System.out.println(al);
		
		Collections.shuffle(al);
		System.out.println(al);
	}

}