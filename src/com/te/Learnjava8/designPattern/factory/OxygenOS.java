package com.te.Learnjava8.designPattern.factory;

public class OxygenOS implements AndroidOS {

	@Override
	public void performance() {
		System.out.println("oxygenos performance()");
		
	}

	@Override
	public void security() {
		System.out.println("oxygenos security()");
		
	}

	@Override
	public void ui() {
		System.out.println("oxygenos ui()");
		
	}

}
