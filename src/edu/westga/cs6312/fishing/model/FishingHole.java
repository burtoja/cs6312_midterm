package edu.westga.cs6312.fishing.model;

/**
 * This class will keep track of an individual fishing hole in the game. This
 * class keeps track of fish objects at the hole and the location of the hole on
 * the game board
 * 
 * @author J. Allen Burton
 * @version Feb 13, 2020
 *
 */
public class FishingHole {
	private FishType fishAtHole;
	private int fishingHoleLocation;

	/**
	 * Constructor for FishingHole objects. Initial location is set from parameter
	 * passed to constructor and fish at hole is determined through a random draw.
	 *
	 * @param fishingHoleLocation location of the fishing hole on the game board
	 *
	 * @precondition fishingHoleLocation >= 0 && fishingHoleLocation < 10
	 *
	 * @postcondition new FishingHole object created with location matching
	 *                parameter passed and fishAtHole determined through a private
	 *                method which selects if fish will be present at the hole.
	 */
	public FishingHole(int fishingHoleLocation) {
		if (fishingHoleLocation < 0 || fishingHoleLocation > 9) {
			throw new IllegalArgumentException("Invalid fishing hole location.  Must be a value from 0 to 9.");
		}
		this.fishingHoleLocation = fishingHoleLocation;
		this.setupFishingHole();
	}

	/**
	 * This method will randomly determine if any FishType will be added to the
	 * FishingHole. There is a 50% chance that fish will be added.
	 * 
	 * @precondition none
	 *
	 * @postcondition fishAtHole will be populated with a FishType object or set to
	 *                NULL
	 */
	private void setupFishingHole() {
		if (Math.random() < 0.5) {
			this.fishAtHole = this.addFish();
		} else {
			this.fishAtHole = null;
		}
	}

	/**
	 * This method will create and return a new FishType object randomly selected
	 * between SmallFish and LargeFish subclasses. Each has a 50% chance of being
	 * selected.
	 * 
	 * @return new FishType object of either SmallFish or LargeFish type
	 *
	 * @precondition none
	 *
	 * @postcondition the FishingHole object is not changed
	 */
	private FishType addFish() {
		FishType fishToAdd;
		if (Math.random() < 0.5) {
			fishToAdd = new LargeFish();
		} else {
			fishToAdd = new SmallFish();
		}
		return fishToAdd;
	}

	/**
	 * Method returns a message representing the location of the fishing hole
	 * 
	 * @return message representing the location of the fishing hole
	 *
	 * @precondition none
	 *
	 * @postcondition no change to object
	 */
	public String getLocation() {
		return "Fishing hole at [" + this.fishingHoleLocation + "]";
	}

	/**
	 * Method gets the FishType object currently set for this FishingHole
	 * 
	 * @return FishType object currently set for this FishingHole
	 *
	 * @precondition none
	 *
	 * @postcondition no change to object
	 */
	public FishType getFish() {
		return this.fishAtHole;
	}

	/**
	 * Creates a string representation of the FishingHole object data. This method
	 * uses the toString method of the FishType object currently stored in the
	 * object and the getLocation method within this class. The string the location
	 * and either the contents of the Fish object toString method or a message
	 * indicating that no fish are in this fishing hole
	 * 
	 * @return string representation of the FishingHole object data
	 *
	 * @precondition none
	 *
	 * @postcondition no change to object
	 */
	@Override
	public String toString() {
		if (this.getFish() == null) {
			return this.getLocation() + " containing no fish";
		} else {
			return this.getLocation() + " containing " + this.getFish().toString();
		}
	}

	/**
	 * Executes actions to fish the hole. If not fish are at hole or zero fish are
	 * caught (only a possibility for LargeFish) then the Angler is not charged a
	 * fee for the attempt. Otherwise the appropriate number of fish are removed
	 * from the school and added to the Anglers catch total. The appropriate funds
	 * are subtracted from the Angler's money
	 * 
	 * @param anglerFishingTheHole the Angler object doing the fishing
	 * 
	 * @return message describing result of fishing attempt
	 *
	 * @precondition Angler must have enough money, there must be a FishType at the
	 *               location, and FishType must have enough fish in the school to
	 *               meet catch quantity
	 *
	 * @postcondition Angler has money reduced by cost to fish, Angler has total
	 *                number of fish caught increased by amount caught at this hole,
	 *                and FishType has number in school reduced by amount caught
	 */
	public String fishTheHole(Angler anglerFishingTheHole) {
		String statusMessage = "";
		int numberOfFishCaught = 0;
		if (anglerFishingTheHole.getMoney() < this.fishAtHole.costToFish()) {
			statusMessage = "The Angler does not have enough money to fish this hole.  ";
		} else {
			numberOfFishCaught = this.fishAtHole.catchFish();
		}
		if (numberOfFishCaught == 0) {
			statusMessage += "No fish were caught";
		} else {
			anglerFishingTheHole.catchFish(numberOfFishCaught);
			anglerFishingTheHole.payToFish(this.fishAtHole.costToFish());
			statusMessage = "The Angler has " + anglerFishingTheHole.getMoney()
					+ " money remaining and has caught a total of " + anglerFishingTheHole.getFishCaught() + " fish";
		}
		return statusMessage;
	}
}
