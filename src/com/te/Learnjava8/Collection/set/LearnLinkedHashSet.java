package com.te.Learnjava8.Collection.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LearnLinkedHashSet {
	public static void main(String[] args) {
		Set<Employee> set= new LinkedHashSet();
		set.add(new Employee("teja",22,121));
		set.add(new Employee("name1",23,122));
		set.add(new Employee("name2",24,123));
		set.add(new Employee("teja",22,121));
		System.out.println(set);
	}

}
