package com.te.Learnjava8.oop.inheritance;

public class WhatsappGroup {
	public static void main(String[] args) {
//		Admin admin=new Admin();
//		Member member=new Admin();//upcasting
//		member.deleteMsg()	
//		Admin admin=new Member//
//	
//		Admin admin=(Admin)member;//downcasting
//		admin.sendMsg();
//		admin.addMember();
//		admin.deleteMsg();
//		admin.makeAdmin();
		Member member1=new Member("admin1");
		Member member2=new Member("admin2");
		Member member3=new Member("admin3");
		Member member4=new Member("admin4");
		//Downcasting
		if(member1 instanceof Admin)
		{
			Admin admin1=(Admin)member1;
		}
		else{
			System.out.println("member1 is not an admin");
		}
		
		//upcasting
		Admin admin=new Admin("Admin1");
		Member member=(Member)admin;
		
	} 

}
