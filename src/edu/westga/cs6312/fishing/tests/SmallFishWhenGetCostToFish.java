package edu.westga.cs6312.fishing.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6312.fishing.model.SmallFish;

/**
 * This will serve to test the getCostToFish method in the SmallFish class
 * 
 * @author J. Allen Burton
 * @version Feb 13, 2020
 *
 */
public class SmallFishWhenGetCostToFish {

	/**
	 * This method will test the getCostToFish method by using a new SmallFish
	 * object. Expect to return 25. Only one possible outcome so only one test
	 * needed.
	 */
	@Test
	public void testCostToFishExpect25() {
		SmallFish theSmallFish = new SmallFish();
		int report = theSmallFish.costToFish();
		assertEquals(report, 25);
	}

}
