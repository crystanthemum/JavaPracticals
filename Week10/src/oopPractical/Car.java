package oopPractical;

public class Car {
	// instance variables

	private String make;
	private String model;
	private String colour;
	private int numberOfDoors;
	private double engineSize;
	private int maxSpeed;
	private boolean started;

	// default constructor
	public Car() {

	}

	// constructor with arguments
	public Car(String make, String model, String colour, int numberOfDoors, double engineSize, int maxSpeed,
			boolean started) {
		this.make = make;
		this.model = model;
		this.colour = colour;
		this.numberOfDoors = numberOfDoors;
		this.engineSize = engineSize;
		this.maxSpeed = maxSpeed;
		this.started = started;
	}

	// method to start car

	public void startCar() {

		if (this.started) {
			System.out.println("Car has already started");
		} else {
			this.started = true;
			System.out.println("Car started");
		}
	}

	// method to stop car

	public void stopCar() {
		if (this.started) {
			System.out.println("Car turned off");
		} else {
			this.started = false;
			System.out.println("Car is already off");
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Car make = " + make + ", model = " + model + ", colour = " + colour + ", numberOfDoors = " + numberOfDoors
				+ ", engineSize = " + engineSize + ", maxSpeed = " + maxSpeed + ", started = " + started;
	}

	// Getters and setters for car class
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
	 * @return the colour
	 */
	public String getColour() {
		return colour;
	}

	/**
	 * @param colour the colour to set
	 */
	public void setColour(String colour) {
		this.colour = colour;
	}

	/**
	 * @return the numberOfDoors
	 */
	public int getNumberOfDoors() {
		return numberOfDoors;
	}

	/**
	 * @param numberOfDoors the numberOfDoors to set
	 */
	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}

	/**
	 * @return the engineSize
	 */
	public double getEngineSize() {
		return engineSize;
	}

	/**
	 * @param engineSize the engineSize to set
	 */
	public void setEngineSize(double engineSize) {
		this.engineSize = engineSize;
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
	 * @return the started
	 */
	public boolean isStarted() {
		return started;
	}

	/**
	 * @param started the started to set
	 */
	public void setStarted(boolean started) {
		this.started = started;
	}

}
