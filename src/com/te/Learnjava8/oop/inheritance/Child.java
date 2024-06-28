package com.te.Learnjava8.oop.inheritance;

public class Child extends Parent {
	int b=20;
	
	Child()
	{
		System.out.println("child super:"+super.hashCode());
		System.out.println("child this:"+this.hashCode());
	}

	@Override
	public String toString() {
		return "Child [b=" + b + "]";
	}

}
