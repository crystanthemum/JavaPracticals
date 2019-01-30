package shoes;
/**
 * 
 * @author User
 *
 */
/**
	 * class to describe boot, subclass of Footwear superclass
	 */
public class Boots extends Footwear{
	
	/**
	 * instance variables
	 */
	private boolean steelToe;
	
	//Getters and setters
	
	/**
	 * @return the steelToe
	 */
	public boolean isSteelToe() {
		return steelToe;
	}

	/**
	 * @param steelToe the steelToe to set
	 */
	public void setSteelToe(boolean steelToe) {
		this.steelToe = steelToe;
	}
	
	//default constructor
	
	public Boots() {
		
	}

	/**
	 * Constructor with args
	 * @param brand
	 * @param style
	 * @param laceHoles
	 */
	public Boots(String brand, String style, int laceHoles, boolean steelToe) {
		super(brand, style, laceHoles);
		this.steelToe = steelToe;
	}
	
	/**
	 * method to show all details of boots
	 */
	public void displayAll() {
		System.out.println("Brand : "+ getBrand()+ "\nStyle : "+ getStyle() +"\nNumber of laceholes : " + getLaceHoles()
		+ "SteelToe : "+ isSteelToe());
		
		}
	}
	
