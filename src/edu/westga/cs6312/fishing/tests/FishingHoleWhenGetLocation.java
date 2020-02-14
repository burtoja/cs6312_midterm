package edu.westga.cs6312.fishing.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6312.fishing.model.FishingHole;

public class FishingHoleWhenGetLocation {

	/**
	 * Test the getLocation method in the FishingHole class.  Location set to 5 when object created.  Expect 5.
	 */
	@Test
	public void testGetLocationWhenLocationSetTo5() {
		FishingHole theFishingHole = new FishingHole(5);
		assertEquals("Fishing hole at [5]", theFishingHole.getLocation());
	}
	
	/**
	 * Test the getLocation method in the FishingHole class.  Location set to 0 when object created.  Expect 0.
	 */
	@Test
	public void testGetLocationWhenLocationSetTo0() {
		FishingHole theFishingHole = new FishingHole(0);
		assertEquals("Fishing hole at [0]", theFishingHole.getLocation());
	}
	
	/**
	 * Test the getLocation method in the FishingHole class.  Location set to 9 when object created.  Expect 9.
	 */
	@Test
	public void testGetLocationWhenLocationSetTo9() {
		FishingHole theFishingHole = new FishingHole(9);
		assertEquals("Fishing hole at [9]", theFishingHole.getLocation());
	}

}
