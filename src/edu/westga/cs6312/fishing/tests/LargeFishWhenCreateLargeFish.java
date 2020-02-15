package edu.westga.cs6312.fishing.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6312.fishing.model.LargeFish;

/**
 * Test for LargeFish constructor
 * 
 * @author J. Allen Burton
 * @version Feb 14, 2020
 *
 */
public class LargeFishWhenCreateLargeFish {

	/**
	 * This method will test the constructor and toString methods in the LargeFish class. 
	 * Only one test is needed since it is a zero parameter constructor leaving only one 
	 * possibility for test output.
	 * 
	 * Expected School Size = 100 
	 */
	@Test
	public void testCreateNewLargeFishExpectSize50() {
		LargeFish theLargeFish = new LargeFish();
		String report = theLargeFish.toString();
		assertEquals("large fish with 50 fish in the school", report);
	}

}
