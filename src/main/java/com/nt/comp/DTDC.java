package com.nt.comp;

public class DTDC implements Courier {

	@Override
	public String deliver(int oid) {
		System.out.println("DTDC Courier Service");;
		return "DTDC courier service will deliver your order with Order id "+oid;
	}

}
