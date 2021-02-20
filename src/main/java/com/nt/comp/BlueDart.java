package com.nt.comp;

public class BlueDart implements Courier {

	@Override
	public String deliver(int oid) {
		System.out.println("BlueDart Courier Service");;
		return "BlueDart courier service will deliver your order with Order id "+oid;
	}

}
