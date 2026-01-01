package Day_31_12_25;


public class Has_A2 {
	public static void main(String[] args) {
		Student s = new Student();
		Bike b= new Bike("Pulsar",145000,"BlackRed");
		System.out.println(b.getBrand());

		s=null;    
		s.hasA(b);
		
		
		System.out.println("------------------------");
        System.out.println(s.h.getJob());
        System.out.println(s.h.getWeight());
	}

}
class Student{
	Heart h = new Heart("Tester",45);
	void hasA(Bike b) {
		System.out.println(b.getBrand());
		System.out.println(b.getPrice());
		System.out.println(b.getColor());
	}
}
class Bike {
	String brand;
	double price;
	String color;
	public Bike(String brand,double price,String color) {
		this.brand = brand;
		this.price = price;
		this.color = color;
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
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
}
class Heart{
	String job;
	double weight;
	public Heart(String job,double weight) {
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