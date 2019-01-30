package shoes;

/**
 * 
 * @author Crystal
 *
 */
public class Trainers extends Footwear {
	// instance variable
	private boolean rubberSole;

	/**
	 * @return the rubberSole
	 */
	public boolean isRubberSole() {
		return rubberSole;
	}

	/**
	 * @param rubberSole the rubberSole to set
	 */
	public void setRubberSole(boolean rubberSole) {
		this.rubberSole = rubberSole;
	}

	// default constructor
	public Trainers() {

	}

	// constructor w argument
	/**
	 * @param brand
	 * @param style
	 * @param laceHoles
	 */
	public Trainers(String brand, String style, int laceHoles, boolean rubberSole) {
		super(brand, style, laceHoles);
		this.rubberSole = rubberSole;
	}

	@Override
	public void displayAll() {
		super.displayAll();
		
		System.out.println("Brand : " + getBrand() + "\nStyle : " + getStyle() + "\nNumber of laceholes : "
				+ getLaceHoles() + "Rubbersoles : " + isRubberSole());

	}
}
