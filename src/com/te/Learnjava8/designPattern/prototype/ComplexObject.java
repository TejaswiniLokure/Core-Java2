package com.te.Learnjava8.designPattern.prototype;

public class ComplexObject implements Cloneable {
	private int readDataFromSensor1;
	private int readDataFromSensor2;
	private int readDataFromSenso3;
	private int readDataFromSensor4;
	private int readDataFromSensor5;
	private int readDataFromSensor6;
	private int readDataFromSensor7;
	private int readDataFromSensor8;
	private int readDataFromSensor9;
	public ComplexObject() {
		super();
		System.out.println("default constructor of complex object class");
	}
	public ComplexObject(int readDataFromSensor1, int readDataFromSensor2, int readDataFromSenso3,
			int readDataFromSensor4, int readDataFromSensor5, int readDataFromSensor6, int readDataFromSensor7,
			int readDataFromSensor8, int readDataFromSensor9) {
		super();
		this.readDataFromSensor1 = readDataFromSensor1;
		this.readDataFromSensor2 = readDataFromSensor2;
		this.readDataFromSenso3 = readDataFromSenso3;
		this.readDataFromSensor4 = readDataFromSensor4;
		this.readDataFromSensor5 = readDataFromSensor5;
		this.readDataFromSensor6 = readDataFromSensor6;
		this.readDataFromSensor7 = readDataFromSensor7;
		this.readDataFromSensor8 = readDataFromSensor8;
		this.readDataFromSensor9 = readDataFromSensor9;
	}
	public int getReadDataFromSensor1() {
		return readDataFromSensor1;
	}
	public void setReadDataFromSensor1(int readDataFromSensor1) {
		this.readDataFromSensor1 = readDataFromSensor1;
	}
	public int getReadDataFromSensor2() {
		return readDataFromSensor2;
	}
	public void setReadDataFromSensor2(int readDataFromSensor2) {
		this.readDataFromSensor2 = readDataFromSensor2;
	}
	public int getReadDataFromSenso3() {
		return readDataFromSenso3;
	}
	public void setReadDataFromSenso3(int readDataFromSenso3) {
		this.readDataFromSenso3 = readDataFromSenso3;
	}
	public int getReadDataFromSensor4() {
		return readDataFromSensor4;
	}
	public void setReadDataFromSensor4(int readDataFromSensor4) {
		this.readDataFromSensor4 = readDataFromSensor4;
	}
	public int getReadDataFromSensor5() {
		return readDataFromSensor5;
	}
	public void setReadDataFromSensor5(int readDataFromSensor5) {
		this.readDataFromSensor5 = readDataFromSensor5;
	}
	public int getReadDataFromSensor6() {
		return readDataFromSensor6;
	}
	public void setReadDataFromSensor6(int readDataFromSensor6) {
		this.readDataFromSensor6 = readDataFromSensor6;
	}
	public int getReadDataFromSensor7() {
		return readDataFromSensor7;
	}
	public void setReadDataFromSensor7(int readDataFromSensor7) {
		this.readDataFromSensor7 = readDataFromSensor7;
	}
	public int getReadDataFromSensor8() {
		return readDataFromSensor8;
	}
	public void setReadDataFromSensor8(int readDataFromSensor8) {
		this.readDataFromSensor8 = readDataFromSensor8;
	}
	public int getReadDataFromSensor9() {
		return readDataFromSensor9;
	}
	public void setReadDataFromSensor9(int readDataFromSensor9) {
		this.readDataFromSensor9 = readDataFromSensor9;
	}
	@Override
	public String toString() {
		return "ComplexObject [readDataFromSensor1=" + readDataFromSensor1 + ", readDataFromSensor2="
				+ readDataFromSensor2 + ", readDataFromSenso3=" + readDataFromSenso3 + ", readDataFromSensor4="
				+ readDataFromSensor4 + ", readDataFromSensor5=" + readDataFromSensor5 + ", readDataFromSensor6="
				+ readDataFromSensor6 + ", readDataFromSensor7=" + readDataFromSensor7 + ", readDataFromSensor8="
				+ readDataFromSensor8 + ", readDataFromSensor9=" + readDataFromSensor9 + "]";
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	

}
