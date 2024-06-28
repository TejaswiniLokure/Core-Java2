package com.te.Learnjava8.java8Feature.streamAPI;

import java.time.LocalDate;
import java.util.Objects;

public class EmployeeManger {
	private String employeeId;
	private String name;
	private String department;
	private String jobTitle;
	private int age;
	private int yearsOfExperience;
	private double salary;
	private int performanceRating;
	private boolean isMarried;
	private LocalDate dateOfJoining;

	public EmployeeManger() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeeManger(String employeeId, String name, String department, String jobTitle, int age,
			int yearsOfExperience, double salary, int performanceRating, boolean isMarried, LocalDate dateOfJoining) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.department = department;
		this.jobTitle = jobTitle;
		this.age = age;
		this.yearsOfExperience = yearsOfExperience;
		this.salary = salary;
		this.performanceRating = performanceRating;
		this.isMarried = isMarried;
		this.dateOfJoining = dateOfJoining;
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

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getYearsOfExperience() {
		return yearsOfExperience;
	}

	public void setYearsOfExperience(int yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getPerformanceRating() {
		return performanceRating;
	}

	public void setPerformanceRating(int performanceRating) {
		this.performanceRating = performanceRating;
	}

	public boolean isMarried() {
		return isMarried;
	}

	public void setMarried(boolean isMarried) {
		this.isMarried = isMarried;
	}

	public LocalDate getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(LocalDate dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, dateOfJoining, department, employeeId, isMarried, jobTitle, name, performanceRating,
				salary, yearsOfExperience);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeManger other = (EmployeeManger) obj;
		return age == other.age && Objects.equals(dateOfJoining, other.dateOfJoining)
				&& Objects.equals(department, other.department) && Objects.equals(employeeId, other.employeeId)
				&& isMarried == other.isMarried && Objects.equals(jobTitle, other.jobTitle)
				&& Objects.equals(name, other.name) && performanceRating == other.performanceRating
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary)
				&& yearsOfExperience == other.yearsOfExperience;
	}

	@Override
	public String toString() {
		return "EmployeeManger [employeeId=" + employeeId + ", name=" + name + ", department=" + department
				+ ", jobTitle=" + jobTitle + ", age=" + age + ", yearsOfExperience=" + yearsOfExperience + ", salary="
				+ salary + ", performanceRating=" + performanceRating + ", isMarried=" + isMarried + ", dateOfJoining="
				+ dateOfJoining + "]";
	}

}
