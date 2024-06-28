package com.te.Learnjava8.basicsofpoly;
   
class Animal{
	void sound() {
		System.out.println("sound of animal");
	}
}
class Dog extends Animal{
	void sound()
	{
		System.out.println("sound od dog");
	}
}
public class Poly {
	public static void main(String[] args) {
		Animal a=new Animal();
		Dog d=(Dog) a;//Downcast
		
		Animal a1=new Dog();//U
		Dog d1=(Dog) a1;//Downcast
	}

}
