package edu.westga.cs6312.fishing.view;

import java.util.Scanner;

import edu.westga.cs6312.fishing.model.GameBoard;

/**
 * This will serve as the TUI for the Fishing game application
 * 
 * @author J. Allen Burton
 * @version Feb 14, 2020
 *
 */
public class FishingTUI {
	private GameBoard userGameBoard;
	private Scanner userInput;

	/**
	 * Constructor for the FishingTUI object.
	 *
	 * @param userGameBoard GameBoard object for use in this object
	 *
	 * @precondition userGameBoard != null
	 *
	 * @postcondition new object created with GameBoard set from parameter
	 */
	public FishingTUI(GameBoard userGameBoard) {
		if (userGameBoard == null) {
			throw new IllegalArgumentException("Invalid GameBoard parameter delivered.");
		}
		this.userGameBoard = userGameBoard;
		this.userInput = new Scanner(System.in);
	}

	/**
	 * This method serves as the director of the user interface
	 *
	 * @precondition none
	 *
	 * @postcondition changes to the object dictated by private methods within run()
	 */
	public void run() {
		System.out.println("Welcome to Down by the Fishin' Hole");
		int userChoice;
		do {
			this.displayMenu();
			userChoice = this.getIntegerFromUser("Please enter your choice: ");
			switch (userChoice) {
			case 1:
				this.describeCurrentFishingHole();
				break;
			case 2:
				this.describeAngler();
				break;
			case 3:
				this.describeGameBoard();
				break;
			case 9:
				break;
			default:
				System.out.println("Invalid choice. Please choose from the following options:");
			}
		} while (userChoice != 9);
	}

	/**
	 * This method will display the menu of choices for the user
	 *
	 * @precondition none
	 *
	 * @postcondition displayed menu to console
	 */
	private void displayMenu() {
		System.out.println("\n\t-----------------------------------------");
		System.out.println("\t| 1 - Describe current fishing hole     |");
		System.out.println("\t| 2 - Describe angler                   |");
		System.out.println("\t| 3 - Describe game board               |");
		System.out.println("\t| 9 - Quit                              |");
		System.out.println("\t-----------------------------------------");
	}

	/**
	 * This method displays the message provided in the parameter, reads the user
	 * input, and returns the integer provided by the user.
	 * 
	 * @return integer value provided by the user
	 *
	 * @precondition none
	 *
	 * @postcondition integer returned corresponding to user input
	 */
	private int getIntegerFromUser(String message) {
		System.out.println(message);
		return Integer.parseInt(this.userInput.nextLine());
	}
	
	/**
	 * 
	 * @precondition	none
	 *
	 * @postcondition
	 */
	private void describeCurrentFishingHole() {
		
	}
	
	/**
	 * 
	 * @precondition	none
	 *
	 * @postcondition
	 */
	private void describeAngler() {
		
	}
	
	/**
	 * 
	 * @precondition	none
	 *
	 * @postcondition
	 */
	private void describeGameBoard() {
		System.out.println(this.userGameBoard.toString());
	}

}
