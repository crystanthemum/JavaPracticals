package dryRunAgain;

public class Car {

	private String make;
	private String model;
	private int horsePower;

	// getters and setters for instance variables
	/**
	 * @return the make
	 */
	public String getMake() {
		return make;
	}

	/**
	 * @param make the make to set
	 */
	public void setMake(String make) {
		this.make = make;
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * @return the horsePower
	 */
	public int getHorsePower() {
		return horsePower;
	}

	/**
	 * @param horsePower the horsePower to set. value between 0 to 1000
	 */
	public void setHorsePower(int horsePower) {
		if (horsePower >= 0 && horsePower <= 1000) {
			this.horsePower = horsePower;
		} else {
			this.horsePower = -999;
			System.out.println("Invalid input for horsepower");
		}

	}

	// default constructor

	public Car() {

	}

	/**
	 * Constructor using arguments
	 * 
	 * @param make, insert String type
	 * @param model, insert String type
	 * @param horsePower, insert int type. Has to be between 0 - 1000 to be valid 
	 */
	public Car(String make, String model, int horsePower) {
		this.make = make;
		this.model = model;
		this.setHorsePower(horsePower);
	}
	
	/**
	 * method to display details of instance variables
	 */
	
	public void displayAll() {
		System.out.println("Make\t:"+this.getMake());
		System.out.println("Model\t:"+this.getModel());
		System.out.println("HorsePower\t:"+ this.getHorsePower());
	}
	
	

}
