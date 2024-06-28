package com.te.Learnjava8.java8Feature.streamAPI;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class LearnEmployeeStreamAPI {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(18, "Chandana", 24, "IT", 50000, LocalDate.of(2019, 4, 5)));
		employees.add(new Employee(28, "vijayalaksmi", 44, "development", 157000, LocalDate.of(2010, 4, 5)));
		employees.add(new Employee(23, "rajeshree", 34, "development", 80000, LocalDate.of(2014, 4, 5)));
		employees.add(new Employee(22, "harish", 26, "IT", 67000, LocalDate.of(2020, 4, 5)));
		employees.add(new Employee(32, "jayashree", 28, "development", 48000, LocalDate.of(2020, 4, 5)));
		employees.add(new Employee(52, "ramesh", 38, "IT", 48000, LocalDate.of(2019, 4, 5)));
		employees.add(new Employee(82, "suresh", 23, "manager", 88000, LocalDate.of(2023, 4, 5)));
		employees.add(new Employee(42, "rakseh", 28, "manager", 58000, LocalDate.of(2025, 4, 5)));

//		Map<String, List<Employee>> groupedByDepartment = employees.stream()
//				.collect(Collectors.groupingBy(Employee::geteDept));

//		Map<Boolean, List<Employee>> collect = employees.stream().collect(Collectors.groupingBy(e->e.geteSalary()>50000));
//		Map<Boolean, List<Employee>> collect1 =employees.stream().collect(Collectors.groupingBy(g->g.geteSalary()<50000));

//        Map<String, List<Employee>> topEarnersByDepartment = new HashMap<>();
//        groupedByDepartment.forEach((department, managers) -> {
//            List<Employee> topEarners = managers.stream()
//                    .sorted(Comparator.comparingDouble(Employee::geteSalary).reversed())
//                    .limit(2)
//                    .collect(Collectors.toList());
////            topEarnersByDepartment.put(department, topEarners);
//        });
//        System.out.println(topEarnersByDepartment);

		/**
		 * average salary
		 */
//
//		Map<String, Double> departmentAverageSalary = employees.stream()
//				.collect(Collectors.groupingBy(Employee::geteDept, Collectors.averagingDouble(Employee::geteSalary)));
//		System.out.println("avarage salary of each department" + departmentAverageSalary);
		/**
		 * total salary
		 */
//		Map<String, Double> departmentsumSalary = employees.stream()
//				.collect(Collectors.groupingBy(Employee::geteDept, Collectors.summingDouble(Employee::geteSalary)));
//		System.out.println("total salary of each department " + departmentsumSalary);
//
		/**
		 * Earner in each department
		 **/

//		Map<String, List<Employee>> topEarnersBydept = employees.stream()
//				.collect(Collectors.groupingBy(Employee::geteDept,
//						Collectors.collectingAndThen(Collectors.toList(),
//								list -> list.stream()
//										.sorted(Comparator.comparingDouble(Employee::geteSalary).reversed()).limit(2)
//										.collect(Collectors.toList()))));
//		topEarnersBydept.forEach((department, topEarners) -> {
//			System.out.println("Department: " + department);
//			topEarners.forEach(System.out::println);
//		});

		/**
		 * 3. Employees Older than a Certain Age and Joined After a Specific Date: List
		 * all employees who are older than 30 and joined after January 1, 2020, sorted
		 * by their date of joining.
		 * 
		 * 
		 */

		List<Employee> filteredEmployees = employees.stream().filter(employee -> employee.geteAge() > 30)
				.filter(employee -> employee.geteDateOfJoining().isAfter(LocalDate.of(2020, 1, 1)))
				.sorted((e1, e2) -> e1.geteDateOfJoining().compareTo(e2.geteDateOfJoining()))
				.collect(Collectors.toList());

		filteredEmployees.forEach(System.out::println);

//		List<Employee> filteredEmployees =employees.stream().filter((age) -> age.geteAge() > ageThreshold)
//				.filter((age) -> age.geteDateOfJoining().isAfter(dateThreshold))
//				.sorted(Comparator.comparing(Employee::geteDateOfJoining)).collect(Collectors.toList());
//		filteredEmployees.forEach(System.out::println);

//		filteredEmployees.forEach((list)->System.out.println(list));

//				 List<Employee> filteredEmployees = employees.stream()
//			                .filter(e -> e.getAge() > ageThreshold)
//			                .filter(e -> e.getDateOfJoining().isAfter(dateThreshold))
//			                .sorted(Comparator.comparing(Employee::getDateOfJoining))
//			                .collect(Collectors.toList());
//
//			        filteredEmployees.forEach(System.out::println);

