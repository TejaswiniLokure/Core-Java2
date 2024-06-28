package com.te.Learnjava8.java8Feature.streamAPI2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ImplemetationOfStudent {

	public static void main(String[] args) {
		List<Student> students = new ArrayList();
		Map<String, Integer> map = new HashMap<>();
		map.put("maths", 78);
		map.put("science", 67);
		map.put("kannada", 93);
		map.put("English", 78);
		Map<String, Integer> map1 = new HashMap<>();
		map1.put("maths", 76);
		map1.put("science", 65);
		map1.put("kannada", 84);
		map1.put("English", 78);
		Map<String, Integer> map2 = new HashMap<>();
		map2.put("maths", 40);
		map2.put("science", 35);
		map2.put("kannada", 42);
		map2.put("English", 60);
		Map<String, Integer> map3 = new HashMap<>();
		map3.put("maths", 93);
		map3.put("science", 90);
		map3.put("kannada", 84);
		map3.put("English", 92);
		Map<String, Integer> map4 = new HashMap<>();
		map4.put("maths", 76);
		map4.put("science", 65);
		map4.put("kannada", 84);
		map4.put("English", 78);

		students.add(new Student("tejaswini", 123, Ratings.BELOWAVERAGE, (map)));
		students.add(new Student("vijayalakshmi", 128, Ratings.BELOWAVERAGE, (map1)));
		students.add(new Student("rajeshree", 124, Ratings.BELOWAVERAGE, (map2)));
		students.add(new Student("sunita", 122, Ratings.BELOWAVERAGE, (map3)));
		students.add(new Student("rekha", 121, Ratings.ABOVEAVERAGE, (map4)));


		
		students.stream().forEach(employee->{
			List<Integer> list = employee.getMarks().values().stream().collect(Collectors.toList());
			System.out.println(list);
			 Integer ave= list.stream().reduce(0,(e1,e2)->e1+e2)/list.size();
			 
			 
			
		});
//		Function<Map<String, Integer>, Integer> avgMarks = m -> m.values().stream().mapToInt(e -> e.intValue()).sum()
//				/ m.size();
//		students.forEach(s -> {
//			if (avgMarks.apply(s.getMarks()) >= 90)
//				s.setRating(Ratings.EXCELLENT);
//			else if (avgMarks.apply(s.getMarks()) >= 80)
//				s.setRating(Ratings.GOOD);
//			else if (avgMarks.apply(s.getMarks()) >= 70)
//				s.setRating(Ratings.ABOVEAVERAGE);
//
//			else if (avgMarks.apply(s.getMarks()) >= 60)
//				s.setRating(Ratings.AVERAGE);
//			else if (avgMarks.apply(s.getMarks()) <50)
//				s.setRating(Ratings.BELOWAVERAGE);
//
//		});
//		List<Student> collect = students.stream().filter(s -> s.getRating() != Ratings.GOOD)
//				.filter(e -> e.getRating() != Ratings.BELOWAVERAGE).collect(Collectors.toList());
//		collect.forEach(System.out::println);

	}

}
