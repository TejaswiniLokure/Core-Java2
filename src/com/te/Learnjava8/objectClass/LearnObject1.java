package com.te.Learnjava8.objectClass;

public class LearnObject1 {
	public static void main(String[] args) {
		Student student=new Student(123,"name1",762344588);
		Student student1=new Student(124,"name2",762344589);
		Student student2=student;
		System.out.println(student.equals(student1));
		System.out.println(student1.equals(student2));
		System.out.println(student.equals(student2));
		System.out.println(student.hashCode());
		System.out.println(student1.hashCode());
		System.out.println(student2.hashCode());
		System.out.println(student==student1);
		System.out.println(student1==student2);
		System.out.println(student==student2);
	}
}
