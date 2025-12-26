package Day5;

import java.util.ArrayList;
import java.util.List;

class Student { 
    int id; 
    String name; 
    double marks; 
 
    Student(int id, String name, double marks) { 
        this.id = id; 
        this.name = name; 
        this.marks = marks; 
    } 
 
    void display() { 
        System.out.println(id + " " + name + " " + marks); 
    } 
}
public class StudentManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Student> students = new ArrayList<>(); 
		 
	        students.add(new Student(101, "Rupesh", 88.00)); 
	        students.add(new Student(102, "Raj", 92.00)); 
	        students.add(new Student(103, "Rajat", 78.40)); 
	 
	        for (Student s : students) { 
	            s.display(); 
	        } 

	}

}
