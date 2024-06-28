package com.te.Learnjava8.oop.inheritance;

public class Parent1 {
	int a=10;
	Parent1(){
		System.out.println(" parent super:"+super.toString());
		System.out.println("parent this:"+this.toString());
	}

	@Override
	public String toString() {
		return "Parent [a=" + a + "]";
	}
	

}
