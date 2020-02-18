package edu.westga.cs6312.fishing.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6312.fishing.model.SmallFish;

/**
 * This will serve as a test of the removeFish method
 * 
 * @author J. Allen Burton
 * @version Feb 18, 2020
 *
 */
public class SmallFishWhenRemoveFish {

	/**
	 * This will test the removeFish method by creating a new school of SmallFish
	 * (100 fish) and removing 40 fish. Expect 60 to remain.
	 */
	@Test
	public void testRemoveFishFromNewSmallFishWith100Remove40FishExpect60() {
		SmallFish theSmallFish = new SmallFish();
		theSmallFish.removeFish(40);
		int report = theSmallFish.getFishInSchool();
		assertEquals(60, report);
	}

	/**
	 * This will test the removeFish method by creating a new school of SmallFish
	 * (100 fish) and removing 0 fish. Expect 100 to remain.
	 */
	@Test
	public void testRemoveFishFromNewSmallFishWith100Remove0FishExpect100() {
		SmallFish theSmallFish = new SmallFish();
		theSmallFish.removeFish(0);
		int report = theSmallFish.getFishInSchool();
		assertEquals(100, report);
	}
	
	/**
	 * This will test the removeFish method by creating a new school of SmallFish
	 * (100 fish) and removing 100 fish. Expect 0 to remain.
	 */
	@Test
	public void testRemoveFishFromNewSmallFishWith100Remove100FishExpect0() {
		SmallFish theSmallFish = new SmallFish();
		theSmallFish.removeFish(100);
		int report = theSmallFish.getFishInSchool();
		assertEquals(0, report);
	}
}
