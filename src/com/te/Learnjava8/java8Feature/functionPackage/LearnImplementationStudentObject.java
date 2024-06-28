package com.te.Learnjava8.java8Feature.functionPackage;

import java.util.Arrays;
import java.util.Comparator;

public class LearnImplementationStudentObject {
	public static void main(String[] args) {
		Student[] student= {new Student(123,"kaveri",32),new Student(321,"aruna",26),new Student(128,"akshay",29)};
//		Arrays.sort(student, new CompareByStuName());
//		Arrays.sort(student,new CompareByStuAge());
//		Arrays.sort(student,new CompareByStuId());
		System.out.println("by using lambda expression to CompareByStuId ");
		Comparator<Student> stu1=(s1,s2)->s1.getStuId()-s2.getStuId();
		Arrays.sort(student,stu1);
		for(int i=0;i<student.length;i++)
		{
			System.out.println(student[i]);
		}
		System.out.println("by using lambda expression to CompareByStuAge");
		Comparator<Student> stu2=(s1,s2)->s1.getStuAge()-s2.getStuAge();
		Arrays.sort(student,stu2);
		for(int i=0;i<student.length;i++)
		{
			System.out.println(student[i]);
		}
		System.out.println("by using lambda expression to CompareByStuName");
		Comparator<Student> stu3=(s1,s2)->s1.getStuName().compareTo(s2.getStuName());
		Arrays.sort(student,stu3);
		for(int i=0;i<student.length;i++)
		{
			System.out.println(student[i]);
		}
//		System.out.println(Arrays.toString(student));	
	
	}

}
//class CompareByStuName implements Comparator<Student>
//{
//
//	@Override
//	public int compare(Student o1, Student o2) {
//		// TODO Auto-generated method stub
//		return o1.getStuName().compareTo(o2.getStuName());
//	}
//	
//}
//class CompareByStuAge implements Comparator<Student>
//{
//
//	@Override
//	public int compare(Student o1, Student o2) {
//		// TODO Auto-generated method stub
//		return o1.getStuAge()-o2.getStuAge();
//	}
//	
//}
//class CompareByStuId implements Comparator <Student>{
//
//	@Override
//	public int compare(Student o1, Student o2) {
//		// TODO Auto-generated method stub
//		return o1.getStuId()-o2.getStuId();
//	}
//	
//}
