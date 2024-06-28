package com.te.Learnjava8.java8Feature.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ImplementationOfStream {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("bhanu", "akshay", "vijju", "teju");
		List<String> map=list.stream().map(name->name.concat("hii")).collect(Collectors.toList());
		System.out.println(map);
		/**
		 * implementing filter
		 */
//          List<String> result = list.stream().filter(name->name.startsWith("o")).collect(Collectors.toList());
//		System.out.println(result);
		/**
		 * implementing map
		 */
//		List<String> result1 = list.stream().filter(name -> name.startsWith("o")).map(name1 -> name1.concat("hii"))
//
//				.collect(Collectors.toList());
//		System.out.println(result1);
		/**
		 * implementing flatmap
		 */
//		List<String> result = list.stream().filter(name -> name.startsWith("o"))
//				.flatMap((list1) -> Arrays.stream(list1.split(" "))).collect(Collectors.toList());
//		System.out.println(result);
		/**
		 * implementing sort
		 */

//		List<String> sort = list.stream().sorted().collect(Collectors.toList());
//		System.out.println(sort);
		
		/**
		 * implementing foreach
		 */
		List<Integer> number= Arrays.asList(3,2,5,7,1,9);
		List<Integer> num = number.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());

       System.out.println(num);      
		
		

	}

}
