package Day9;
import java.io.*;

class Employee implements Serializable {

    private static final long serialVersionUID = 1L;

    int empId;
    String empName;
    double salary;

    Employee(int empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }
}

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            
            FileOutputStream fos = new FileOutputStream("employee.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            Employee e1 = new Employee(101, "Rupesh", 45000);
            oos.writeObject(e1);
            oos.close();

            System.out.println("Employee object saved successfully!");

            
            FileInputStream fis = new FileInputStream("employee.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Employee e2 = (Employee) ois.readObject();
            ois.close();

           
            System.out.println("\nEmployee Details:");
            System.out.println("ID: " + e2.empId);
            System.out.println("Name: " + e2.empName);
            System.out.println("Salary: " + e2.salary);
            
		} catch (IOException | ClassNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
	}

}
