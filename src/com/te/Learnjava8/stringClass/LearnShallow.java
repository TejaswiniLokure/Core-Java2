package com.te.Learnjava8.stringClass;

public class LearnShallow {
 public static void main(String[] args) throws CloneNotSupportedException {
//	 Address address =new Address("bengalore","india");
//	 Employee emp1=new Employee(123,"teju",23,address);
//	 Employee emp3 = (Employee) emp1.clone();
//	 emp1.address.setCity("Pune");
//	 System.out.println(emp1);
//	 System.out.println(emp3);
	 Address address =new Address("bengalore","india");
	 Employee emp1=new Employee(123,"teju",23,address);
	 Employee emp3 = (Employee) emp1.clone1();
	 emp1.address.setCity("Pune");
	 System.out.println(emp1);
	 System.out.println(emp3);
	
	 
	
}
}
