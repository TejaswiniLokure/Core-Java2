package com.te.Learnjava8.java8Feature;

public class LocalVariable {
	public static void main(String[] args) {
		String str="hello";
		Runnable runnable=()->{
		String str1="hii";
			System.out.println(str+" java");
		};
		runnable.run();
	}

}
