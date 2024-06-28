package com.te.Learnjava8.basicsofpoly;

public class CompileTimePoly2 {
	public static void main(String[] args) {
		
		A a1= new A();
//		B b1=(B) new A();//classcaseException
		A a2= new B();
		B b2=new B();
		System.out.println(a1.a);
		System.out.println(a2.a);
		System.out.println(b2.a);
		a1.m1();
		a2.m1();//CompileTime ploymorphism so Overloading
		b2.m1();
		a1.m2();
		a2.m2();//RunTime ploymorphism so it is overriding
		b2.m2();
		}
	/*
	 * for variable shadowing the type of the reference variable matters
	 * 
	 * Case 1:A a1 =new A();Here reference variable is of type A and also the Object created.But only 
	 * reference varaible type is considered.so,when we call a1.a;we get the result 10;
	 * 
	 * Case 2: A a2=new B();Here the reference type is of A class,but the object is of B class
	 * .And as in variable shadowing only reference type is considered,when we perform a2.a we still 
	 * get 10.Data of a stored in class B object is not considered.
	 * 
	 * Case 3:B b2= new B();In this case reference and object are of same type so 
	 * B class 'a' variable was used
	 */

}
class A{
	int a=10;
	public static void m1()
	{
		System.out.println("m1() from A!");
	}
	public void m2()
	{
		System.out.println("m2() from A!");
	}
}
class B extends A{
	int a=20;
	public static void m1()
	{
		System.out.println("m1() from B!");
	}
	public void m2()
	{
		System.out.println("m2() from B!");
	}
}