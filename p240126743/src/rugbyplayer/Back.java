package rugbyplayer;

public class Back extends RugbyPlayer {
	
	private double max100Speed;

	/**
	 * @return the max100Speed
	 */
	public double getMax100Speed() {
		return max100Speed;
	}

	/**
	 * @param max100Speed the max100Speed to set
	 */
	public void setMax100Speed(double max100Speed) {
		this.max100Speed = max100Speed;
	}
	
	// default constructor
	
	public Back() {
		
	}

	/**
	 * constructor with arguments
	 * @param name
	 * @param age
	 * @param weight
	 * @param nationality
	 */
	public Back(String name, int age, double weight, String nationality, double max100Speed) {
		super(name, age, weight, nationality);
		this.max100Speed = max100Speed;
	}
	/**
	 * method to display all instance variables
	 */
	public void showAll() {
		super.showAll();
		System.out.println("Max speed :" + this.max100Speed);
	}
	
	
	
}
