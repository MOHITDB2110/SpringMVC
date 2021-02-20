package com.nt.test;

import com.nt.comp.Flipkart;
import com.nt.factory.FlipkartFactory;

public class StrategyDPTest {

	public static void main(String[] args) {
		Flipkart fpkt = null;
		fpkt = FlipkartFactory.getCourier("bluedarT");
		System.out.println(fpkt.shopping(
				new String[] { "travelerBag", "BlackCottonJeans", "officialShoes", "TiffinBox", "WaterBottle" },
				new Integer[] { 1500, 1000, 1000, 400, 800 }));
	}

}
