package com.te.Learnjava8.java8Feature.functional;

import java.util.function.Predicate;

public class TestPredicate {
	public static void main(String[] args) {
	
		Predicate<Integer> predicate=(m)->m>20;
		boolean test = predicate.test(40);
		System.out.println(test);
			
		
	}

}
