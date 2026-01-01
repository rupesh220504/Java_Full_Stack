package Day_31_12_25;

public class InheritanceRule {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Child c = new Child();
         c.disp();
	}
}
class Parent {
	int x =10;
	void disp() {
		System.out.println(x);
	}
}
class Child extends Parent{
	int x =20;
	void disp() {
		System.out.println(x);
		System.out.println(super.x);
	}
}