package Day04_02_26_tostring;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
//////////////////////  Comparable ///////////////////////////////////////
public class ComparableInterface {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Employee e = new Employee(101,"Rupesh",200);
         Employee e3 = new Employee(104,"Rakesh",210);
         Employee e4 = new Employee(105,"Ramesh",250);
         Employee e1 = new Employee(102,"Bhupesh",230);
         Employee e2 = new Employee(103,"Mukesh",20);
//         
         ArrayList al =new ArrayList();
         al.add(e);
         al.add(e2);
         al.add(e1);
         al.add(e3);
         al.add(e4);
         Collections.sort(al);
         System.out.println(al);
       
//         System.out.println(e);     //e.toString()
	}
}
class Employee implements Comparable {
	int id;
	String name;
	int salary;
	public Employee(int id, String name, int salary) {
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
	@Override
	public int compareTo(Object o) {
//		 TODO Auto-generated method stub
		
		//Program-1
//		if(this.id>(((Employee)(o)).id)) {
//			return 1;
//		}
		
		//Program-2
//		if(this.salary>(((Employee)(o)).salary)) {
//			return 1;
//		}
		
		
		//using equals()
		
//		if(this.name.equals(((Employee)(o)).name)) {
//			return 1;
//		}
		
		//using compareTo()
		//Program-3
		int res=(this.name).compareTo((((Employee)(o)).name));
		if(res>0) {
			return 1;
		}
		else
		return -1;
	}
	
	
}


