package com.te.Learnjava8.java8Feature.streamAPI;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class LearnManagerStreamAPI {
	public static void main(String[] args) {
		List<Manager> manager = new ArrayList<>();
		manager.add(new Manager(123, "tejaswini", 23, "development", 50000, LocalDate.of(2024, 5, 4)));
		manager.add(new Manager(133, "Rajeshree", 20, "IT", 105000, LocalDate.of(2020, 8, 2)));
		manager.add(new Manager(113, "vijayalakshmi", 43, "sales", 165000, LocalDate.of(2021, 7, 9)));
		manager.add(new Manager(103, "sunit", 53, "Testing", 180000, LocalDate.of(2019, 5, 3)));
		manager.add(new Manager(153, "sangeetha", 33, "designing", 150000, LocalDate.of(2015, 3, 20)));
		manager.add(new Manager(143, "sakshi", 28, "development", 90000, LocalDate.of(2013, 8, 4)));

		Map<String, List<Manager>> groupedByDepartment = manager.stream()
				.collect(Collectors.groupingBy(Manager::getmDept));
//		           (manager)->{
//		        	   if(manager.forEach(t -> ))
//		           };
		
		
		
//		System.out.println(groupedByDepartment);
//		Consumer<Manager> manager=(totalsal)=>{
//			
//			
//		};

	}

}
