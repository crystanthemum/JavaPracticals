package dryRun;

public class RallyCar extends Car {
	private double area;
	
	public RallyCar() {
		
	}

	/**
	 * @param area
	 */
	public RallyCar(double area) {
		super();
		this.area = area;
	}

	/**
	 * constructor with args
	 * @param make
	 * @param model
	 * @param horsePower
	 */
	public RallyCar(String make, String model, int horsePower, double area) {
		super(make, model, horsePower);
		this.area = area;
	}

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
	public void displayAll() {
		System.out.println("Rally Car\nMake\t: " + getMake() + "\nModel\t: " + getModel() + "\nHorsePower\t: " + getHorsePower() + "\nArea\t: "+getArea()+"\n");
	}
	
}
