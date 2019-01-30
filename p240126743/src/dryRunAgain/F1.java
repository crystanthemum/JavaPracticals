package dryRunAgain;

public class F1 extends Car {
	
	private double area;
	//setters and getters
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
	//default constructor
	public F1() {
	}
	//constructor with arguments
	public F1(String make, String model, int horsePower, double area) {
		super(make, model, horsePower);
		this.area = area;
	}
	@Override
	public void displayAll() {
		System.out.println("F1");
		super.displayAll();
		System.out.println("Area\t:"+this.getArea());
		
	}

}
