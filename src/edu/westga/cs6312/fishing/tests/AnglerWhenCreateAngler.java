package edu.westga.cs6312.fishing.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6312.fishing.model.Angler;

/**
 * This class will test the Angler class constructor
 * 
 * @author J. Allen Burton
 * @version Feb 12, 2020
 *
 */
public class AnglerWhenCreateAngler {

	/**
	 * This method will test the constructor. Only one test is needed since it is a
	 * zero parameter constructor leaving only one possibility for test output.
	 */
	@Test
	public void testCreateNewAnglerExpectFish0Money100() {
		Angler theAngler = new Angler();
		String report = theAngler.toString();
		assertEquals("Angler with 100 money units and 0 fish", report);
	}
}
