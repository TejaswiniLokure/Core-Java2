package com.te.Learnjava8.oop.encapsulation;

public class LearnEnacpsulation1 {


	//	enum Gender{
//		MALE,
//		FEMALE,
//		OTHER
//	}
	public static void main(String[] args) {
		Employee employee = new Employee();
		Address address = new Address();
		employee.setGender(Gender.FEMALE);
		Department department=new Department();
		employee.setEmpName("tejaswini");
		employee.setEmployeeId(132444);
		employee.setEmpPhoneNumber(2389576858l);
		employee.setEmpMailId("dffmre@kmf");
		address.setPincode(3049856);
		address.setCountry("india");
		address.setCity("bangalore");
		department.setDeptId(485);
		employee.setDepartment(department);
		department.setDeptLocation("basavangudi");
		department.setDeptname("Development");
//		employee.setAddress(address);
//		employee.setAddress(address);
//		employee.addressHelper();
//		employee.setAddress(address);
		employee.setAddress(address);
		System.out.println(employee);
	    

	}

}
