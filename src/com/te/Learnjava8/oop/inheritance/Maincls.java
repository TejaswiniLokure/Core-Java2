package com.te.Learnjava8.oop.inheritance;
  
public class Maincls {
	public static void main(String[] args) {
//		Animal ani=new Animal();
//		  ani.eat();
//		  Dog dog=(Dog) ani;
		 Animal ani=new Dog();
		 ani.eat();
		 Dog dog=(Dog)ani;
		 dog.eat();
		  
	}

}
class Animal{
	void eat(){
		System.out.println("animal food");
	}
}
class Dog extends Animal
{
	void eat()
	{
		System.out.println("dog food");
	}
}