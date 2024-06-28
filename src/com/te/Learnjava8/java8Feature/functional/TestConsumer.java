package com.te.Learnjava8.java8Feature.functional;

import java.util.function.Consumer;

public class TestConsumer {
	public static void main(String[] args) {
		Consumer<Integer> consumer=(n)->System.out.println("hello didi");
		consumer.accept(22);
		
	}

}
