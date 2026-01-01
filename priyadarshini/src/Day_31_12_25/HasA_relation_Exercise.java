package Day_31_12_25;

public class HasA_relation_Exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 s = new Student1();
	
		Book b = new Book("Steve Jobs",700);
		s.hasA(b);
		System.out.println("----------------");
		System.out.println(s.h.getJob());
		System.out.println(s.h.getWeight());
		
		System.out.println("***********************************");
		
		Bike1 b1 = new Bike1("Pulsar",145000);
		s.hasA1(b1);
		System.out.println("------------------------");
        System.out.println(s.b.getWeight());
        System.out.println(s.b.getIQlevel());
	}
}
class Student1{
	Heart1 h = new Heart1("Tester",45);
	void hasA(Book b) {
		System.out.println(b.getName());
		System.out.println(b.getPrice());
	}
	Brain b = new Brain(4.5,"Moderate");
	void hasA1(Bike1 b1) {
		System.out.println(b1.getBrand());
		System.out.println(b1.getPrice());
	}
	
}
class Heart1{
	String job;
	double weight;
	public Heart1(String job,double weight) {
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
class Book {
	String name;
	double price;
	
	public Book(String name,double price) {
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
class Brain{
	double weight;
	String IQlevel;
	public Brain(double weight, String iQlevel) {
		
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
class Bike1 {
	String brand;
	double price;
	
	public Bike1(String brand,double price) {
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
