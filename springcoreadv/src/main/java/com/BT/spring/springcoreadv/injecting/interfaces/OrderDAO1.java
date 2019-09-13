package com.BT.spring.springcoreadv.injecting.interfaces;

public class OrderDAO1 implements OrderDAO {

	@Override
	public void billdetails() {
    System.out.println("new bill details");
	}

}
