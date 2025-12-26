package Day4;

abstract class Employee {
    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    abstract double calculateSalary();

    void display() {
        System.out.println("Employee: " + name);
        System.out.println("Salary: " + calculateSalary());
    }
}

class FullTimeEmployee extends Employee {

    double monthlySalary;

    FullTimeEmployee(int id, String name, double monthlySalary) {
        super(id, name);
        this.monthlySalary = monthlySalary;
    }

    @Override
    double calculateSalary() {
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee {

    int hoursWorked;
    double ratePerHour;

    PartTimeEmployee(int id, String name, int hoursWorked, double ratePerHour) {
        super(id, name);
        this.hoursWorked = hoursWorked;
        this.ratePerHour = ratePerHour;
    }

    @Override
    double calculateSalary() {
        return hoursWorked * ratePerHour;
    }
}


public class EmployeeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee[] employees = new Employee[2];

        employees[0] = new FullTimeEmployee(1, "Ravi", 45000);
        employees[1] = new PartTimeEmployee(2, "Amit", 20, 500);

        for (Employee emp : employees) {
            emp.display();
            System.out.println();
        }
	}

}
