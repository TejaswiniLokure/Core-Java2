package com.te.Learnjava8.java8Feature.functionPackage;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Predicate;

import com.te.Learnjava8.Collection.map.StudentId;

public class LearnImplementaionOfEMployeeObject {
	public static void main(String[] args) {
		Employee[] emp = { new Employee(21, "tejaswi", 19), new Employee(31, "rajeshree", 24),
				new Employee(24, "kavita", 12) };
		Predicate<Integer> predicate = (empAge) -> empAge < 20;

		for (int i = 0; i < emp.length; i++) {
			if (predicate.test(emp[i].getEmpAge())) {
				System.out.println(emp[i]);
			}
		}
		System.out.println();
		System.out.println();

//		Arrays.sort(emp, new CompareByEmpId());
//		Arrays.sort(emp, new CompareByEmpAge());
//		Arrays.sort(emp, new CompareByEmpName());

//		Comparator<Employee> emp1=(s1,s2)->s1.getEmpId()-s2.getEmpId();
//		Comparator<Employee> emp2=(s1,s2)->s1.getEmpAge()-s2.getEmpAge();
		Comparator<Employee> emp3 = (s1, s2) -> s1.getEmpName().compareTo(s2.getEmpName());

//		Arrays.sort(emp, emp1);
//		Arrays.sort(emp,emp2);
//		Arrays.sort(emp,emp3);

		System.out.println("by using lambda expression to CompareByStuId ");
		Comparator<Employee> emp1 = (s1, s2) -> s1.getEmpId() - s2.getEmpId();
		Arrays.sort(emp, emp1);
		for (int i = 0; i < emp.length; i++) {
			System.out.println(emp[i]);
		}

		System.out.println("by using lambda expression to CompareByStuAge");
		Comparator<Employee> emp2 = (s1, s2) -> s1.getEmpAge() - s2.getEmpAge();
		Arrays.sort(emp, emp2);
		for (int i = 0; i < emp.length; i++) {
			System.out.println(emp[i]);
		}

		System.out.println("by using lambda expression to CompareByStuName");
		Comparator<Employee> emp4 = (s1, s2) -> s1.getEmpName().compareTo(s2.getEmpName());
		Arrays.sort(emp, emp4);
		for (int i = 0; i < emp.length; i++) {
			System.out.println(emp[i]);
		}
		System.out.print(Arrays.toString(emp));
	}
}
//	class CompareByEmpId implements Comparator<Employee> {
//
//		@Override
//		public int compare(Employee o1, Employee o2) {
//			// TODO Auto-generated method stub
//			return o1.getEmpId()-o2.getEmpId();
//		}
//
//	}
//	class CompareByEmpAge implements Comparator<Employee>{
//
//		@Override
//		public int compare(Employee o1, Employee o2) {
//			// TODO Auto-generated method stub
//			return o1.getEmpAge()-o1.getEmpAge();
//		}
//		
//	}
//class CompareByEmpName implements Comparator<Employee> {
//
//	@Override
//	public int compare(Employee o1, Employee o2) {
//		// TODO Auto-generated method stub
//		return o1.getEmpName().compareTo(o2.getEmpName());
//	}
//
//	
//	
//}
