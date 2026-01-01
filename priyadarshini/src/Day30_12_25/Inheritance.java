package Day30_12_25;
/////////Access Specifiers////////////
public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Child c = new Child();
       c.disp();
	} 

}
class Parent{
	public void disp() {
		System.out.println("This is Parent method");
	}
}

class Child extends Parent{
	public void disp() {
		System.out.println("This is a child method");
	}
}
