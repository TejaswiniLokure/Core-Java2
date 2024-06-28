package com.te.Learnjava8.oop.inheritance;

public class Admin extends Member {
	String adminName;
	
	 
//	public Admin() {
//		super();
//	}
	public Admin(String string) {
		super("member1");
		// TODO Auto-generated constructor stub
	}
	void addMember()
	{
		System.out.println("adding members");
	}
	void removeMember()
	{
		System.out.println("remove members");
	}
	void makeAdmin()
	{
		System.out.println("making as admin");
	}
	void removeAdmin()
	{
		System.out.println("remove as admin");
	}

}
