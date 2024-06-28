package com.te.Learnjava8.basicsOfInterface;

 abstract class Abstractcls {
	 int x=20;
	  static double y=38.34;
	 static{
		 System.out.println("abstract static block");
	 }
	 {
		 System.out.println("abstract non static block");
	 }
	 static void  add()
	 {
		 System.out.println("abstract static method");
	 }
	 void sub()
	 {
		 System.out.println("abstract non static method");
	 }
	abstract void mul();
	abstract void div();
	public static void main(String[] args) {
		
	}
	 abstract class main{
		
	}
	 

}
