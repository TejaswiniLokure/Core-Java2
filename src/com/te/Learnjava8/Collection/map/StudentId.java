package com.te.Learnjava8.Collection.map;

import java.util.Objects;

public class StudentId implements Comparable<StudentId> {
	private String universityCode;
	private int rollNumber;
	private char section;

	@Override
	public int hashCode() {
		return Objects.hash(rollNumber, section, universityCode);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentId other = (StudentId) obj;
		return rollNumber == other.rollNumber && section == other.section
				&& Objects.equals(universityCode, other.universityCode);
	}

	@Override
	public String toString() {
		return "StudentId [universityCode=" + universityCode + ", rollNumber=" + rollNumber + ", section=" + section
				+ "]";
	}

	public String getUniversityCode() {
		return universityCode;
	}

	public void setUniversityCode(String universityCode) {
		this.universityCode = universityCode;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public char getSection() {
		return section;
	}

	public void setSection(char section) {
		this.section = section;
	}

	StudentId() {
		System.out.println("default constructor of studentId class");
	}

	public StudentId(String universityCode, int rollNumber, char section) {

		this.universityCode = universityCode;
		this.rollNumber = rollNumber;
		this.section = section;
	}

	

	@Override
	public int compareTo(StudentId o) {
		// TODO Auto-generated method stub
		return this.getRollNumber()-o.getRollNumber();
	}

}
