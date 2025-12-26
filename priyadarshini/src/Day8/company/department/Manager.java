package Day8.company.department;

import Day8.company.employee.Employee;

public class Manager extends Employee {
	public void accessEmployeeData()
	{
		showEmployeeDetails();
		System.out.println("Employee ID:-"+empId);
		System.out.println("Salary"+salary);
		
		//System.out.println("Department Name:-"+departmentName);
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Manager m = new Manager();
          m.accessEmployeeData();
	}

}
