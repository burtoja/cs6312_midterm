package edu.westga.cs6312.fishing.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6312.fishing.model.LargeFish;

/**
 * This will serve as a test for the getFishInSchool method for the LargeFish
 * class
 * 
 * @author J. Allen Burton
 * @version Feb 14, 2020
 *
 */
public class LargeFishWhenGetFishInSchool {

	/**
	 * Test the getFishInSchool method for a newly created LargeFish object with the
	 * original 50 fish in the school.
	 */
	@Test
	public void testGetFishInSchoolExpect50() {
		LargeFish theLargeFish = new LargeFish();
		int report = theLargeFish.getFishInSchool();
		assertEquals(50, report);
	}

}
