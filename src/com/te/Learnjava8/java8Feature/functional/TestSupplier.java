package com.te.Learnjava8.java8Feature.functional;

import java.util.function.Supplier;

public class TestSupplier {
	public static void main(String[] args) {
		Supplier<String> supplier = () -> "hello, world";

		System.out.println(supplier.get());

	}

}
