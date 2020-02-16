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
				case 4:
					this.move();
					break;
				case 5:
					this.fishTheHole();
					break;
				case 9:
					break;
				default:
					System.out.println("Invalid choice. Please choose from the following options:");
			}
		} while (userChoice != 9);
		System.out.println("Thank you for playing. Goodbye.");
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
		System.out.println("\t| 4 - Move Angler                       |");
		System.out.println("\t| 5 - Fish the Hole                     |");
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
	 * Displays the current fishing hole information: Game board location,
	 * type/quantity of fish in school (if any)
	 * 
	 * @precondition none
	 *
	 * @postcondition no change to object
	 */
	private void describeCurrentFishingHole() {
		System.out.println(this.userGameBoard.getCurrentFishingHole().toString());
	}

	/**
	 * Displays the Angler's current information: money and fish caught
	 * 
	 * @precondition none
	 *
	 * @postcondition no change to object
	 */
	private void describeAngler() {
		System.out.println(this.userGameBoard.getAngler().toString());
	}

	/**
	 * Prints to console the information about each game board location (game board
	 * location, type/quantity of fish in school (if any)) and the Angler
	 * information (money, current location on game board, and fish caught)
	 * 
	 * @precondition none
	 *
	 * @postcondition no change to object
	 */
	private void describeGameBoard() {
		System.out.println(this.userGameBoard.toString());
	}

	/**
	 * This method presents users with a choice of moving the Angler up or down one
	 * position on the GameBoard
	 *
	 * @precondition none
	 *
	 * @postcondition moves the location of the Angler in the GameBoard object
	 */
	private void move() {
		int moveChoice;
		System.out.println("\n\t--------------");
		System.out.println("\t| 1 - Up     |");
		System.out.println("\t| 2 - Down   |");
		System.out.println("\t--------------");
		moveChoice = this.getIntegerFromUser("Please enter your choice: ");
		switch (moveChoice) {
			case 1:
				this.userGameBoard.moveUp();
				this.describeCurrentFishingHole();
				break;
			case 2:
				this.userGameBoard.moveDown();
				this.describeCurrentFishingHole();
				break;
			default:
				System.out.println("Invalid direction number.  The Angler was not moved. Returning to main menu.");
		}
	}

	/**
	 * This method will initiate and then display the results of the actions needed
	 * for the Angler to fish the current FishingHole
	 *
	 * @precondition Angler has enough money and there enough fish in the hole to fish
	 * 
	 *
	 * @postcondition if the Angler has enough money and the hole has enough fish,
	 *                money is removed from the Angler, fish are added to Angler,
	 *                and fish are removed from the school found at the hole
	 */
	private void fishTheHole() {
		if (this.userGameBoard.getCurrentFishingHole().getFish() != null
				&& this.userGameBoard.getCurrentFishingHole().getFish().getFishInSchool() > 0) {
			System.out.println(this.userGameBoard.getCurrentFishingHole().fishTheHole(this.userGameBoard.getAngler()));
		} else {
			System.out.println("No fish present");
		}

	}

}
