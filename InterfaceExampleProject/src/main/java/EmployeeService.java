package main.java;

import java.util.List;

/*
 * This is the interface to define methods.
 */
public interface EmployeeService {
	
	public Employee findEmployeeById(String employeeId, List<Employee> employeeList);
	
	public Employee getEmployeeByName(String name, List<Employee> employeeList);
	
	public List<Employee> getEmployeesByProject(String project, List<Employee> employeeList);
	
	public void printAllEmployees(List<Employee> employeeList);
			
	public void printEmployeeDetails(Employee employee);
	
	public void assignProjectToEmployee(String project, String employeeId, List<Employee> employeeList);
	
	public void calculateHikeForAllEmployees(float hikePercentage, List<Employee> employeeList);

}
