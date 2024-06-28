package com.te.Learnjava8.firstMock;

import java.util.function.Function;

interface Practice1{
	 String pwd="java";

	
	}
 abstract class Practice implements Practice1 {
	 public static void main(String[] args) {
	 Function<Integer,Integer> square	=(x)->x*x;
		System.out.println(square);
	 
 
 }
 }

