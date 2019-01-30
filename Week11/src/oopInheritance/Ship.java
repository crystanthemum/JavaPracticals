package oopInheritance;

public class Ship extends Vehicle {
	/*
	 * this class creates a ship
	 * subclass of vehicle class
	 */
	private int tonnage;

	/**
	 * @return the tonnage
	 */
	public int getTonnage() {
		return tonnage;
	}

	/**
	 * @param tonnage the tonnage to set
	 */
	public void setTonnage(int tonnage) {
		this.tonnage = tonnage;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Ship tonnage: " + getTonnage() + ", Name: " + getName()
				+ ", PowerType; " + getPowerType();
	}
	// default constructor
	public Ship() {
		
	}
	//CONSTRUCTOR WITH ARGUMENTS
	public Ship(int tonnage,String name, String powerType) {
		super (name, powerType);
		this.tonnage = tonnage;
	}
	
}
