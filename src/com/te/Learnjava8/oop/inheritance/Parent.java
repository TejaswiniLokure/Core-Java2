package com.te.Learnjava8.oop.inheritance;

public class Parent {
	int a=10;
	
	Parent(){
		System.out.println(" parent super:"+super.hashCode());
		System.out.println("parent this:"+this.hashCode());
	}

	@Override
	public String toString() {
		return "Parent [a=" + a + "]";
	}
	
	

}

