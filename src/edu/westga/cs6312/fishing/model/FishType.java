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
	private int sizeOfSchool;

	/**
	 * Constructor for objects of type FishType
	 *
	 * @param initialSizeOfSchool the initial number of fish in the school
	 *
	 * @precondition initialSizeOfSchool >= 0
	 *
	 * @postcondition FishType object created with the size of the school set to
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
	 * @precondition none
	 *
	 * @postcondition no change to object
	 */
	public int getFishInSchool() {
		return this.sizeOfSchool;
	}

	/**
	 * This method removes fish from the school by subtracting the number delivered
	 * in the parameter from the current number of fish in the school
	 * 
	 * @param numberOfFishToRemove	the number of fish to remove from the school
	 *
	 * @precondition numberOfFishToRemove >= 0
	 *
	 * @postcondition the number of fish in the school is deceased by
	 *               numberOfFishToRemove
	 */
	public void removeFish(int numberOfFishToRemove) {
		if (numberOfFishToRemove < 0) {
			throw new IllegalArgumentException("Invalid number of fish to remove.  This must not be a negative value.");
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
	 * @precondition none
	 *
	 * @postcondition sizeOfSchool will decrease by the amount of fish caught
	 */
	public abstract int catchFish();

	/**
	 * Abstract method to require subclasses to include a method to deal with
	 * supplying the cost associated with fishing this kind of fish
	 * 
	 * @return the cost associated with fishing this type of fish
	 *
	 * @precondition none
	 *
	 * @postcondition no change to object
	 */
	public abstract int costToFish();
	
	@Override
	public String toString() {
		return this.sizeOfSchool + " fish in the school";
	}

}
