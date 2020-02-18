package edu.westga.cs6312.fishing.model;

/**
 * This class defines a subclass of FishType which are large
 * 
 * @author J. Allen Burton
 * @version Feb 14, 2020
 *
 */
public class LargeFish extends FishType {

	/**
	 * Constructor for LargeFish objects which initializes the number of fish in
	 * their school to 50
	 *
	 * @precondition none
	 *
	 * @postcondition new LargeFish object (subclass of FishType) which has 50 fish
	 *                in the school
	 */
	public LargeFish() {
		super(50);
	}

	/**
	 * This method provides a way to catch a randomly generated number of fish
	 * between 0 and the total number of fish in the school. The method then removes
	 * that number of fish from the school.
	 * 
	 * @return the number of fish removed from the school
	 *
	 * @precondition number of fish in school >= number of fish to be caught. This
	 *               is is taken care of in how numberOfFishCaught is calculated (it
	 *               can't exceed the number of fish in the school)
	 *
	 * @postcondition removes between zero and all fish from school
	 */
	@Override
	public int catchFish() {
		int numberOfFishCaught = (int) (Math.random() * (this.getFishInSchool() + 1));
		super.removeFish(numberOfFishCaught);
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
		return 50;
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
		return "large fish with " + super.toString();
	}
}
