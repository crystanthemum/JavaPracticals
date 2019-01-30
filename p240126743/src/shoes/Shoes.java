package shoes;

public class Shoes extends Footwear {
	/**
	 * instance variable
	 */
	private String colour;
	/**
	 * getters and setters for instance variable
	 */

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
	 * default constructor
	 */
	public Shoes() {
		
	}
	

	/**
	 * constructor with args
	 * @param brand
	 * @param style
	 * @param laceHoles
	 */
	public Shoes(String brand, String style, int laceHoles, String colour) {
		super(brand, style, laceHoles);
		this.colour = colour;
	}
	/**
	 * method to display details of shoes
	 */
	public void displayAll() {
		System.out.println("Brand : "+ getBrand()+ "\nStyle : "+ getStyle() +"\nNumber of laceholes : " + getLaceHoles()
		+ "Colour : " + getColour());
		
		}
	}
