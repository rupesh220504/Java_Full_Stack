package Day_31_12_25;

public class FinalKeyword {
//     final int b = 10;
	public static void main(String[] args) {
		
//     final int a;
//       a=20;
//       a=30;
//       System.out.println(a);
		
		Child1 c = new Child1();
		c.disp();
	}

}
class Parent1 {
//	int x =10;
//	void disp() {
//		System.out.println(x);
//	}
	final void disp() {
		System.out.println("Parent");
		
	}
}
class Child1 extends Parent1{
//	int x =20;
	void disp() {
		System.out.println("Child");
		
	}
}