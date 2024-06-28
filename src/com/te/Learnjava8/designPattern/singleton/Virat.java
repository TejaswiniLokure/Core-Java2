package com.te.Learnjava8.designPattern.singleton;

import java.time.LocalDate;

public class Virat {
	private static Virat virat;
	private String name;
	private int age;
	private LocalDate dob;

	private Virat() {
		super();
		System.out.println("private constructor of virat class");
	}

	private Virat(String name, int age, LocalDate dob) {
		super();
		this.name = name;
		this.age = age;
		this.dob = dob;
	}
	public  static Virat getVirat()
	{
		if(virat==null)
		{
			virat=new Virat("kohali",33,LocalDate.of(1988, 5, 11));
			return virat;
		}
		return virat;
		
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public LocalDate getDob() {
		return dob;
	}

	@Override
	public String toString() {
		return "Virat [name=" + name + ", age=" + age + ", dob=" + dob + "]";
	}

}
