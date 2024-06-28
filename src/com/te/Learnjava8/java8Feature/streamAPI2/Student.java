package com.te.Learnjava8.java8Feature.streamAPI2;

import java.util.Map;
import java.util.Objects;

public class Student {
	private String stuname;
	private int stuid;
	private Ratings rating;
	private Map<String, Integer> marks;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String stuname, int stuid, Ratings rating, Map<String, Integer> marks) {
		super();
		this.stuname = stuname;
		this.stuid = stuid;
		this.rating = rating;
		this.marks = marks;
	}

	public String getStuname() {
		return stuname;
	}

	public void setStuname(String stuname) {
		this.stuname = stuname;
	}

	public int getStuid() {
		return stuid;
	}

	public void setStuid(int stuid) {
		this.stuid = stuid;
	}

	public Ratings getRating() {
		return rating;
	}

	public void setRating(Ratings rating) {
		this.rating = rating;
	}

	public Map<String, Integer> getMarks() {
		return marks;
	}

	public void setMarks(Map<String, Integer> marks) {
		this.marks = marks;
	}

	@Override
	public int hashCode() {
		return Objects.hash(marks, rating, stuid, stuname);
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
		return Objects.equals(marks, other.marks) && rating == other.rating && stuid == other.stuid
				&& Objects.equals(stuname, other.stuname);
	}

	@Override
	public String toString() {
		return "Student [stuname=" + stuname + ", stuid=" + stuid + ", rating=" + rating + ", marks=" + marks + "]";
	}

}
