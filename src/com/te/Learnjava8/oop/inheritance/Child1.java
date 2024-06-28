package com.te.Learnjava8.oop.inheritance;

public class Child1 extends Parent1{
int b=20;
	
	Child1()
	{
		System.out.println("child super:"+super.toString());
		System.out.println("child this:"+this.toString());
	}

	@Override
	public String toString() {
		return "Child [b=" + b + "]";
	}

}
