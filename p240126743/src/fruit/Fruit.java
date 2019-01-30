package fruit;
/**
 * 
 * @author Crystal
 * superclass
 */
public class Fruit {
	
	private String name;
	private String skinColour;
	private String fleshColour;
	private int pips;
	private boolean favourite;
	
	/**
	 * Getters and setter for instance variables 
	 */
	
	/** method to get name of the fruit
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/** method to set name of the fruit
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/** method to set skin colour of fruit
	 * @return the skinColour
	 */
	public String getSkinColour() {
		return skinColour;
	}
	/** method to get skin colour of the fruit
	 * @param skinColour the skinColour to set
	 */
	public void setSkinColour(String skinColour) {
		this.skinColour = skinColour;
	}
	/** method to get the flesh colour of the fruit
	 * @return the fleshColour
	 */
	public String getFleshColour() {
		return fleshColour;
	}
	/** method to set flesh colour of fruit
	 * @param fleshColour the fleshColour to set
	 */
	public void setFleshColour(String fleshColour) {
		this.fleshColour = fleshColour;
	}
	/** method to get the number of pips
	 * @return the pips
	 */
	public int getPips() {
		return pips;
	}
	/** method to set number of pips
	 * @param pips the pips to set
	 */
	public void setPips(int pips) {
		if (pips < 0 || pips > 6) {
			this.pips = 666;
		} else {
		this.pips = pips;}
	}
	/** method to determine if fruit is personal favourite or not
	 * @return the favourite
	 */
	public boolean isFavourite() {
		return favourite;
	}
	/** method to set fruit as favourite 
	 * @param favourite the favourite to set
	 */
	public void setFavourite(boolean favourite) {
		this.favourite = favourite;
	}
	/**
	 * default constructor 
	 */
	public Fruit() {
		
	}
	
	/** Constructor with arguments
	 * @param name
	 * @param skinColour
	 * @param fleshColour
	 * @param pips: has to be more than 0 but less than 6
	 * @param favourite
	 */
	public Fruit(String name, String skinColour, String fleshColour, int pips, boolean favourite) {
		super();
		this.name = name;
		this.skinColour = skinColour;
		this.fleshColour = fleshColour;
		this.setPips(pips);
		this.favourite = favourite;
	}
	/** 
	 * method to print details of fruit
	 */
	@Override
	public String toString() {
		return "Name\t: " + name + ", skin Colour\t: " + skinColour + ", flesh Colour\t: " + fleshColour + ", pips\t: " + pips
				+ ", favourite: " + favourite;
	}
	 
	
	
	

}
