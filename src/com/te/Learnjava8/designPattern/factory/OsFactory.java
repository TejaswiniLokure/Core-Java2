package com.te.Learnjava8.designPattern.factory;

public class OsFactory {
	public static AndroidOS getters(String osType)
	{
		if(osType.equalsIgnoreCase("colors"))
		return new ColorOS();
		else if(osType.equalsIgnoreCase("oxygenos"))
		return new OxygenOS();
		else if(osType.equalsIgnoreCase("miuios"))
		return new MiuiOS();
		else
		throw new IllegalArgumentException();
	}

}
