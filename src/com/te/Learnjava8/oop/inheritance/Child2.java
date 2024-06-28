package com.te.Learnjava8.oop.inheritance;

public class Child2 extends Parent2 {
	int a=20;
	static void money()
	{
		
		System.out.println("money of child2");
	}
	public static void main(String[] args) {
//		Parent2 parent2=new Parent2();
//		parent2.money();
//		Child2 child2=(Child2) parent2;//classcaseException
//		Child2 child=new Child2();
//		Parent2 parent=child;
//		parent.money();
		
		Child2 child2=new Child2();
//		Parent2 parent2=new Parent2();
//		Child2 child3=(Child2) new Parent2();
		Parent2 parent2=new Parent2();
		Parent2 parent3=new Child2();
		parent3.money();
		parent2.money();
		child2.money();
		System.out.println(parent3.a);
		System.out.println(parent2.a);
		System.out.println(child2.a);
	}

}
