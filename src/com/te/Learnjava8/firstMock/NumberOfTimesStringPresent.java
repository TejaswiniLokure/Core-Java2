package com.te.Learnjava8.firstMock;

public class NumberOfTimesStringPresent {
	public static void main(String[] args) {
		String str="java is a programming language java is java";
		String s="java";
		int count=0;
		String[] s1=str.split("");
		for(int i=0;i<s1.length;i++)
		{
			if(s1.equals(s1[i]))
			{
				count++;
			}
		}
		System.out.println(s+" ->" +count+"Times");
		
	}

}
