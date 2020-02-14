package edu.westga.cs6312.fishing.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6312.fishing.model.SmallFish;

/**
 * Test class for the SmallFish constructor
 * 
 * @author J. Allen Burton
 * @version Feb 13, 2020
 *
 */
public class SmallFishWhenCreateSmallFish {

	/**
	 * This method will test the constructor and toString methods in the SmallFish class. 
	 * Only one test is needed since it is a zero parameter constructor leaving only one 
	 * possibility for test output.
	 * 
	 * Expected School Size = 100 
	 */
	@Test
	public void testCreateNewSmallFishExpectSize100() {
		SmallFish theSmallFish = new SmallFish();
		String report = theSmallFish.toString();
		assertEquals("small fish with 100 fish in the school", report);
	}

}
