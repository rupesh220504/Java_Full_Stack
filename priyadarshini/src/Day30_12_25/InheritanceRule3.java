package Day30_12_25;

public class InheritanceRule3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             Parent2 p = new Parent2();
             System.out.println(p.disp());
	}

}
class Parent2{
	Animal disp() {
		Animal a = new Animal();
		return a;
	}
}
class Child2 extends Parent2{
	Dog disp() {
		Dog d = new Dog();
		return d;
	}
}

class Animal{
	
}
class Dog extends Animal{
	
}