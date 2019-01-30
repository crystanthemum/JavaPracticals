/**
 * 
 */
package fruit;

/**
 * @author User
 *
 */
public class Apple extends Fruit {
	
	private String brand;
	
	// getters and setter methods for brand 
	/** method to get the brand name
	 * @return the brand
	 */
	public String getBrand() {
		return brand;
	}

	/** method to set the brand name
	 * @param brand the brand to set
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}

	/**
	 * default constructor
	 */
	public Apple() {
	}

	/** constructor with arguments
	 * @param name
	 * @param skinColour
	 * @param fleshColour
	 * @param pips
	 * @param favourite
	 */
	public Apple(String name, String skinColour, String fleshColour, int pips, boolean favourite, String brandP) {
		super(name, skinColour, fleshColour, pips, favourite);
		this.brand = brandP;
		
	}
	
	

}
