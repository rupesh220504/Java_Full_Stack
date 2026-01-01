package Day30_12_25;

public class InheritanceRules {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child1 c = new Child1();
	       c.disp();
	}

}
class Parent1{
	 void disp() {
		System.out.println("This is Parent method");
	}
}

class Child1 extends Parent1{
int  disp() {
		System.out.println("This is a child method");
		return 0;
	}
}