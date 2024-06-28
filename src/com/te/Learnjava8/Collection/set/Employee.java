package com.te.Learnjava8.Collection.set;

import java.util.Objects;

public class Employee implements Comparable <Employee>{
	private String empName;
	private int empAge;
	private int empId;
//	private int getEmpAge;
//	public Object getEmpName;

	Employee() {
		System.out.println("default constructor of employee class");
	}

	Employee(String empName, int empAge, int empId) {
		this.empName = empName;
		this.empAge = empAge;
		this.empId = empId;
	}

	@Override
	public String toString() {
		return "Emplyee [empName=" + empName + ", empAge=" + empAge + ", empId=" + empId + "]";
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
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

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.empId-o.getEmpId();
	}

}
