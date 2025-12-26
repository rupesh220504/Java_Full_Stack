package Day2;



class Employee {
    double salary = 30000;
}

class Manager extends Employee{
    double bonus = 10000;

    void displaySalary() {
        System.out.println("Total Salary: " + (salary + bonus));
    }

    public static void main(String[] args) {
        Manager m = new Manager();
        m.displaySalary();
    }
}

