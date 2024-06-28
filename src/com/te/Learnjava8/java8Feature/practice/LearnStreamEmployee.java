package com.te.Learnjava8.java8Feature.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;

public class LearnStreamEmployee {
	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(
				new Employee(1, "Alice", 90000, "Development", 30, Arrays.asList("Ecommerce", "Finance"), 2),
				new Employee(2, "Bob", 120000, "HR", 40, Arrays.asList("Recruitment", "Training"), 4),
				new Employee(3, "Charlie", 110000, "Marketing", 35, Arrays.asList("SEO", "Content Marketing"), 3),
				new Employee(4, "David", 95000, "Development", 28,
						Arrays.asList("Web Development", "Mobile Development"), 2),
				new Employee(5, "Eve", 130000, "Finance", 45, Arrays.asList("Investment Banking", "Corporate Finance"),
						5),
				new Employee(6, "Frank", 85000, "Customer Support", 32,
						Arrays.asList("Tech Support", "Customer Relations"), 1),
				new Employee(7, "Grace", 115000, "Development", 38,
						Arrays.asList("Backend Development", "API Development"), 4),
				new Employee(8, "Hank", 98000, "Development", 29, Arrays.asList("Frontend Development", "UI/UX Design"),
						1),
				new Employee(9, "Ivy", 150000, "Management", 50,
						Arrays.asList("Project Management", "Strategic Planning"), 6),
				new Employee(10, "Jack", 105000, "Development", 36, Arrays.asList("Database Management", "Security"),
						3));
		/**
		 * Given a list of Employee objects, write a program to calculate the total
		 * salary paid to employees in each department. Output the department name along
		 * with the total salary.Top-N Salaries
		 */

//	 employees.stream()
//			.collect(Collectors.groupingBy(Employee::getDepartment))
//			.forEach((dept,Elist)->{
//				System.out.println(dept);
//				Double totalSal = Elist.stream().collect(Collectors.summingDouble(Employee::getSalary));
//				System.out.println("total salary of "+dept+"is "+totalSal);
//				
//			});
		 employees.stream().collect(Collectors.groupingByConcurrent(Employee::getDepartment,
				Collectors.summingDouble(Employee::getSalary))).forEach((dept,sum)->{
					System.out.println("total salary "+sum+" dept is "+dept);
				});
	

	}

}
