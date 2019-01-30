package practical_constructors_inheritance;

/**
 * Whale subclass inherits from Animal superclass
 * 
 * @author User
 *
 */
public class Whale extends Animal {
	private String mainOcean;
	private int weight;
	private int maxSpeed;
	private int length;

	// default constructor

	public Whale() {

	}

	/**
	 * Constructor with args
	 * 
	 * @param mainOcean
	 * @param weight
	 * @param maxSpeed
	 * @param length
	 */
	public Whale(String name, String mainOcean, int weight, int maxSpeed, int length) {
		super(name);
		this.mainOcean = mainOcean;
		this.setWeight(weight);
		this.maxSpeed = maxSpeed;
		this.length = length;

	}

	/* Method to display details of Whale
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 * 
	 */
	@Override
	public String toString() {
		return "Whale name: " + getName() + "\tMain Ocean: " + mainOcean + "\tWeight: " + weight + "\tMax Speed: " + maxSpeed + "\tLength: " + length;
	}

	/**
	 * @return the mainOcean
	 */
	public String getMainOcean() {
		return mainOcean;
	}

	/**
	 * @param mainOcean the mainOcean to set
	 */
	public void setMainOcean(String mainOcean) {
		this.mainOcean = mainOcean;
	}

	/**
	 * @return the weight
	 */
	public int getWeight() {
		return weight;
	}

	/**
	 * @param weight of the whale has to be more than 100 tonnes and less than 500 tonnes
	 */
	public void setWeight(int weight) {
		if( weight > 500 || weight < 100) {
			System.out.println("Invalid weight");
		} else { 
		this.weight = 0;}
	}

	/**
	 * @return the maxSpeed
	 */
	public int getMaxSpeed() {
		return maxSpeed;
	}

	/**
	 * @param maxSpeed the maxSpeed to set
	 */
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	/**
	 * @return the length
	 */
	public int getLength() {
		return length;
	}

	/**
	 * @param length the length to set
	 */
	public void setLength(int length) {
		this.length = length;
	}

}
