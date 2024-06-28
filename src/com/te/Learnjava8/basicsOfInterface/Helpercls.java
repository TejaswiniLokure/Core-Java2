package com.te.Learnjava8.basicsOfInterface;

public class Helpercls {
	static AndroidOS helper(String osType )
	{
		System.out.println("this is an helper method");
		if(osType.equalsIgnoreCase("MiuiOS"))
		{
			return new MiuiOS();
		}
		else if(osType.equalsIgnoreCase("OxygenOS")){
			return new OxygenOS();
		}
	return new  FuntouchOS();
		
	}

}
