package edu.westga.cs6312.fishing.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6312.fishing.model.Angler;

/**
 * This class will test the Angler class payToFish method
 * 
 * @author J. Allen Burton
 * @version Feb 12, 2020
 *
 */
public class AnglerWhenPayToFish {

	/**
	 * This method will test the payToFish method in the Angler class 
	 * Original money = 100
	 * Paid = 40
	 * Expected = 60
	 */
	@Test
	public void testPayToFishOnNewAnglerPay40Expect60() {
		Angler theAngler = new Angler();
		theAngler.payToFish(40);
		int report = theAngler.getMoney();
		assertEquals(report, 60);
	}
	
	/**
	 * This method will test the payToFish method in the Angler class 
	 * Original money = 100
	 * Paid = 0
	 * Expected = 100
	 */
	@Test
	public void testPayToFishOnNewAnglerPay0Expect100() {
		Angler theAngler = new Angler();
		theAngler.payToFish(0);
		int report = theAngler.getMoney();
		assertEquals(report, 100);
	}
	
	/**
	 * This method will test the payToFish method in the Angler class 
	 * Original money = 100
	 * Paid = 100
	 * Expected = 0
	 */
	@Test
	public void testPayToFishOnNewAnglerPay100Expect0() {
		Angler theAngler = new Angler();
		theAngler.payToFish(100);
		int report = theAngler.getMoney();
		assertEquals(report, 0);
	}
}