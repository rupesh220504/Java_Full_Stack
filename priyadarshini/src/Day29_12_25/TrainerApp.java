package Day29_12_25;

class Trainer {
	void teaches() {
		System.out.println("Teaches All Courses");
	}
}
class JavaTrainer extends Trainer{
	void teaches() {
		System.out.println("Teaches Java");
	}
}
class AptiTrainer extends Trainer{
	void teaches() {
		System.out.println("Teaches Aptitude");
	}
}
class TestingTrainer extends Trainer{
	void teaches() {
		System.out.println("Teaches Testing");
	}
}
public class TrainerApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Trainer t;
	      t = new JavaTrainer();
	      t.teaches();
          t = new AptiTrainer();
          t.teaches();
          t = new TestingTrainer();
          t.teaches();   
	}

}
