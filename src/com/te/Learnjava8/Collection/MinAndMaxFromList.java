package com.te.Learnjava8.Collection;

import java.util.ArrayList;
import java.util.TreeSet;

public class MinAndMaxFromList {
	public static void main(String[] args) {
		ArrayList<Integer> arraylist=new ArrayList<>();
		arraylist.add(24);
		arraylist.add(34);
		arraylist.add(44);
		arraylist.add(14);
		arraylist.add(04);
		arraylist.add(34);
		arraylist.add(54);
		TreeSet<Integer> treeset=new TreeSet<>(arraylist);
		System.out.println("minimum value is "+ treeset.first()+" maximumu value is "+ treeset.last());
	}

}
