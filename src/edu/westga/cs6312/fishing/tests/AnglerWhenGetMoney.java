package edu.westga.cs6312.fishing.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6312.fishing.model.Angler;

/**
 * This class will test the Angler class getMoney method
 * 
 * @author J. Allen Burton
 * @version Feb 12, 2020
 *
 */
public class AnglerWhenGetMoney {

	/**
	 * This method will test the getMoney method in the Angler class by getting the
	 * money value from a new object which should have 100 money units.
	 */
	@Test
	public void testGetMoneyFromNewAnglerExpect100() {
		Angler theAngler = new Angler();
		int report = theAngler.getMoney();
		assertEquals(100, report);
	}
}
