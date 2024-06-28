package com.te.Learnjava8.Collection.map;

import java.util.HashMap;
import java.util.Map;

public class LearnHashMap {
	public static void main(String[] args) {
		Map<StudentId,Student> map= new HashMap();
		map.put( new StudentId("Rcu",12,'x') , new Student("teja",24,new StudentId("Rcu",12,'x')));
		map.put(new StudentId("rcu1",13,'y'),new Student("teja",24,new StudentId("Rcu",12,'x')));
		map.put(new StudentId("Rcu3",14,'z'),new Student("teja1",24,new StudentId("Rcu3",12,'x')));
		
		System.out.println(map);
	}

}
