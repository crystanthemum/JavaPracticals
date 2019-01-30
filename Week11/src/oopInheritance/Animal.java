/**
 * 
 */
package oopInheritance;

/**
 * @author Crystal
 *
 */
/*
 * This superclass creates an animal
 */
public class Animal {
	//instance variables
	private String name;
	private String noise;
	private String eyeColour;
	
	// getters and setters for instance variables
	
	// method to set animal's name
	public void setName(String name) {
		this.name = name;
	}
	// method to get animal's name
	public String getName() {
		return name;
	}
	//method to set animal's noise
	public void setNoise(String noise) {
		this.noise = noise;
	}
	//method to get animal's noise
	public String getNoise() {
		return noise;
	}
	// method to set animal's eye colour
	public void setEyeColour(String eyeColour) {
		this.eyeColour = eyeColour;
	}
	//method to get animal's eye colour
	public String getEyeColour() {
		return eyeColour;
	}
	
	/*
	 * default constructor
	 */
	public Animal() {
		
	}
	/*
	 * constructor with arguments
	 */
	public Animal(String name, String noise, String eyeColour) {
		this.name = name;
		this.noise = noise;
		this.eyeColour = eyeColour;
	}
	/*
	 * method that'll make the animal make noise
	 */
	public void makeNoise() {System.out.println(this.getName() + " makes a " + this.getNoise()+ " noise");
		
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Animal name = " + name + " noise = " + noise + ", Eye Colour =" + eyeColour;
	}
	
}
