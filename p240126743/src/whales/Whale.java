package whales;

public class Whale extends Animal {
	
	private String mainOcean;
	private int weight;
	private int maxSpeed;
	private int length;
	
	//GETTERS AND SETTERS
	
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
	 * @param weight the weight to set
	 */
	public void setWeight(int weight) {
		this.weight = weight;
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

	//default constructor
	public Whale() {
	}

	/**
	 * @param mainOcean
	 * @param weight
	 * @param maxSpeed
	 * @param length
	 */
	public Whale(String mainOcean, int weight, int maxSpeed, int length, String name) {
		super(name);
		this.mainOcean = mainOcean;
		this.weight = weight;
		this.maxSpeed = maxSpeed;
		this.length = length;
	
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Whale [mainOcean=" + mainOcean + ", weight=" + weight + ", maxSpeed=" + maxSpeed + ", length=" + length
				+ ", Name()=" + getName();
	}


	
	


	
	
	
	

}
