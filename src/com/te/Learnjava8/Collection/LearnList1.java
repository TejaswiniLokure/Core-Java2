package com.te.Learnjava8.Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;

public class LearnList1 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(50);
		list.add(70);
		list.add(100);
//		list.add(null);

	System.out.println(list);
	Set <Integer> set=new TreeSet(list);
	System.out.println(set);
//	for(int i=0;i<list.size();i++)
//	{
//		System.out.print(list.get(i)+ " ");
//	}
//	System.out.println();	

//	for(Integer a1:list)
//	{
//	 System.out.print(a1+" ");
//	 
//	}
//	System.out.println();
//		Iterator<Integer> iterator =list.iterator();
//		while(iterator.hasNext())
//		{
//			System.out.print(iterator.next()+" ");
//		}
//		System.out.println();

//		ListIterator<Integer> listiterator=list.listIterator(list.size());
//		while(listiterator.hasPrevious())
//		{
//			System.out.print(listiterator.previous()+" ");
//		}
//		System.out.println();
		//by stream method
//		System.out.println("stream");
//		list.stream().forEach(c-> System.out.print(c+" "));
		
//		Object[] array=list.toArray();
//		System.out.println(Arrays.toString(array));
		
	}

}
