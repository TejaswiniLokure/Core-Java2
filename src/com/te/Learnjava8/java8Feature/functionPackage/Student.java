package com.te.Learnjava8.java8Feature.functionPackage;

import java.util.Objects;

public class Student {
	private int stuId;
	private String stuName;
	private int stuAge;
	public Student() {
		System.out.println("default constructor of student class");
		// TODO Auto-generated constructor stub
	}
	public Student(int stuId, String stuName, int stuAge) {
		
		this.stuId = stuId;
		this.stuName = stuName;
		this.stuAge = stuAge;
	}
	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", stuName=" + stuName + ", stuAge=" + stuAge + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(stuAge, stuId, stuName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return stuAge == other.stuAge && stuId == other.stuId && Objects.equals(stuName, other.stuName);
	}
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public int getStuAge() {
		return stuAge;
	}
	public void setStuAge(int stuAge) {
		this.stuAge = stuAge;
	}

}
