package com.te.Learnjava8.designPattern.builder;

public class Student {
	private int stuId;
	private double schoolFees;
	private String schoolName;
	private String schoolAddress;
	private int noOfStudents;
	private String subjects;
	private long studentMobileNo;
	public Student() {
		super();
		System.out.println("default constructor of student class");
	}
		public Student(int stuId, double schoolFees, String schoolName, String schoolAddress, int noOfStudents,
			String subjects, long studentMobileNo) {
		super();
		this.stuId = stuId;
		this.schoolFees = schoolFees;
		this.schoolName = schoolName;
		this.schoolAddress = schoolAddress;
		this.noOfStudents = noOfStudents;
		this.subjects = subjects;
		this.studentMobileNo = studentMobileNo;
	}
				@Override
		public String toString() {
			return "Student [stuId=" + stuId + ", schoolFees=" + schoolFees + ", schoolName=" + schoolName
					+ ", schoolAddress=" + schoolAddress + ", noOfStudents=" + noOfStudents + ", subjects=" + subjects
					+ ", studentMobileNo=" + studentMobileNo + "]";
		}


}
