package com.nt.factory;

import com.nt.comp.BlueDart;
import com.nt.comp.Courier;
import com.nt.comp.DTDC;
import com.nt.comp.Flipkart;

public class FlipkartFactory {

	public static Flipkart getCourier(String courierName) {
		Courier courier=null;
		//create Dependent Class object
		if (courierName.equalsIgnoreCase("dtdc")) {
			courier=new DTDC();
		}else if (courierName.equalsIgnoreCase("bluedart")) {
			courier=new BlueDart();
		}else {
			throw new IllegalArgumentException();
		}
		// now create target class
		Flipkart fpkt=new Flipkart();
		// asign Dependent class object to target class
		fpkt.setCourier(courier);
		return fpkt;
	}
}
