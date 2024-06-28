package com.te.Learnjava8.designPattern.builder;

public class StudentBuilder {
	private int stuId;
	private double schoolFees;
	private String schoolName;
	private String schoolAddress;
	private int noOfStudents;
	private String subjects;
	private long studentMobileNo;
	public int getStuId() {
		return stuId;
	}
	public StudentBuilder setStuId(int stuId) {
		this.stuId = stuId;
		return this;
	}
	public double getSchoolFees() {
		return schoolFees;
	}
	public StudentBuilder setSchoolFees(double schoolFees) {
		this.schoolFees = schoolFees;
		return this;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public StudentBuilder setSchoolName(String schoolName) {
		this.schoolName = schoolName;
		return this;
	}
	public String getSchoolAddress() {
		return schoolAddress;
	}
	public StudentBuilder setSchoolAddress(String schoolAddress) {
		this.schoolAddress = schoolAddress;
		return this;
	}
	public int getNoOfStudents() {
		return noOfStudents;
	}
	public StudentBuilder setNoOfStudents(int noOfStudents) {
		this.noOfStudents = noOfStudents;
		return this;
	}
	public String getSubjects() {
		return subjects;
	}
	public StudentBuilder setSubjects(String subjects) {
		this.subjects = subjects;
		return this;
	}
	public long getStudentMobileNo() {
		return studentMobileNo;
	}
	public StudentBuilder setStudentMobileNo(long studentMobileNo) {
		this.studentMobileNo = studentMobileNo;
		return this;
	}
	public Student createStudent()
	{
		return new Student(stuId, schoolFees, schoolName, schoolAddress, noOfStudents, subjects, studentMobileNo);
		
	}
	


}
