package edu.westga.cs6312.fishing.model;

/**
 * This class will keep track of the state of the game board. The board is
 * composed of 10 locations arranged such that 0 is the top position and 9
 * increases downward) is the bottom position. Wrapping is applied such that 0
 * advances to 9 (and reverse too)
 * 
 * @author J. Allen Burton
 * @version Feb 14, 2020
 *
 */
public class GameBoard {
	private FishingHole[] fishingHolesArray;
	private Angler theAngler;
	private int anglerLocation;

	/**
	 * Constructor for the GameBoard object
	 * 
	 * @precondition none
	 *
	 * @postcondition a new GameBoard object is created
	 */
	public GameBoard() {
		this.setupFishingHoles();
	}

	/**
	 * This method will create a new Angler object, initialize the array of fishing
	 * holes, create and assign FishingHole objects to locations in the fishing
	 * holes array, and assign the Angler to location 0.
	 * 
	 * @precondition none
	 *
	 * @postcondition new Angler object created, fishingHolesArray is populated with
	 *                FishingHole objects, and theAngler is assigned to location 0
	 */
	private void setupFishingHoles() {
		this.theAngler = new Angler();
		this.fishingHolesArray = new FishingHole[10];
		for (int currentLocation = 0; currentLocation < 10; currentLocation++) {
			this.fishingHolesArray[currentLocation] = new FishingHole(currentLocation);
		}
		this.anglerLocation = 0;
	}

	/**
	 * This method gets the current Angler object
	 * 
	 * @return the Angler object for the GameBoard
	 *
	 * @precondition none
	 *
	 * @postcondition no change to object
	 */
	public Angler getAngler() {
		return this.theAngler;
	}

	/**
	 * This method returns the FishingHole object at the current location of the
	 * Angler
	 * 
	 * @return the FishingHole object at the current location of the Angler
	 *
	 * @precondition none
	 *
	 * @postcondition no change to object
	 */
	public FishingHole getCurrentFishingHole() {
		return this.fishingHolesArray[this.anglerLocation];
	}

	/*
	 * This method will produce a String representation of the variables in the
	 * GameBoard object
	 * 
	 * @precondition none
	 *
	 * @postcondition no change to object
	 */
	@Override
	public String toString() {
		String gameBoardDescription = "";
		for (FishingHole currentLocation : this.fishingHolesArray) {
			gameBoardDescription += currentLocation.toString() + "\n";
		}
		gameBoardDescription += "\nThe " + this.theAngler.toString() + " is at fishing hole [" + this.anglerLocation
				+ "]";
		return gameBoardDescription;
	}

	/**
	 * This method will advance the Angler up one position on the GameBoard. The
	 * board is treated as a circle such that 0 wraps to 9.
	 *
	 * @precondition none
	 *
	 * @postcondition the location of the Angler will go up by one position
	 */
	public void moveUp() {
		if (this.anglerLocation == 0) {
			this.anglerLocation = 9;
		} else {
			this.anglerLocation--;
		}
	}

	/**
	 * This method will advance the Angler down one position on the GameBoard. The
	 * board is treated as a circle such that 9 wraps to 0.
	 *
	 * @precondition none
	 *
	 * @postcondition the location of the Angler will go down by one position
	 */
	public void moveDown() {
		if (this.anglerLocation == 9) {
			this.anglerLocation = 0;
		} else {
			this.anglerLocation++;
		}
	}
}
