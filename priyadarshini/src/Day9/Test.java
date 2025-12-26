package Day9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable{
	
	int id;
	String name;
	Student(int id,String name){
		this.id = id;
		this.name = name;
	}
}

public class Test {
	public static void main(String[] args) throws Exception{
		FileOutputStream fos = new FileOutputStream("Info.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		Student s1 = new Student(111,"Rupesh");
		
		oos.writeObject(s1);
		oos.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Info.ser"));
		Student s2 = (Student)ois.readObject();
		System.out.println("ID:"+s2.id+"Name:"+s2.name);
		ois.close();
		
	}

}
