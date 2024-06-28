package com.te.Learnjava8.stringClass;

class Address implements Cloneable{
	private String city;
	private String country;
	Address()
	{
		System.out.println("default constructor");
	}

	Address(String city, String country) {
		
		this.city = city;
		this.country = country;
	}
	protected Object clone() throws CloneNotSupportedException {
        return super.clone();
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
	@Override
	public String toString() {
		return "Address [city=" + city + ", country=" + country + "]";
	}
	
}
