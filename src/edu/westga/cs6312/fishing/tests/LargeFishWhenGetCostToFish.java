package edu.westga.cs6312.fishing.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6312.fishing.model.LargeFish;

/**
 * This will serve to test the getCostToFish method in the LargeFish class
 * 
 * @author J. Allen Burton
 * @version Feb 14, 2020
 *
 */
public class LargeFishWhenGetCostToFish {

	/**
	 * This method will test the getCostToFish method by using a new LargeFish
	 * object. Expect to return 50. Only one possible outcome so only one test
	 * needed.
	 */
	@Test
	public void testCostToFishExpect50() {
		LargeFish theLargeFish = new LargeFish();
		int report = theLargeFish.costToFish();
		assertEquals(50, report);
	}

}
