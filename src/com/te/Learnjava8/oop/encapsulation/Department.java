package com.te.Learnjava8.oop.encapsulation;

public class Department {
	private int deptId;
	private String deptname;
	private String deptLocation;
	
	
	Department(){
		
	}
	Department(int deptId,String deptname,String deptLocation)
	{
		this.deptId=deptId;
		this.deptname=deptname;
		this.deptLocation=deptLocation;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	public String getDeptLocation() {
		return deptLocation;
	}
	public void setDeptLocation(String deptLocation) {
		this.deptLocation = deptLocation;
	}
	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptname=" + deptname + ", deptLocation=" + deptLocation + "]";
	}
	

}
