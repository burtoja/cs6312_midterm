package edu.westga.cs6312.fishing.controller;

import edu.westga.cs6312.fishing.model.GameBoard;
import edu.westga.cs6312.fishing.view.FishingTUI;

/**
 * This will serve as the driver for the Fishing game application
 * 
 * @author J. Allen Burton
 * @version Feb 14, 2020
 *
 */
public class FishingDriver {

	/**
	 * This method is the entry point of the application
	 *
	 * @param args Command-line arguments, not used
	 */
	public static void main(String[] args) {
		GameBoard currentGameBoard = new GameBoard();
		FishingTUI userFishingTUI = new FishingTUI(currentGameBoard);
		userFishingTUI.run();
	}
}
