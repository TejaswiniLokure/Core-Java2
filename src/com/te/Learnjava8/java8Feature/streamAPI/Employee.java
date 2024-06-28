package com.te.Learnjava8.java8Feature.streamAPI;

import java.time.LocalDate;
import java.util.Objects;

public class Employee {
	private int eId;
	private String eName;
	private int eAge;
	private String eDept;
	private double eSalary;
	private LocalDate eDateOfJoining;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int eId, String eName, int eAge, String eDept, double eSalary, LocalDate eDateOfJoining) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.eAge = eAge;
		this.eDept = eDept;
		this.eSalary = eSalary;
		this.eDateOfJoining = eDateOfJoining;
	}

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public int geteAge() {
		return eAge;
	}

	public void seteAge(int eAge) {
		this.eAge = eAge;
	}

	public String geteDept() {
		return eDept;
	}

	public void seteDept(String eDept) {
		this.eDept = eDept;
	}

	public double geteSalary() {
		return eSalary;
	}

	public void seteSalary(double eSalary) {
		this.eSalary = eSalary;
	}

	public LocalDate geteDateOfJoining() {
		return eDateOfJoining;
	}

	public void seteDateOfJoining(LocalDate eDateOfJoining) {
		this.eDateOfJoining = eDateOfJoining;
	}

	@Override
	public int hashCode() {
		return Objects.hash(eAge, eDateOfJoining, eDept, eId, eName, eSalary);
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
		return eAge == other.eAge && Objects.equals(eDateOfJoining, other.eDateOfJoining)
				&& Objects.equals(eDept, other.eDept) && eId == other.eId && Objects.equals(eName, other.eName)
				&& Double.doubleToLongBits(eSalary) == Double.doubleToLongBits(other.eSalary);
	}

	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", eAge=" + eAge + ", eDept=" + eDept + ", eSalary="
				+ eSalary + ", eDateOfJoining=" + eDateOfJoining + "]";
	}

}