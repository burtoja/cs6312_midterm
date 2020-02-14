package edu.westga.cs6312.fishing.model;

/**
 * This class will keep track of the state of the game
 * 
 * @author J. Allen Burton
 * @version Feb 14, 2020
 *
 */
public class GameBoard {
	FishingHole[] fishingHolesArray;
	Angler theAngler;
	int anglerLocation;

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
	 * @postcondition new Angler object created fishingHolesArray is populated with
	 *                FishingHole objects theAngler is assigned to location 0
	 */
	private void setupFishingHoles() {
		this.theAngler = new Angler();
		this.fishingHolesArray = new FishingHole[10];
		// TODO: Need enhanced loop? How to deal with iteration var for constructor
		for (int currentLocation = 0; currentLocation < 10; currentLocation++) {
			this.fishingHolesArray[currentLocation] = new FishingHole(currentLocation);
		}
		this.anglerLocation = 0;
	}
	
	/**
	 * This method gets the current Angler object
	 * 
	 * @return	the Angler object for the GameBoard
	 *
	 * @precondition	none
	 *
	 * @postcondition	no change to object
	 */
	public Angler getAngler() {
		return this.theAngler;
	}
	
	/**
	 * This method returns the current fishing hole location for the Angler in this object
	 * 
	 * @return	game board location of the Angler
	 *
	 * @precondition	none
	 *
	 * @postcondition	no change to object
	 */
	public int getFishingHoleLocation() {
		return this.anglerLocation;
	}
	
	/*
	 * This method will produce a String representation of the variables in the GameBoard object
	 * 
	 * @precondition	none
	 *
	 * @postcondition	no change to object
	 */
	@Override
	public String toString() {
		String gameBoardDescription = "";
		for (FishingHole currentLocation : this.fishingHolesArray) {
			gameBoardDescription += currentLocation.toString() + "\n";
		}
		gameBoardDescription += "\n" + this.theAngler.toString() + " is at fishing hole " + this.anglerLocation;
		return gameBoardDescription;
	}
}
