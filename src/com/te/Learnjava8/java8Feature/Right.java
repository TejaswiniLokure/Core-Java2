package com.te.Learnjava8.java8Feature;

 interface Left {
	default void m1() {
		System.out.println("left default m1()");
	}

	default void m2() {
		System.out.println("left default m2()");
	}

}

interface Middle {
	default void m1() {
		System.out.println("middle default m1()");
	}

	default void m2() {
		System.out.println("middle default m2()");
	}

}

public interface Right {
	default void m1() {
		System.out.println("right default m1()");
	}

	default void m2() {
		System.out.println("right default m2()");
	}

	static void photo() {
		System.out.println("hello");
	}

}
