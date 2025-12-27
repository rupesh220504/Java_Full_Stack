package Day12;

class Triangle{
	double b;
	double h ;
	double c= 1/2f;
	
	
	Triangle(double b,double h){
		
		this.b = b;
		this.h = h;
		
	}
	
	double display() {
		
		return  c * b * h;
		 
		
	}
}

public class AreaOFTraiangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle t = new Triangle(4,4);
		t.display();
		System.out.println(t.display());

	}

}
