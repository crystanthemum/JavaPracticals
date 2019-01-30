/**
 * 
 */
package fruit;

/**
 * @author User
 *
 */
public class Banana extends Fruit {
	private String minionsAssociation;
	
	/**
	 * @return the minionsAssociation
	 */
	public String getMinionsAssociation() {
		return minionsAssociation;
	}

	/**
	 * @param minionsAssociation the minionsAssociation to set
	 */
	public void setMinionsAssociation(String minionsAssociation) {
		this.minionsAssociation = minionsAssociation;
	}

	/**
	 * default constructor
	 */
	public Banana() {
	}

	/** constructor with arguments
	 * @param name
	 * @param skinColour
	 * @param fleshColour
	 * @param pips
	 * @param favourite
	 */
	public Banana(String name, String skinColour, String fleshColour, int pips, boolean favourite, String minionAssociation) {
		super(name, skinColour, fleshColour, pips, favourite);
		this.minionsAssociation = minionAssociation;
	}

}
