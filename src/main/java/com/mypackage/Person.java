package com.mypackage;

public class Person {

	private String personName;
	
	private int personAge;
	
	private Address address;

	public Person(String personName, int personAge, Address address) {
		super();
		this.personName = personName;
		this.personAge = personAge;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [personName=" + personName + ", personAge=" + personAge + ", address=" + address + "]";
	}
	
	
}
