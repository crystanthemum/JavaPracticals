package oopInheritance;

public class Car extends Vehicle {
	/*
	 * this class creates a car
	 */
	
	/*
	 * default constructor
	 */
	public Car() {
		
	}
	/*
	 * CONSTRUCTOR WITH ARGUMENTS
	 */
	public Car(int numberOfWheels, String name, String powerType) {
		super(name, powerType);
		this.numberOfWheels = numberOfWheels;
	}
	private int numberOfWheels;

	/**
	 * @return the numberOfWheels
	 */
	public int getNumberOfWheels() {
		return numberOfWheels;
	}

	/**
	 * @param numberOfWheels the numberOfWheels to set
	 */
	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Number of wheels on the car: " + numberOfWheels +   ", Car name: "
				+ getName() + ", Power Type: " + getPowerType();
	}

}
