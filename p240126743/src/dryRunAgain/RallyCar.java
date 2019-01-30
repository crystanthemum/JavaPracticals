package dryRunAgain;

public class RallyCar extends Car {
	
	private double area;
	
	//getters and setters for area
	/**
	 * @return the area
	 */
	public double getArea() {
		return area;
	}

	/**
	 * @param area the area to set
	 */
	public void setArea(double area) {
		this.area = area;
	}

	/**
	 * default constructor
	 */
	public RallyCar() {
	}
	/**
	 * constructor with arguments
	 * @param make
	 * @param model
	 * @param horsePower
	 */
	public RallyCar(String make, String model, int horsePower, double area) {
		super(make, model, horsePower);
		this.area = area;
	}
	/**
	 * method to display all details
	 */
	@Override
	public void displayAll() {
		System.out.println("Rally Car");
		super.displayAll();
		System.out.println("Area\t:"+ this.getArea());
	}

}
