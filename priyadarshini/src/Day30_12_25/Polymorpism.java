package Day30_12_25;


public class Polymorpism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tendulkar t= new ArjunTendulkar();
		t.job();
		t.proffesion();
		//t.smoke();    it will show error because we have create an new specialised method |  ((ArjunTendulkar)t).smoke(); ////It will not give error but not achieved polymorphism we are using a downcasting
	}

}
 class Tendulkar{
	void job() {
		System.out.println("Play Cricket");
	}
	void proffesion() {
		System.out.println("He is A Batsman");
	}
	
}
 
 class ArjunTendulkar extends Tendulkar{
	 void proffesion() {
			System.out.println("He is A Baller");
		}
	 void Smoke() {
		System.out.println("He smokeSome time"); 
	 }
 }
