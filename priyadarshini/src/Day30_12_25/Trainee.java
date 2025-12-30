package Day30_12_25;
/////// Polymorphism//////////
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
public class Trainee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		duty(new JavaTrainer());
		duty(new AptiTrainer());
		duty(new TestingTrainer());

	}
	static void duty(Trainer t) {
		t.teaches();
	}

}
