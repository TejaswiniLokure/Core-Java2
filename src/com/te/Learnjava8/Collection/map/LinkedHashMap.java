package com.te.Learnjava8.Collection.map;

import java.util.Map;

public class LinkedHashMap {
	public static void main(String[] args) {
		java.util.LinkedHashMap<StudentId,Student> linkedhashmap=new java.util.LinkedHashMap();
		linkedhashmap.put(new StudentId("vtu",23,'A'),new Student("teja",24,new StudentId("vtu",23,'A')));
		linkedhashmap.put(new StudentId("vtu1",23,'A'),new Student("teja3",24,new StudentId("vtu",23,'A')));
		linkedhashmap.put(new StudentId("vtu2",23,'A'),new Student("teja4",24,new StudentId("vtu",23,'A')));
		for(Map.Entry<StudentId,Student> list:linkedhashmap.entrySet())
		{
			System.out.println("keys"+list.getKey()+"value" +list.getValue());
		}
		
	}

}
