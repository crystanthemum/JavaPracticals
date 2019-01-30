package fruit;

public class Mango extends Fruit {
	
	private String origin;
	
	/**
	 * @return the origin
	 */
	public String getOrigin() {
		return origin;
	}

	/**
	 * @param origin the origin to set
	 */
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public Mango() {
		
	}

	/**
	 * @param name
	 * @param skinColour
	 * @param fleshColour
	 * @param pips
	 * @param favourite
	 */
	public Mango(String name, String skinColour, String fleshColour, int pips, boolean favourite, String origin) {
		super(name, skinColour, fleshColour, pips, favourite);
		this.origin = origin;
	}
	

}
