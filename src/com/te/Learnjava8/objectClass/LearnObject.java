package com.te.Learnjava8.objectClass;

public class LearnObject {
	public static void main(String[] args) {
		Employee employee=new Employee(123,23,"teja");
		Employee employee1=new Employee(1243,23,"teja");
		Employee employee2=employee1;
		System.out.println(employee==employee2);
		System.out.println(employee1==employee);
		System.out.println(employee2==employee1);
		System.out.println(employee.hashCode());
		System.out.println(employee1.hashCode());
		System.out.println(employee2.hashCode());
		

		
	}

}
