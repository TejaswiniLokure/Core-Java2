package com.te.Learnjava8.oop.encapsulation;

public class Employee {
	
	private int employeeId;
	private String empName;
	private String empMailId;
	private long empPhoneNumber;
    private Address address;
    private Gender gender;
//    private Department department=new Department(64,"jghk","rdfdg");
    private Department department;
    
	//early initialization
//	private Address address=new Address("Bangalore","india",39287489);

	Employee() {

	}

	Employee(int employeeId, String empName, String empMailId, long empPhoneNumber) {
		this.employeeId = employeeId;
		this.empName = empName;
		this.empMailId = empMailId;
		this.empPhoneNumber = empPhoneNumber;
	}

	
	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", empName=" + empName + ", empMailId=" + empMailId
				+ ", empPhoneNumber=" + empPhoneNumber + ", address=" + address + ", gender=" + gender + ", department="
				+ department + "]";
	}

	public Address getAddress() {
		return address;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpMailId() {
		return empMailId;
	}

	public void setEmpMailId(String empMailId) {
		this.empMailId = empMailId;
	}

	public long getEmpPhoneNumber() {
		return empPhoneNumber;
	}

	public void setEmpPhoneNumber(long empPhoneNumber) {
		this.empPhoneNumber = empPhoneNumber;
	}
	//helper method
	public void addressHelper()
	{
		this.address=new Address("Bangalore","India",3846597);
	}
	public void addressHelper(Address adress)
	{
		this.address=adress;
	}
	//helper method
	public void departmentHelper()
	{
		this.department=new Department(323,"trerdf","rwesxdf");
	}
	public void departmentHelper(Department department)
	{
		this.department=department;
	}

}
