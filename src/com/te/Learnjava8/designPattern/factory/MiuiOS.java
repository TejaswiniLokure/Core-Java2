package com.te.Learnjava8.designPattern.factory;

public class MiuiOS implements AndroidOS{

	@Override
	public void performance() {
		System.out.println("miuios performance()");
	}

	@Override
	public void security() {
		System.out.println("miuios security()");
		
	}

	@Override
	public void ui() {
		System.out.println("miuios ui()");
		
	}

}
