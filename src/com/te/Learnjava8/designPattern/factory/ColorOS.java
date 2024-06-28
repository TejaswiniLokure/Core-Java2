package com.te.Learnjava8.designPattern.factory;

public class ColorOS implements AndroidOS{

	@Override
	public void performance() {
		System.out.println("coloros performance()");
		
	}

	@Override
	public void security() {
		System.out.println("coloros security()");
	}

	@Override
	public void ui() {
		System.out.println("colors ui()");
		
	}

}
