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
	 * school after method is called. The default value of 50 fish caught is used once.
	 * Expect 50
	 */
	@Test
	public void testCatchFishWhenNewSchool50CaughtExpect50() {
		SmallFish theSmallFish = new SmallFish();
		theSmallFish.catchFish();
		int report = theSmallFish.getFishInSchool();
		assertEquals(50, report);
	}
	
	/**
	 * Test the catchFish method using the getFishInSchool method to verify size of
	 * school after method is called. The default value of 50 fish caught is used twice.
	 * Expect 0
	 */
	@Test
	public void testCatchFishWhenNewSchool100CaughtExpect0() {
		SmallFish theSmallFish = new SmallFish();
		theSmallFish.catchFish();
		theSmallFish.catchFish();
		int report = theSmallFish.getFishInSchool();
		assertEquals(0, report);
	}
	
	/**
	 * Test the catchFish method using the getFishInSchool method to verify size of
	 * school after method is called. The default value of 50 fish caught is used three times.
	 * Expect 0
	 */
	@Test
	public void testCatchFishWhenNewSchoolAttemptToCatch150Expect0() {
		SmallFish theSmallFish = new SmallFish();
		theSmallFish.catchFish();
		theSmallFish.catchFish();
		theSmallFish.catchFish();
		int report = theSmallFish.getFishInSchool();
		assertEquals(0, report);
	}

}
