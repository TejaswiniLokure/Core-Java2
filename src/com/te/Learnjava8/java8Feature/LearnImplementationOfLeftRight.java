package com.te.Learnjava8.java8Feature;

public class LearnImplementationOfLeftRight  implements Left,Middle,Right{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("default method of LearnImplementationOfLeftRight");

	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		Left.super.m2();
	}

}
