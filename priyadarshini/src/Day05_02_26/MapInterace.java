package Day05_02_26;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class MapInterace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Student s = new Student("Rupesh",21,"Male",96379484,89,5,"rahangdalerupesh2@gmail.com","Tumsar",5.9,65,"B+");
      Student s1 = new Student("Saurabh",24,"Male",96379484,89,5,"saurabh@gmail.com","Bhopal",4.9,75,"O+");
      Student s2 = new Student("Pratik",22,"Male",96379484,89,5,"pratik@gmail.com","Raipur",5.5,45,"B-");
      
      HashMap h = new HashMap();
      
      h.put(502,s1);
      h.put(503,s);
      h.put(501,s2);
      System.out.println(h);
	}

}
class Student{
	String name;
	int age;
	String gender;
	int mobileNo;
	int marks;
	int sem;
	String email;
	String address;
	double height;
	double weight;
	String bloodGroup;
	
	
	public Student(String name, int age, String gender, int mobileNo, int marks, int sem, String email, String address,
			double height, double weight, String bloodGroup) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.mobileNo = mobileNo;
		this.marks = marks;
		this.sem = sem;
		this.email = email;
		this.address = address;
		this.height = height;
		this.weight = weight;
		this.bloodGroup = bloodGroup;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(int mobileNo) {
		this.mobileNo = mobileNo;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public int getSem() {
		return sem;
	}
	public void setSem(int sem) {
		this.sem = sem;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", gender=" + gender + ", mobileNo=" + mobileNo + ", marks="
				+ marks + ", sem=" + sem + ", email=" + email + ", address=" + address + ", height=" + height
				+ ", weight=" + weight + ", bloodGroup=" + bloodGroup + "]";
	}
	
}
