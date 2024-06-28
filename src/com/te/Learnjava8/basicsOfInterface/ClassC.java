package com.te.Learnjava8.basicsOfInterface;

public class ClassC implements InterfaceA,InterfaceB {

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		InterfaceA.super.m1();
	}

//	@Override
//	public void m1() {
//		// TODO Auto-generated method stub
//		InterfaceA.super.m1();
//	}
//	ClassC classC=new ClassC();
//	classC.m1();
}
