package edu.westga.cs6312.fishing.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6312.fishing.model.SmallFish;

/**
 * This class will test the functionality of the getFishInSchool method
 * 
 * @author J. Allen Burton
 * @version Feb 13, 2020
 *
 */
public class SmallFishWhenGetFishInSchool {

	/**
	 * Test the getFishInSchool method for a newly created SmallFish object with the
	 * original 100 fish in the school.
	 */
	@Test
	public void testGetFishInSchoolExpect100() {
		SmallFish theSmallFish = new SmallFish();
		int report = theSmallFish.getFishInSchool();
		assertEquals(report, 100);
	}

}
