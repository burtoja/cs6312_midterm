package edu.westga.cs6312.fishing.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6312.fishing.model.Angler;

/**
 * This class will test the Angler class getFishCaught method
 * 
 * @author J. Allen Burton
 * @version Feb 12, 2020
 *
 */
class AnglerWhenGetFishCaught {

	/**
	 * This method will test the getFishCaught method in the Angler class by getting the
	 * number of fish caught value from a new object which should 0 fish caught.
	 */
	@Test
	public void testGetFishCaughtFromNewAnglerExpect0() {
		Angler theAngler = new Angler();
		int report = theAngler.getFishCaught();
		assertEquals(report, 0);
	}
}
