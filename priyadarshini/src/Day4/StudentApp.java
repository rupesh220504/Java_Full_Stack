package Day4;

public class StudentApp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Student s1 = new Student();
        System.out.println("Before");
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.gender);
        System.out.println("After");
        s1.name = "Rupesh";
        s1.age = 22;
        s1.gender = "Male";
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.gender);
      
       
	}
}
class Student{
	String name,gender;
	int age;
	
	void student() {
		System.out.println("Student");
	}
}
