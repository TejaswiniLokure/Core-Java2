package com.te.Learnjava8.Collection.map;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
//class comparatorBasedOnrollNumber implements Comparator<StudentId>{
//
//	
//
//	@Override
//	public int compare(StudentId o1, StudentId o2) {
//		// TODO Auto-generated method stub
//		return o1.getRollNumber()-o2.getRollNumber();
//	}
//	
//}

public class LearnTreeMap {
public static void main(String[] args) {
//	comparatorBasedOnrollNumber list=new comparatorBasedOnrollNumber();
	Comparator<StudentId> list=(s1,s2)->s1.getRollNumber()-s2.getRollNumber();
	Map<StudentId,Student> map=new TreeMap(list);
	
	map.put( new StudentId("Rcu",14,'X') , new Student("teja",24,new StudentId("Rcu",14,'X')));
	map.put( new StudentId("vtu",13,'A') , new Student("vijju",24,new StudentId("vtu",13,'A')));
	map.put( new StudentId("jain",12,'Y') , new Student("raju",24,new StudentId("jain",12,'Y')));
	System.out.println(map);
	
}
}
