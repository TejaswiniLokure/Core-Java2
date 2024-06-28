package com.te.Learnjava8.basicsofpoly;

public class Calcualtor {
	private int a;
	private int b;
	Calcualtor()
	{
		System.out.println("Calculator()!");
	}
	Calcualtor(int a)
	{
		System.out.println("Calculator(int a)!");
		this.a=a;
	}
	Calcualtor(int a,int b )
	{
		this(a);
		System.out.println("Calculator(int a,int b)!");
		this.b=b;
	}
	public void add(int a, int b)
	{
		System.out.print("Result: ");
		System.out.print(a+b);
	}
	public void add(int a, int b,int c)
	{
		System.out.print("Result: ");
		System.out.print(a+b+c);
	}

}
