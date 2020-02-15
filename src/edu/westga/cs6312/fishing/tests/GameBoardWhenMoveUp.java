package edu.westga.cs6312.fishing.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6312.fishing.model.FishingHole;
import edu.westga.cs6312.fishing.model.GameBoard;

/**
 * This will serve as a test for the moveUp method in the GameBoard class
 * 
 * @author J. Allen Burton
 * @version Feb 14, 2020
 *
 */
public class GameBoardWhenMoveUp {

	/**
	 * This will test the moveUp method 
	 * Move up once Expect 9
	 */
	@Test
	public void testMoveUpOnceOnNewGameBoardExpectLocation9() {
		GameBoard theGameBoard = new GameBoard();
		theGameBoard.moveUp();
		FishingHole currentFishingHole = theGameBoard.getCurrentFishingHole();
		String report = currentFishingHole.getLocation();
		assertEquals("Fishing hole at [9]", report);
	}

	/**
	 * This will test the moveUp method 
	 * Move up twice Expect 8
	 */
	@Test
	public void testMoveUpTwiceOnNewGameBoardExpectLocation8() {
		GameBoard theGameBoard = new GameBoard();
		for (int moveCount = 0; moveCount < 2; moveCount++) {
			theGameBoard.moveUp();
		}
		FishingHole currentFishingHole = theGameBoard.getCurrentFishingHole();
		String report = currentFishingHole.getLocation();
		assertEquals("Fishing hole at [8]", report);
	}

	/**
	 * This will test the moveUp method 
	 * Move up 10 Expect 0
	 */
	@Test
	public void testMoveUp10OnNewGameBoardExpectLocation0() {
		GameBoard theGameBoard = new GameBoard();
		for (int moveCount = 0; moveCount < 10; moveCount++) {
			theGameBoard.moveUp();
		}
		FishingHole currentFishingHole = theGameBoard.getCurrentFishingHole();
		String report = currentFishingHole.getLocation();
		assertEquals("Fishing hole at [0]", report);
	}

}
