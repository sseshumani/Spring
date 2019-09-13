package com.BT.spring.springcoreadv.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	
	//@Autowired
	public Employee(Address address) {
		super();
		this.address = address;
	}

	//@Autowired
	private Address address;

	public Address getAddress() {
		return address;
	}

	@Autowired
	@Qualifier("address1")
	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}
	

}
