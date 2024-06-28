package com.te.Learnjava8.designPattern.factory;

import java.util.Scanner;

public class LearnFactoryMethod {
	private static AndroidOS getters;

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String OsType=scanner.next();
		OsFactory osFactory = new OsFactory();
		AndroidOS getters = OsFactory.getters(OsType);
		getters.performance();
		getters.security();
		getters.ui();
	}

}
