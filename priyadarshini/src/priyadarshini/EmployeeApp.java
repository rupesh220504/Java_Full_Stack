package priyadarshini;

class Employee1 {
    int emp_id;
    String name;
    int salary;

    public Employee1(int emp_id, String name, int salary) {
        this.emp_id = emp_id;
        this.name = name;
        this.salary = salary;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }
}

public class EmployeeApp {
    public static void main(String[] args) {
        Employee1 e = new Employee1(101, "Arsh", 20000);
        System.out.println(e.getEmp_id());
        System.out.println(e.getName());
        System.out.println(e.getSalary());
    }
}
