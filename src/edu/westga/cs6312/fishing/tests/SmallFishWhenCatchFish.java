package edu.westga.cs6312.fishing.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6312.fishing.model.SmallFish;

/**
 * This will serve to test the catchFish method in the SmallFish class
 * 
 * @author J. Allen Burton
 * @version Feb 13, 2020
 *
 */
public class SmallFishWhenCatchFish {

	/**
	 * Test the catchFish method using the getFishInSchool method to verify size of
	 * school after method is called. The default value of 50 fish caught is the
	 * only value available so only one test is needed.
	 */
	@Test
	public void testCatchFishWhenNewSchoolHas50CaughtExpect50() {
		SmallFish theSmallFish = new SmallFish();
		theSmallFish.catchFish();
		int report = theSmallFish.getFishInSchool();
		assertEquals(50, report);
	}

}
