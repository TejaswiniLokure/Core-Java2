package com.te.Learnjava8.objectClass;

public class Employee {
	private int employeeId;
	private int employeeAge;
	private String employeeName;
	Employee()
	{
		System.out.println("default constructor of employee class");
	}
	Employee(int employeeId,int employeeAge,String employeeName)
	{
		this.employeeId=employeeId;
		this.employeeAge=employeeAge;
		this.employeeName=employeeName;
		
	}
	@Override
	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + employeeAge;
//		result = prime * result + employeeId;
//		result = prime * result + ((employeeName == null) ? 0 : employeeName.hashCode());
		return this.employeeAge+this.employeeName.hashCode()+this.employeeId;
	}
	@Override
	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Employee other = (Employee) obj;
//		if (employeeAge != other.employeeAge)
//			return false;
//		if (employeeId != other.employeeId)
//			return false;
//		if (employeeName == null) {
//			if (other.employeeName != null)
//				return false;
//		} else if (!employeeName.equals(other.employeeName))
		Employee other =(Employee)obj;
		if(this.hashCode()==other.hashCode())
		
			return false;
		return true;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public int getEmployeeAge() {
		return employeeAge;
	}
	public void setEmployeeAge(int employeeAge) {
		this.employeeAge = employeeAge;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeAge=" + employeeAge + ", employeeName=" + employeeName
				+ "]";
	}
	

}