//		Consumer<Employee> increaseSalary = (employee) -> {
//			if (LocalDate.now().getYear() - employee.geteDateOfJoining().getYear() >= 2) {
//				employee.seteSalary(employee.geteSalary() * 1.5);
//
//			} else {
//				employee.seteSalary(employee.geteSalary() * 1.2);
//			}
//
//		};

//		employees.stream().forEach(increaseSalary);
//
//		for (Employee employee : employees) {
//			System.out.println(employee);
//
//		}

		/**
		 * . Employees by Department with Salary Above Threshold: Group employees by
		 * department, and within each department, find those with a salary above
		 * 40,000. Sort the results by salary in descending order.
		 */

//		Map<String, List<Employee>> groupedEmployees = employees.stream().filter(e -> e.geteSalary() > 40000)
////                .sorted(Comparator.comparingInt(Employee::geteSalary))
//				.sorted(Comparator.comparingDouble(Employee::geteSalary).reversed())
//				.collect(Collectors.groupingBy(Employee::geteDept));
//		for (Map.Entry<String, List<Employee>> entry : groupedEmployees.entrySet()) {
//			System.out.println("Department: " + entry.getKey());
//			for (Employee e : entry.getValue()) {
//				System.out.println(e);

		/**
		 * Average Age and Total Count by Salary Range: Partition employees into two
		 * groups: those earning more than 50,000 and those earning 50,000 or less, and
		 * for each group, calculate the average age and total count of employees.
		 */

//		Double collect = employees.stream()
//		.filter(e -> e.geteSalary() > 50000 && e.geteSalary() < 50000 && e.geteSalary() == 50000)
//				.collect(Collectors.averagingInt(age -> age.geteAge()));
//		collect.byteValue();
		/**
		 * Names and IDs of Top Earners Who Joined Recently: Find the names and IDs of
		 * the top 3 highest-paid employees who joined after January 1, 2021.
		 * 
		 * 
		 */

//		List<Employee> topEarners = employees.stream()
//				.filter(employee -> employee.geteDateOfJoining().isAfter(LocalDate.of(2021, 1, 1)))
//				.sorted((e1, e2) -> Double.compare(e2.geteSalary(), e1.geteSalary())).limit(3)
//				.collect(Collectors.toList());
//
//		// Print the names and IDs of the top earners
//		topEarners
//				.forEach(employee -> System.out.println("Name: " + employee.geteName() + ", ID: " + employee.geteId()));

		/**
		 * 7. Departments with Employees Over a Certain Age: Identify departments that
		 * have employees over the age of 35, and count the number of such employees in
		 * each department.
		 * 
		 */

//		Map<String, Long> departmentsWithEmployeeCount = employees.stream().filter(employee -> employee.geteAge() > 35)
//				.collect(Collectors.groupingBy(Employee::geteDept, Collectors.counting()));
//
//		// Print the results
//		departmentsWithEmployeeCount
//				.forEach((department, count) -> System.out.println("Department: " + department + ", Count: " + count));
		/**
		 * Employees in Specific Departments with High Salary: List the names of
		 * employees who work in either the "IT" or "HR" department and have a salary
		 * greater than 60,000, sorted by their name.
		 * 
		 * 
		 */
		List<String> employeeNames = employees.stream()
	            .filter(employee -> (employee.geteDept().equals("IT") || employee.geteDept().equals("HR")))
	            .filter(employee -> employee.geteSalary() > 60000)
	            .sorted((e1, e2) -> e1.geteName().compareTo(e2.geteName()))
	            .map(Employee::geteName)
	            .collect(Collectors.toList());

	        // Print the names of the employees
	        employeeNames.forEach(System.out::println);
	        /**
	         * Count of Employees by Department Who Joined in a Specific Year:
Group employees by their department and count how many joined in the year 2020.

	         */
	        
	        Map<String, Long> employeesByDepartment2020 = employees.stream()
	                .filter(employee -> employee.geteDateOfJoining().getYear() == 2020)
	                .collect(Collectors.groupingBy(Employee::geteDept, Collectors.counting()));

	            // Print the results
	            employeesByDepartment2020.forEach((department, count) -> 
	                System.out.println("Department: " + department + ", Count: " + count)
	            );
	            
	            /**
	             * Concatenate Names of Employees with High Salary in Each Department:
For each department, concatenate the names of employees who earn more than 70,000 into a single string separated by commas.

	             */
	            
	            Map<String, String> departmentEmployeesHighSalary = employees.stream()
	                    .filter(employee -> employee.geteSalary() > 70000)
	                    .collect(Collectors.groupingBy(Employee::geteDept,
	                                 Collectors.mapping(Employee::geteName, Collectors.joining(", "))));

	                // Print the results
	                departmentEmployeesHighSalary.forEach((department, names) -> 
	                    System.out.println("Department: " + department + ", Employees: " + names)
	                );

	}

}
