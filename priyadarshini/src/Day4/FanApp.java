package Day4;

class Fan{
	String company ;
	String color;
	int cost;
}
public class FanApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fan f1 = new Fan();
        System.out.println("Before");
        System.out.println(f1.company);
        System.out.println(f1.color);
        System.out.println(f1.cost);
        System.out.println("After");
        f1.company = "Indo";
        f1.color = "Black";
        f1.cost = 1200;
        System.out.println(f1.company);
        System.out.println(f1.color);
        System.out.println(f1.cost);
        
        
        Fan f2 = new Fan();
        
        f2.company = "Crompton";
        f2.color = "White";
        f2.cost = 1500;
        System.out.println(f2.company);
        System.out.println(f2.color);
        System.out.println(f2.cost);

	}

}
