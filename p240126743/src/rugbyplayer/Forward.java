package rugbyplayer;

public class Forward extends RugbyPlayer {
	private int maxBench;

	/**
	 * @return the maxBench
	 */
	public int getMaxBench() {
		return maxBench;
	}

	/**
	 * @param maxBench the maxBench to set
	 */
	public void setMaxBench(int maxBench) {
		this.maxBench = maxBench;
	}
	/**
	 * default constructor
	 */
	public Forward() {
		
	}

	/**
	 * method to display all instance variables
	 */
	public void showAll() {
		super.showAll();
		System.out.println("Max bench :"+this.maxBench);
	}

	/**
	 * constructor with arguments
	 * @param name
	 * @param age
	 * @param weight
	 * @param nationality
	 */
	public Forward(String name, int age, double weight, String nationality, int maxBench) {
		super(name, age, weight, nationality);
		this.maxBench = maxBench;
	}
	
}
