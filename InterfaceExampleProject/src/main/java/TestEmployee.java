package main.java;

import java.util.ArrayList;
import java.util.List;

public class TestEmployee {
	
	public static void main(String[] args) {
		System.out.println("This is an example to demostrate Java Interface and its implementation\n");
		
		Employee employee;
		//creating employee objects
		List<Employee> employeeList = addEmployees();
		
		//creating instance of the Interfae
		EmployeeService employeeService = new EmployeeServiceImpl();
		
		//printing all Employee Details
		employeeService.printAllEmployees(employeeList);
		
		//find Employee with Id E103
		System.out.println("\nEmployee Details with EmpId E103");
		employee = employeeService.findEmployeeById("E103", employeeList);
		employeeService.printEmployeeDetails(employee);
		
		//find Employee with Name "Giri"
		System.out.println("\nEmployee Details with name Giri");
		employee = employeeService.getEmployeeByName("Giri", employeeList);
		employeeService.printEmployeeDetails(employee);
		
		//find Employees working in "Nutella" Project
		System.out.println("\nEmployees working in Nutella Project");
		List<Employee> nutellaEmployees = employeeService.getEmployeesByProject("Nutella", employeeList);
		nutellaEmployees.stream().forEach(emp -> {
			employeeService.printEmployeeDetails(emp);
		});
		
		//assign Faran to Cadbury Project
		System.out.println("\nAssigning Faran to Cadbury Project");
		employeeService.assignProjectToEmployee("Cadbury", "E106", employeeList);
		employeeService.printEmployeeDetails(employeeService.findEmployeeById("E106", employeeList));
		
		//calculate hike for employees if hike percentage is 5
		System.out.println("\nEmployee Details with revised salary");
		employeeService.calculateHikeForAllEmployees(5, employeeList);
		employeeService.printAllEmployees(employeeList);
		
		
	}
	
	private  static List<Employee> addEmployees(){
		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(new Employee("E101", "Ayushi", "Java Developer", "Female", 4, 55000, "Nutella"));
		employeeList.add(new Employee("E102", "Bhuvan", "Test Engineer", "Male", 2, 30000, "Cadbury"));
		employeeList.add(new Employee("E103", "Charan", "Tech Lead", "Male", 8, 70000, "Nutella"));
		employeeList.add(new Employee("E104", "Dhanvi", "Junior Architect", "Female", 12, 85000, "Eclairs"));
		employeeList.add(new Employee("E105", "Esha", "Frontend Developer", "Female", 3, 40000, "Cadbury"));
		employeeList.add(new Employee("E106", "Faran", "UI Designer", "Male", 5, 60000, "Nutella"));
		employeeList.add(new Employee("E107", "Giri", "Support Analyst", "Male", 2, 25000, "Eclairs"));
		return employeeList;
	}

}
