package Day8;
@FunctionalInterface

interface Add{
	abstract int sum(int x,int y);
}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Add z = (x,y) -> x+y;
		System.out.println("Sum:"+z.sum(10,20));

	}

}
