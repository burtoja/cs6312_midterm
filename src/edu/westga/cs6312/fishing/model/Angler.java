package edu.westga.cs6312.fishing.model;

/**
 * This method will hold data and methods for Angler objects
 * 
 * @author J. Allen Burton
 * @version Feb 12, 2020
 *
 */
public class Angler {
	private int moneyLeft;
	private int totalFishCaught;

	/**
	 * Constructor for Angler objects
	 *
	 * @precondition none
	 *
	 * @postcondition new Angler object created with no fish and 100 units of money
	 */
	public Angler() {
		this.moneyLeft = 100;
		this.totalFishCaught = 0;
	}

	/**
	 * @return amount of money units left
	 * 
	 * @precondition none
	 *
	 * @postcondition no change in object
	 */
	public int getMoney() {
		return this.moneyLeft;
	}

	/**
	 * @return number of fish caught by the Angler
	 *
	 * @precondition none
	 *
	 * @postcondition no change in object
	 */
	public int getFishCaught() {
		return this.totalFishCaught;
	}

	/**
	 * This method adjusts the amount of money units stored in the object by
	 * deducting the amount of costToFish
	 * 
	 * @param costToFish the amount of money units to be deducted from Angler money
	 *                   to fish at location
	 *
	 * @precondition costToFish >= 0 && costToFish <= this.moneyLeft
	 *
	 * @postcondition this.MoneyLeft is reduced by amount of costToFish
	 */
	public void payToFish(int costToFish) {
		if (costToFish < 0) {
			throw new IllegalArgumentException("Invalid cost to fish.  This must not be a negative value.");
		}
		if (costToFish > this.moneyLeft) {
			throw new IllegalArgumentException("Invalid cost to fish.  Not enough funds held by Angler.");
		}
		this.moneyLeft -= costToFish;
	}

	/**
	 * This method adds fish caught to the total maintained by the Angler object
	 * 
	 * @param numberOfFishCaught the number of fish caught at the fishing hole
	 *
	 * @precondition numberOfFishCaught >= 0
	 *
	 * @postcondition this.totalFishCaught is increased by the value of
	 *                numberOfFishCaught
	 */
	public void catchFish(int numberOfFishCaught) {
		if (numberOfFishCaught < 0) {
			throw new IllegalArgumentException("Invalid number of fish caught.  This must not be a negative value.");
		}
		this.totalFishCaught += numberOfFishCaught;
	}

	/**
	 * This method will return a string representation of the object variables
	 * 
	 * @return string representation of object variables
	 *
	 * @precondition none
	 *
	 * @postcondition no change to the object
	 */
	@Override
	public String toString() {
		return "Angler with " + this.moneyLeft + " money units and " + this.totalFishCaught + " fish";
	}
}
