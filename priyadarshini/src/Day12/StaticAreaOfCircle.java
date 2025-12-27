package Day12;

class Circle{
	double r;
	double pi = 3.14;
	double area; 
	
	Circle(double r){
		this.r = r;
		
	}
	
	double display() {
		
		area = pi * r *r;
		return area;
		
	}
}

public class StaticAreaOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle(5);
		System.out.println(c.display());
		
		

	}

}
