package edu.westga.cs6312.fishing.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6312.fishing.model.FishingHole;
import edu.westga.cs6312.fishing.model.GameBoard;

/**
 * This will serve as a test for the moveDown method in the GameBoard class
 * 
 * @author J. Allen Burton
 * @version Feb 14, 2020
 *
 */
public class GameBoardWhenMoveDown {

	/**
	 * This will test the moveDown method 
	 * MoveDown once Expect 1
	 */
	@Test
	public void testMoveDownOnceOnNewGameBoardExpectLocation1() {
		GameBoard theGameBoard = new GameBoard();
		theGameBoard.moveDown();
		FishingHole currentFishingHole = theGameBoard.getCurrentFishingHole();
		String report = currentFishingHole.getLocation();
		assertEquals("Fishing hole at [1]", report);
	}

	/**
	 * This will test the moveDown method 
	 * MoveDown twice Expect 2
	 */
	@Test
	public void testMoveDownTwiceOnNewGameBoardExpectLocation2() {
		GameBoard theGameBoard = new GameBoard();
		for (int moveCount = 0; moveCount < 2; moveCount++) {
			theGameBoard.moveDown();
		}
		FishingHole currentFishingHole = theGameBoard.getCurrentFishingHole();
		String report = currentFishingHole.getLocation();
		assertEquals("Fishing hole at [2]", report);
	}

	/**
	 * This will test the moveDown method 
	 * MoveDown 10 Expect 0
	 */
	@Test
	public void testMoveDown10OnNewGameBoardExpectLocation0() {
		GameBoard theGameBoard = new GameBoard();
		for (int moveCount = 0; moveCount < 10; moveCount++) {
			theGameBoard.moveDown();
		}
		FishingHole currentFishingHole = theGameBoard.getCurrentFishingHole();
		String report = currentFishingHole.getLocation();
		assertEquals("Fishing hole at [0]", report);
	}

}
