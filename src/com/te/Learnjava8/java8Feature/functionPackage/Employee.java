package com.te.Learnjava8.java8Feature.functionPackage;

import java.util.Objects;

public class Employee {
	private int empId;
	private String empName;
	private int empAge;

	Employee() {
		System.out.println("default constructor employee");
	}

	Employee(int empId, String empName, int empAge) {
		this.empId = empId;
		this.empName = empName;
		this.empAge = empAge;

	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empAge=" + empAge + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(empAge, empId, empName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return empAge == other.empAge && empId == other.empId && Objects.equals(empName, other.empName);
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

}
