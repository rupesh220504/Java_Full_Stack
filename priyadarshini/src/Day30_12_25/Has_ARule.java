package Day30_12_25;

public class Has_ARule {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Laptop l = new Laptop();
        Charger c = new Charger("HP", 150);
         l.hasA(c);
         System.out.println("------------------------");
         System.out.println(l.os.getBrand());
         System.out.println(l.os.getVerion());
	}
}
class Laptop{
	OS os = new OS("Windows",4.0);
	void hasA(Charger c) {
		System.out.println(c.getBrand());
		System.out.println(c.getPower());
	}
}
class Charger {
	String brand;
	double power;
	public Charger(String brand,double power) {
		this.brand = brand;
		this.power = power;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPower() {
		return power;
	}
	public void setPower(double power) {
		this.power = power;
	}	
}
class OS{
	String brand ;
	double verion;
	public OS(String brand,double version) {
		this.brand = brand;
		this.verion = version;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getVerion() {
		return verion;
	}
	public void setVerion(double verion) {
		this.verion = verion;
	}
}
