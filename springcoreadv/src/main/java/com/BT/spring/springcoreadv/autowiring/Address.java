package com.BT.spring.springcoreadv.autowiring;

public class Address {
	
	private int hno;
	public int getHno() {
		return hno;
	}
	public void setHno(int hno) {
		this.hno = hno;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	private String city;
	@Override
	public String toString() {
		return "Address [hno=" + hno + ", city=" + city + "]";
	}
	

}
