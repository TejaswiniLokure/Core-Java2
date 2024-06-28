package com.te.Learnjava8.oop.encapsulation;

public class User {
	private int userid;
	private String username;
	private String userpassword;
	private String userMailId;
	private int userage;

	User() {

	}

	User(int userid, String username, String userpassword, String userMailId, int userage) {
		this.userid = userid;
		this.username = username;
		this.userpassword = userpassword;
		this.userMailId = userMailId;
		this.userage = userage;
	}

//	public int getUserid() {
//		return userid;
//	}
//
//	public void setUserid() {
//		this.userid = userid;
//	}
//
//	public String getUsername() {
//		return username;
//	}
//
//	public void setUsername() {
//		this.username = username;
//	}
//
//	public String getUserpassword() {
//		return userpassword;
//	}
//
//	public void setUserpassword() {
//		this.userpassword = userpassword;
//	}
//
//	public String getUserMailId() {
//		return userMailId;
//	}
//
//	public void setUserMailId() {
//		this.userMailId = userMailId;
//	}
//
//	public int getUserAge() {
//		return userage;
//	}
//
//	public void setUserAge() {
//		this.userage = userage;
//	}
//
	@Override
	public String toString() {
		return "User [userid=" + userid + ", username=" + username + ", userpassword=" + userpassword + ", userMailId="
				+ userMailId + ", userage=" + userage + "]";
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserpassword() {
		return userpassword;
	}

	public void setUserpassword(String userpassword) {
		
		if(userpassword.length()>8)
		{
			this.userpassword = userpassword;	
		}else{
			System.out.println("password contain atleast 8 char");
		}
	}

	public String getUserMailId() {
		return userMailId;
	}

	public void setUserMailId(String userMailId) {
		this.userMailId = userMailId;
	}

	public int getUserage() {
		return userage;
	}

	public void setUserage(int userage) {
		this.userage = userage;
	}

	
}
