package Day9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Student_Record_Management {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        File file = new File("StudentRecord.txt");

	        try {
	            
	            FileWriter fw = new FileWriter(file, true); // append mode
	            BufferedWriter bw = new BufferedWriter(fw);

	            System.out.print("Enter Student ID: ");
	            int id = sc.nextInt();
	            sc.nextLine(); // buffer clear

	            System.out.print("Enter Student Name: ");
	            String name = sc.nextLine();

	            System.out.print("Enter Marks: ");
	            int marks = sc.nextInt();

	            bw.write(id + "," + name + "," + marks);
	            bw.newLine();
	            bw.close();
	            
	            System.out.println("\nStudent record saved successfully!\n");

	            
	            FileReader fr = new FileReader(file);
	            BufferedReader br = new BufferedReader(fr);

	            System.out.println("----- Student Records -----");
	            String line;
	            while ((line = br.readLine()) != null) {
	                String[] data = line.split(",");
	                System.out.println("ID: " + data[0] +" | Name: " + data[1] +" | Marks: " + data[2]);
	            }
	            br.close();

	        } catch (IOException e) {
	            System.out.println("File Error: " + e.getMessage());
	        }

	        sc.close();

	}

}
