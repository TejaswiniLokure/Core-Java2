package com.te.Learnjava8.objectClass;

public class Student {
	private int studentID;
	private String studentName;
	private long studentMobileNo;
	Student()
	{
		System.out.println("this is a default constructor of student class");
	}
	
	 @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + studentID;
		result = prime * result + (int) (studentMobileNo ^ (studentMobileNo >>> 32));
		result = prime * result + ((studentName == null) ? 0 : studentName.hashCode());
		return result;
	}

//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Student other = (Student) obj;
//		if (studentID != other.studentID)
//			return false;
//		if (studentMobileNo != other.studentMobileNo)
//			return false;
//		if (studentName == null) {
//			if (other.studentName != null)
//				return false;
//		} else if (!studentName.equals(other.studentName))
//			return false;
//		return true;
//	}

	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", studentName=" + studentName + ", studentMobileNo="
				+ studentMobileNo + "]";
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public long getStudentMobileNo() {
		return studentMobileNo;
	}

	public void setStudentMobileNo(long studentMobileNo) {
		this.studentMobileNo = studentMobileNo;
	}

	Student(int studentID, String studentName, long studentMobileNo) {
		super();
		this.studentID = studentID;
		this.studentName = studentName;
		this.studentMobileNo = studentMobileNo;
	}


}
