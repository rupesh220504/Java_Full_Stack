package Day04_02_26_tostring;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorInterface {
 public static void main(String[] args) {
	 Employee1 e = new Employee1(101,"Rupesh",200);
     Employee1 e1 = new Employee1(104,"Rakesh",210);
     Employee1 e2 = new Employee1(105,"Ramesh",250);
     Employee1 e3 = new Employee1(102,"Bhupesh",230);
     Employee1 e4 = new Employee1(103,"Mukesh",225);
//     
     ArrayList al =new ArrayList();
     al.add(e);
     al.add(e2);
     al.add(e1);
     al.add(e3);
     al.add(e4);
    
     SortComplexobject st = new SortComplexobject();
     Collections.sort(al,st);
     System.out.println(al);
}
}
class SortComplexobject implements Comparator{

	@Override    // sorting by id
	public int compare(Object o1, Object o2) {
//		if(((Employee1)(o1)).id>((Employee1)(o2)).id) {
//			return 1;
//		}
//		return -1;
	
		// sorting by salary
//		if(((Employee1)(o1)).salary>((Employee1)(o2)).salary) {
//			return 1;
//		}
//		return -1;
		
		/// sorting by name
		int res=(((Employee1)(o1)).name).compareTo((((Employee1)(o2)).name));
		if(res>0) {
			return 1;
		}
		else
		return -1;
	}
	
	
	
}
class Employee1{
	int id;
	String name;
	int salary;
	public Employee1(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getSalary() {
		return salary;
	}
	public String toString(){
		return id+" "+name+" "+salary;
	}
}
