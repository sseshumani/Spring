package com.BT.spring.springcoreadv.injecting.interfaces;

public class DispatchTeamImpl implements DispatchTeam {

	OrderDAO dao;
	
	public OrderDAO getDao() {
		return dao;
	}

	public void setDao(OrderDAO dao) {
		this.dao = dao;
	}

	@Override
	public void isdispatched() {

		dao.billdetails();
		System.out.println("product is dispatched with bill");
	}

}
