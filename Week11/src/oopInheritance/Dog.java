package oopInheritance;

public class Dog extends Animal {
	// instance variable
	private String knownFor;
	// getter, setter for instance var

	/**
	 * @return the knownFor
	 */
	public String getKnownFor() {
		return knownFor;
	}

	/**
	 * @param knownFor the knownFor to set
	 */
	public void setKnownFor(String knownFor) {
		this.knownFor = knownFor;
	}

	// default constructor
	public Dog() {

	}

	// constructor with arguments
	public Dog(String name, String noise, String eyeColour, String knownFor) {
		super(name, noise, eyeColour);
		this.knownFor = knownFor;
		
	}
	// toString method

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Dog is known for = " + knownFor + ". Name = " + getName() + ". Noise = " + getNoise()
				+ " Eye Colour = " + getEyeColour();
	}
	

}
