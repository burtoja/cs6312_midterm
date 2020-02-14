package edu.westga.cs6312.fishing.model;

/**
 * This abstract class defines variables and methods for objects of type
 * FishType
 * 
 * @author J. Allen Burton
 * @version Feb 13, 2020
 *
 */

public abstract class FishType {
	int sizeOfSchool;

	/**
	 * Constructor for objects of type FishType
	 *
	 * @param initialSizeOfSchool the initial number of fish in the school
	 *
	 * @postcondition initialSizeOfSchool >= 0
	 *
	 * @precondition FishType object created with the size of the school set to
	 *               initialSizeOfSchool
	 */
	public FishType(int initialSizeOfSchool) {
		if (initialSizeOfSchool < 0) {
			throw new IllegalArgumentException("Invalid initial fish school size.  This must not be a negative value.");
		}
		this.sizeOfSchool = initialSizeOfSchool;
	}

	/**
	 * This method gets the current number of fish in the school
	 * 
	 * @return number of fish in the school
	 *
	 * @postcondition none
	 *
	 * @precondition no change to object
	 */
	public int getFishInSchool() {
		return this.sizeOfSchool;
	}

	/**
	 * This method removes fish from the school by subtracting the number delivered
	 * in the parameter from the current number of fish in the school
	 * 
	 * @param numberOfFishToRemove
	 *
	 * @postcondition numberOfFishToRemove >= 0
	 *
	 * @precondition the number of fish in the school is deceased by
	 *               numberOfFishToRemove
	 */
	public void removeFish(int numberOfFishToRemove) {
		if (numberOfFishToRemove < 0) {
			throw new IllegalArgumentException("Invalid initial fish school size.  This must not be a negative value.");
		}
		this.sizeOfSchool -= numberOfFishToRemove;
	}

	/**
	 * Abstract method to require subclasses to include a method to deal with
	 * catching fish. It should return the number of fish and reduces the number in
	 * the school by that number.
	 * 
	 * @return number of fish caught
	 *
	 * @postcondition none
	 *
	 * @precondition sizeOfSchool will decrease by the amount of fish caught
	 */
	public abstract int catchFish();

	/**
	 * Abstract method to require subclasses to include a method to deal with
	 * supplying the cost associated with fishing this kind of fish
	 * 
	 * @return the cost associated with fishing this type of fish
	 *
	 * @postcondition none
	 *
	 * @precondition no change to object
	 */
	public abstract int costToFish();

	@Override
	public String toString() {
		return "Size of school: " + this.sizeOfSchool;
	}

}
