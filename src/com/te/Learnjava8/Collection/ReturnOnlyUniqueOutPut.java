package com.te.Learnjava8.Collection;

import java.util.ArrayList;

public class ReturnOnlyUniqueOutPut {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>();
		ArrayList<String> list1=new ArrayList<>();
		list.add("hii");
		list.add(null);
		list.add(null);
		list.add("hii");
		list.add("bye");
		for(String str:list)
		{
			int count=0;
			for(String str1:list)
			{
				if(str==str1)
				{
					count++;
				}
				
			}
			if(count==1)
			{
				System.out.println(list1.add(str));
			}
			
		}
		System.out.println(list1);
	}

}
