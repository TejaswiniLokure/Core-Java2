package com.te.Learnjava8.java8Feature.functional;

import java.util.function.Function;

public class TestFunction {
	public static void main(String[] args) {
		Function<String, Integer> function=(s)->s.length();
	    String sam="hello";
	    function.apply(sam);
	    System.out.println("the length of the string "+sam);
	}

}
