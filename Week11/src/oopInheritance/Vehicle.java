package oopInheritance;

public class Vehicle {
	/*
	 * this class creates a vehicle (the superclass)
	 */
	private String name;
	private String powerType;
	
	/*
	 * default constructor 
	 */
	public Vehicle() {
		
	}
	/*
	 *  CONSTRUCTOR WITH ARGUMENTS
	 */
	public Vehicle(String name, String powerType) {
		this.name = name;
		this.powerType = powerType;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the powerType
	 */
	public String getPowerType() {
		return powerType;
	}
	/**
	 * @param powerType the powerType to set
	 */
	public void setPowerType(String powerType) {
		this.powerType = powerType;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Vehicle name: " + name + ", Power Type: " + powerType;
	}
	
}
