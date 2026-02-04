package Day29_01_26_TreeSet;

public class ForEachStudent {
public static void main(String[] args) {
		Student st1 = new Student("Rupesh",22,"Male");
		Student st2 = new Student("Ayush",32,"Male");
		Student st3 = new Student("Mayur",22,"Male");
		Student[] arr = {st1,st2,st3};
		
		
		for(Student s : arr) {
			System.out.print(s.getName()+" ");
			System.out.print(s.getAge()+" ");
			System.out.println
			(s.getGender()+" ");
			System.out.println("----------------");
		}
		
	}

}
class Student{
	String name;
	int age;
	String gender;
	public String getName() {
		return name;
	}

	

	public int getAge() {
		return age;
	}

	
	public String getGender() {
		return gender;
	}

	public Student(String name,int age,String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	 

}
