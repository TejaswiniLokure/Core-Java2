package com.te.Learnjava8.oop.encapsulation;

public class Address {
	private String city;
	private String country;
	private int pincode;

	Address() {

	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", country=" + country + ", pincode=" + pincode + "]";
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	Address(String city, String country, int pincode) {

		this.city = city;
		this.country = country;
		this.pincode = pincode;
	}

}
