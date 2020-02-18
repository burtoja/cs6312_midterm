package edu.westga.cs6312.fishing.model;

/**
 * This class defines a subclass of FishType which are small fish.
 * 
 * @author J. Allen Burton
 * @version Feb 13, 2020
 *
 */

public class SmallFish extends FishType {

	/**
	 * Constructor for SmallFish objects which initializes the number of fish in
	 * their school to 100
	 *
	 * @precondition none
	 *
	 * @postcondition new SmallFish object (subclass of FishType) which has 100 fish
	 *                in the school
	 */
	public SmallFish() {
		super(100);
	}

	/**
	 * This method provides a way to catch a fixed number of fish which removes that
	 * number of fish from the school. Currently set to a fixed value of 50 fish
	 * caught. IF there are not enough fish in the school to supply the full catch,
	 * then no fish are caught.
	 * 
	 * @return the number of fish removed from the school
	 *
	 * @precondition number of fish in school >= number of fish to be caught
	 *
	 * @postcondition removes 50 fish from school
	 */
	@Override
	public int catchFish() {
		int numberOfFishCaught = 50;
		if (numberOfFishCaught <= this.getFishInSchool()) {
			super.removeFish(numberOfFishCaught);
		} else {
			numberOfFishCaught = 0;
		}
		return numberOfFishCaught;
	}

	/**
	 * Method to get the cost to fish this type of fish.
	 * 
	 * @return the cost to fish this type of fish
	 *
	 * @precondition none
	 *
	 * @postcondition no change to object
	 */
	@Override
	public int costToFish() {
		return 25;
	}

	/**
	 * This method returns a string representation of this SmallFish object
	 * 
	 * @return string representation of this SmallFish object
	 *
	 * @precondition none
	 *
	 * @postcondition no change to object
	 */
	@Override
	public String toString() {
		return "small fish with " + super.toString();
	}

}
