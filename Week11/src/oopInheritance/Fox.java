package oopInheritance;

public class Fox extends Animal {
	// instance variable of fox
	private String furColour;
	
	//methods to get and set fur colour
	public void setFurColour(String furColour) {
		this.furColour = furColour;
	}
	public String getFurColour() {
		return furColour;
	}
	public Fox() {
		
	}
	//constructor with arguments 
	public Fox(String name, String noise, String eyeColour, String furColour) {
		super(name, noise, eyeColour);
		this.furColour = furColour;
		
		
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Fox furColour = " + furColour + " Name = " + getName() + " Noise = " + getNoise()
				+ " Eye Colour = " + getEyeColour();
	}
}
