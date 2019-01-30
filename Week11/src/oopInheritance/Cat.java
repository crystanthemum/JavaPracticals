package oopInheritance;
	//cat is a subclass of animal class
public class Cat extends Animal {
	//instance variable
	
	private String attitude;
	private String favFood;
	//getter and setter for cat class
	public void setAttitude(String attitude) {
		this.attitude = attitude;
	}
	public String getAttitude() {
		return attitude;
	}
	
	/**
	 * @return the favFood
	 */
	public String getFavFood() {
		return favFood;
	}
	/**
	 * @param favFood the favFood to set
	 */
	public void setFavFood(String favFood) {
		this.favFood = favFood;
	}
	//default constructor
	public Cat() {
		
	}
	// constructor with arguments
	public Cat(String name, String noise, String eyeColour, String attitude, String favFood) {
		super(name, noise, eyeColour);
		this.attitude = attitude;
		this.favFood = favFood;
	}
		/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Cat attitude = " + attitude + ". Name = " + getName() + ". Noise = " + getNoise()
				+ ". Eye Colour = " + getEyeColour() + ". Favourite food = " + getFavFood();
	}
	
	
}
