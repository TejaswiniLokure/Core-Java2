package com.te.Learnjava8.java8Feature;

public interface AndroidOS {
	void powerOn();
	void powerOff();
	public default void nightPhotography()
	{
		System.out.println("night photography of androidos");
	}

}
