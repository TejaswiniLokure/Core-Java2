package com.te.Learnjava8.Collection.set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

//class ComparatorBasedOnName implements Comparator<Employee> {
//
//	@Override
//	public int compare(Employee o1, Employee o2) {
//		// TODO Auto-generated method stub
//		return o1.getEmpName().compareTo(o2.getEmpName());
//	}
//
//}
//
//class COmparatorBasedOnAge implements Comparator<Employee> {
//
//	@Override
//	public int compare(Employee o1, Employee o2) {
//		// TODO Auto-generated method stub
//		return o1.getEmpAge() - o2.getEmpAge();
//	}
//
//}

public class LearnTreeSet {
	public static void main(String[] args) {
//		COmparatorBasedOnAge comparatorbasedonage=new COmparatorBasedOnAge();
//		ComparatorBasedOnName compare = new ComparatorBasedOnName();
//		Set<Employee> set= new TreeSet(comparatorbasedonage.reversed());
//		Set<Employee> set = new TreeSet(compare);
		Set<Employee> set = new TreeSet();
		set.add(new Employee("tejas", 25, 123));
		set.add(new Employee("vijju", 22, 124));
		set.add(new Employee("abhi", 21, 125));
//		set.add(null);
//		set.add(null);
		set.add(new Employee("name2", 26, 124));
		System.out.println(set);

	}

}
