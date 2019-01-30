/**
 * 
 */
package dryRunAgain;

/**
 * @author User
 *
 */
public class FamilySaloon extends Car {

	private boolean metallicPaint;

	// getters and setters for metallic paint

	/**
	 * @return the metallicPaint
	 */
	public boolean isMetallicPaint() {
		return metallicPaint;
	}

	/**
	 * @param metallicPaint the metallicPaint to set
	 */
	public void setMetallicPaint(boolean metallicPaint) {
		this.metallicPaint = metallicPaint;
	}

	/**
	 * default constructor
	 */
	public FamilySaloon() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * constructor with arguments
	 * 
	 * @param make
	 * @param model
	 * @param horsePower
	 */
	public FamilySaloon(String make, String model, int horsePower, boolean metallicPaint) {
		super(make, model, horsePower);
		this.metallicPaint = metallicPaint;
	}

	@Override
	public void displayAll() {
		System.out.println("Family Saloon");
		super.displayAll();
		System.out.println("metallicPaint\t:" + this.isMetallicPaint());

	}

}
