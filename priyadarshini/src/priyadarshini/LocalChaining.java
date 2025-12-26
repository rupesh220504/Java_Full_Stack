package priyadarshini;

class Employee2{
	int empid ;
	String name;
	int salary;
	
	public Employee2() {
		this(101,"Arsh",233);
		System.out.println("0 Parameter");
	}
	public Employee2(int empid) {
		
		System.out.println("1 Parameter");
	}
	public Employee2(int empid,String name) {
		this(101);
		System.out.println("2 Parameter");
	}
	public Employee2(int empid,String name,int salary) {
		this(101,"Arsh");
		System.out.println("3 Parameter");
	}
}

public class LocalChaining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Employee2 e = new Employee2();
	}

}
