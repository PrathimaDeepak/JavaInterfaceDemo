package main.java;

/*
 * This is entity class for Employee
 */
public class Employee {
	
	private String employeeId;
	
	private String name;
	
	private String designation;
	
	private String gender;
	
	private double experience;
	
	private double salary;
	
	private String project;
	
	public Employee() { 
		
	}

	public Employee(String employeeId, String name, String designation, String gender, double experience, double salary,
			String project) {
		this.employeeId = employeeId;
		this.name = name;
		this.designation = designation;
		this.gender = gender;
		this.experience = experience;
		this.salary = salary;
		this.project = project;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public double getExperience() {
		return experience;
	}

	public void setExperience(double experience) {
		this.experience = experience;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}
	
	

}
