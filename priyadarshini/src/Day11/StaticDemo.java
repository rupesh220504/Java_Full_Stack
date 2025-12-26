package Day11;

class StaticDemo1{
	static int a;
	static int b;
	
	static {
		a=10;
		b=20;
	}
	static void disp() {
		System.out.println(a);
		System.out.println(b);
	}

int x;
int y;
{
	a=30;
	b=40;
	x=50;
	y=60;
}
void disp2() {
	System.out.println(a);
	System.out.println(b);
	System.out.println(x);
	System.out.println(y);
}
}
public class StaticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      StaticDemo1.disp();
      StaticDemo1 d1 = new StaticDemo1();
      d1.disp2();
      
	}

}
