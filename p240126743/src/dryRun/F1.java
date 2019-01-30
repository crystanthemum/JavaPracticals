package dryRun;
/*
 * subclass to Car superclass
 */
public class F1 extends Car {
	
	private double area;

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
	 * 
	 */
	public F1() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * constructor with args
	 * @param make
	 * @param model
	 * @param horsePower
	 */
	public F1(String make, String model, int horsePower, double area) {
		super(make, model, horsePower);
		this.area = area;
	}
	public void displayAll() {
		System.out.println("F1\nMake\t:" + getMake() + "\nModel\t: " + getModel() + "\nHorsePower\t: " + getHorsePower() + "\nArea\t: "+getArea()+"\n");
	}
	
	
	
}
