package com.te.Learnjava8.Collection.map;

import java.util.Objects;

public class Student {
	private String stuName;
	private int stuAge;
	private StudentId stuId;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String stuName, int stuAge, StudentId stuId) {
		super();
		this.stuName = stuName;
		this.stuAge = stuAge;
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

	public StudentId getStuId() {
		return stuId;
	}

	public void setStuId(StudentId stuId) {
		this.stuId = stuId;
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
		return stuAge == other.stuAge && Objects.equals(stuId, other.stuId) && Objects.equals(stuName, other.stuName);
	}

	@Override
	public String toString() {
		return "Student [stuName=" + stuName + ", stuAge=" + stuAge + ", stuId=" + stuId + "]";

	}

}
