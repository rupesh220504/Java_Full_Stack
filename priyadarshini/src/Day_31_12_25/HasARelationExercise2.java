package Day_31_12_25;

public class HasARelationExercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student2 s = new Student2();
	
		Book2 b = new Book2("Steve Jobs",700);
		s.hasA(b);
		System.out.println("----------------");
		System.out.println(s.h.getJob());
		System.out.println(s.h.getWeight());
		
		System.out.println("***********************************");
		
		Bike2 b2 = new Bike2("Pulsar",145000);
		s.hasA1(b2);
		System.out.println("------------------------");
        System.out.println(s.b.getWeight());
        System.out.println(s.b.getIQlevel());
	}
}
class Human{
	Heart2 h = new Heart2("Tester",45);
	Brain2 b = new Brain2(4.5,"Moderate");
}
class Student2 extends Human{
	
	void hasA(Book2 b) {
		System.out.println(b.getName());
		System.out.println(b.getPrice());
	}
	
	void hasA1(Bike2 b1) {
		System.out.println(b1.getBrand());
		System.out.println(b1.getPrice());
	}
	
}
class Heart2{
	String job;
	double weight;
	public Heart2(String job,double weight) {
		this.job = job;
		this.weight = weight;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
}
class Book2 {
	String name;
	double price;
	
	public Book2(String name,double price) {
		this.name = name;
		this.price = price;
	
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}
class Brain2{
	double weight;
	String IQlevel;
	public Brain2(double weight, String iQlevel) {
		
		this.weight = weight;
		IQlevel = iQlevel;
		
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String getIQlevel() {
		return IQlevel;
	}
	public void setIQlevel(String iQlevel) {
		IQlevel = iQlevel;
	}
	
}
class Bike2 {
	String brand;
	double price;
	
	public Bike2(String brand,double price) {
		this.brand = brand;
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}
