package edu.westga.cs6312.fishing.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6312.fishing.model.Angler;

/**
 * This class will test the Angler class catchFish method
 * 
 * @author J. Allen Burton
 * @version Feb 12, 2020
 *
 */
class AnglerWhenCatchFish {

	/**
	 * This method will test the catchFish method in the Angler class
	 * Original fish = 0
	 * Caught fish = 25
	 * Final fish count = 25
	 */
	@Test
	public void testCatchFishOriginal0Catch25Expect25() {
		Angler theAngler = new Angler();
		theAngler.catchFish(25);
		int report = theAngler.getFishCaught();
		assertEquals(report, 25);
	}
	
	/**
	 * This method will test the catchFish method in the Angler class
	 * Original fish = 0
	 * Caught fish = 0
	 * Final fish count = 0
	 */
	@Test
	public void testCatchFishOriginal0Catch0Expect0() {
		Angler theAngler = new Angler();
		theAngler.catchFish(0);
		int report = theAngler.getFishCaught();
		assertEquals(report, 0);
	}
}