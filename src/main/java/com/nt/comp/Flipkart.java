package com.nt.comp;

import java.util.Arrays;
import java.util.Random;

public final class Flipkart {

	private Courier courier; 

	public void setCourier(Courier courier) {         // Setter method 
		this.courier = courier;
	}
	 public String shopping(String [] items, Integer [] prices) {
		Integer billAmt=0;
		// calculating the Bill
		 for (Integer p  : prices) {
			billAmt+=p;
		}
		 // genarating Order id 
		 Random rad=new Random();
		 int oid=rad.nextInt(10000);
		 //Use Courier Sevice to deliver the product with oid
		 String msg=courier.deliver(oid);
		 //message on delivering the product
		 return "The products ordered "+Arrays.toString(items)+" having prices as "+Arrays.toString(prices)+" : Yours BillAmount is -> "+billAmt+"     "+msg; 
	 }
}
