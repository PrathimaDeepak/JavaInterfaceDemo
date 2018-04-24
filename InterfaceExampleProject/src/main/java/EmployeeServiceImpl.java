package main.java;

import java.util.ArrayList;
import java.util.List;

/*
 * This is the implementation class for Employee Service
 */
public class EmployeeServiceImpl implements EmployeeService {

	//method to find Employee by Id
	@Override
	public Employee findEmployeeById(String employeeId, List<Employee> employeeList) {
		
		Employee employee = null;
		for(Employee emp: employeeList) {
			if(emp.getEmployeeId().equals(employeeId)) {
				employee = emp;
			}
		}
		return employee;
		
	}

	//method to find employee by name
	@Override
	public Employee getEmployeeByName(String name, List<Employee> employeeList) {
		
		Employee employee = null;
		for(Employee emp: employeeList) {
			if(emp.getName().equals(name)) {
				employee = emp;
			}
		}
		return employee;
	}
	
	//method to find employee by project
	@Override
	public List<Employee> getEmployeesByProject(String project, List<Employee> employeeList) {
		List<Employee> employees = new ArrayList<Employee>();
		for(Employee emp: employeeList) {
			if(emp.getProject().equals(project)) {
				employees.add(emp);
			}
		}
		return employees;
	}

	//method to print all employee details
	@Override
	public void printAllEmployees(List<Employee> employeeList) {
		employeeList.stream().forEach(employee -> {
			System.out.println("ID: "+ employee.getEmployeeId() + " Name: " + employee.getName() + " Designation: "+ employee.getDesignation() + " Project:" + employee.getProject() + " Salary: " + employee.getSalary());
		});
	}

	//method to assign employee to a specific project
	@Override
	public void assignProjectToEmployee(String project, String employeeId, List<Employee> employeeList) {
		Employee employee = null;
		for(Employee emp: employeeList) {
			if(emp.getEmployeeId().equals(employeeId)) {
				employee = emp;
				employee.setProject(project);
				System.out.println(employee.getName() + " is assigned to " + employee.getProject() + " project.");
			}
		}
	}

	//method to calculate hike for employees
	@Override
	public void calculateHikeForAllEmployees(float hikePercentage, List<Employee> employeeList) {
		employeeList.stream().forEach(employee -> {
			if(hikePercentage > 0) {
			 employee.setSalary((employee.getSalary() + (employee.getSalary() * (hikePercentage/100))));
			}
		});
		
	}

	//method to print specific employee details
	@Override
	public void printEmployeeDetails(Employee employee) {
		
		System.out.println("ID: "+ employee.getEmployeeId() + " Name: " + employee.getName() + 
				" Designation: "+ employee.getDesignation() + " Project:" + employee.getProject()
				+ " Salary: " + employee.getSalary());
	
	}

}
