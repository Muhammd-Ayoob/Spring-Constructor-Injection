package com.mypackage;

public class Address {
	private String city;
	
	private String district;

	public Address(String city, String district) {
		super();
		this.city = city;
		this.district = district;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", district=" + district + "]";
	}
	
	

}
