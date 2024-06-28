package com.te.Learnjava8.java8Feature.functional;

import java.util.function.BiFunction;

public class TestBiFunction {
	public static void main(String[] args) {
		BiFunction<String, Integer, String> bifunction=(str,num)-> str+num;
		String str=bifunction.apply("hii", 40);
		System.out.println(str);
		
	}

}
