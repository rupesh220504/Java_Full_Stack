package priyadarshini;

class Student{
	private String name;
	private int age;
	private String gender;
	
	public Student(String name,int age,String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		
		
	}
	
}
public class StudentApp {

	public static void main(String[] args) {
		Student s1 = new Student("Rupesh",21,"male");
	
		

	}

}
