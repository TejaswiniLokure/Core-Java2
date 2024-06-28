package com.te.Learnjava8.Collection.set;

import java.util.HashSet;
import java.util.Set;

public class LearnHashSet {
	public static void main(String[] args) {
		Set<Employee> set=new HashSet();
		set.add(new Employee("teja",24,123));
		set.add(new Employee("name2",23,124));
		set.add(new Employee("name3",24,125));
		set.add(new Employee("name4",25,126));
	   System.out.println(set);
	}

}
