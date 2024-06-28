package com.te.Learnjava8.java8Feature.streamAPI;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LearnEmployeeManagerStreamAPI {
	public static void main(String[] args) {
		List<EmployeeManger> employeemanager = new ArrayList<>();
		employeemanager.add(new EmployeeManger("Id123", "tejaswini", "It", " project manager", 32, 10, 18000.344, 3,
				true, LocalDate.of(2024, 4, 6)));
		employeemanager.add(new EmployeeManger("Id345", "rajeshree", "Sales", "product manager", 38, 15, 5000.435, 2,
				true, LocalDate.of(2020, 7, 3)));
		employeemanager.add(new EmployeeManger("Id103", "ashwini", "It", "senior manager", 28, 9, 280000.133, 1, false,
				LocalDate.of(2016, 5, 8)));
		employeemanager.add(new EmployeeManger("Id765", "sunita", "HR", "manager", 42, 22, 300000.233, 2, true,
				LocalDate.of(2021, 7, 6)));
		employeemanager.add(new EmployeeManger("Id987", "sakshi", "HR", "manager", 40, 20, 280000.232, 3, true,
				LocalDate.of(2022, 9, 4)));
		System.out.println("hii");
		/*
		 * Filter out all employees who are managers and have a salary greater than
		 * 100,000, but have joined in the last 3 years. Sort the remaining employees in
		 * descending order of their years of experience, and then by their performance
		 * ratings in ascending order. Return a new list containing the names of the
		 * remaining employees in uppercase
		 * 
		 */

		List<String> collect = employeemanager.stream()
				.filter(emp -> emp.getSalary() > 100000 && emp.getJobTitle() == "manager"
						&& LocalDate.now().getYear() - emp.getDateOfJoining().getYear() <= 3)
				.sorted(Comparator.comparingInt(EmployeeManger::getYearsOfExperience).reversed()
						.thenComparing(EmployeeManger::getPerformanceRating))

				.map(employee -> employee.getName().toUpperCase()).collect(Collectors.toList());
		collect.forEach(list -> System.out.println(list));




	}

}
