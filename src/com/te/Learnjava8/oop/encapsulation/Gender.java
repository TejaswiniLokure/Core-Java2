package com.te.Learnjava8.oop.encapsulation;

public enum Gender {

	MALE("male"),FEMALE("female"),OTHERS("others");
	String type;
	Gender()
	{
		
	}
	Gender(String type)
	{
		this.type=type;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
}
