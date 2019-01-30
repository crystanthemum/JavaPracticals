package shoes;

public class Footwear {
	// instance variables
	private String brand;
	private String style;
	private int laceHoles;

	// default constructor
	public Footwear() {

	}

	// getters and setters
	/**
	 * @return the brand
	 */
	public String getBrand() {
		return brand;
	}

	/**
	 * @param brand the brand to set
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}

	/**
	 * @return the style
	 */
	public String getStyle() {
		return style;
	}

	/**
	 * @param style the style to set
	 */
	public void setStyle(String style) {
		this.style = style;
	}

	/**
	 * @return the laceHoles
	 */
	public int getLaceHoles() {
		return laceHoles;
	}

	/**
	 * @param laceHoles the laceHoles to set
	 */
	public void setLaceHoles(int laceHoles) {
		this.laceHoles = laceHoles;
	}

	// constructor w args
	
	//passing a value into constructor which the instance variable gets assigned .
	public Footwear(String brand, String style, int laceHoles) {
		this.brand = brand;
		this.style = style;
		this.laceHoles = laceHoles;
	}
	//method to display all details of the footwear class
	public void displayAll() {
		System.out.println("Brand : "+ getBrand()+ "\nStyle : "+ getStyle() +"\nNumber of laceholes : " + getLaceHoles());
		
	}

}
