package com.te.Learnjava8.designPattern.builder;

public class LearnStudentClassBuilder {
	public static void main(String[] args) {

		Student setSchoolAddress = new StudentBuilder().setStuId(12).setSchoolName("Tejaswini")
				.setSchoolAddress("belagavi").createStudent();
		 

		System.out.println(setSchoolAddress);
		Student setSchoolAddress1 = new StudentBuilder().setStuId(12).setSchoolName("rajendra")
				.setSchoolAddress("belagavi").createStudent();
		 

		System.out.println(setSchoolAddress1);

	}

}
