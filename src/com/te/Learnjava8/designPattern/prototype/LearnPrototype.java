package com.te.Learnjava8.designPattern.prototype;

public class LearnPrototype {
	public static void main(String[] args) {
		ComplexObject Object1 = new ComplexObject(12, 34654, 47856, 4656, 745, 3765, 756, 3745, 37645);
		ComplexObject Object2=null;
		try {
			Object2=(ComplexObject)Object1.clone();
			Object2.setReadDataFromSenso3(384785);
		}catch(CloneNotSupportedException e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println(Object1);
		System.out.println(Object2);
		System.out.println(Object1==Object2);
	}

}
