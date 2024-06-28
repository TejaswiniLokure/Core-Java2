package com.te.Learnjava8.basicsOfInterface;

public interface Supercls {
	void sub();
	default void add(){
		System.out.println("hii");
	}

}
