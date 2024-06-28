package com.te.Learnjava8.Collection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;

public class LearnLinkedList {
	public static void main(String[] args) {
		List<String> list=new LinkedList();
		list.add("java");
//		list.add(null);
		list.add("java");
		list.add("web");
		list.add("python");
		list.add("program");
//		System.out.println(list);
		Set<String> set=new TreeSet(list);
		System.out.println(set);
//		System.out.println(list);
//		for(int i=0;i<list.size();i++)
//		{
//			System.out.print(list.get(i)+" ");
//		}
//		System.out.println();
//		for(String s1:list)
//		{
//			System.out.print(s1+" ");
//		}
//		System.out.println();
//		Iterator<String> iterator=list.iterator();
//		while(iterator.hasNext()) {
//			System.out.print(iterator.next()+" ");
//		}
//		ListIterator<String> listiterator=list.listIterator(list.size());
//		{
//			while(listiterator.hasPrevious())
//			{
//				System.out.print(listiterator.previous()+" ");
//			}
		
//		}
		
//		System.out.println("stream");
//		list.stream().forEach(c-> System.out.println(c+" ") );
		Object[] array=set.toArray();
		System.out.println(Arrays.toString(array));
		
	}

	

}
