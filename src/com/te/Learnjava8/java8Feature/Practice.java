package com.te.Learnjava8.java8Feature;

public interface Practice {
	static void display()
	{
		System.out.println("display static method");
	}

}
class Mianclass{
	public static void main(String[] args) {
		Practice.display();
	}
	
}
