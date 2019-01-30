package dryRun;


public class FamilySaloon extends Car{
	private boolean metallicPaint;
	/**
	 * getter and setters
	 */
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
	//default constructor
	public FamilySaloon() {
		
	}
	//constructor w args

	/**
	 * @param make
	 * @param model
	 * @param horsePower
	 */
	public FamilySaloon(String make, String model, int horsePower, boolean metallicPaint) {
		super(make, model, horsePower);
		this.metallicPaint = metallicPaint;
	}
	public void displayAll() {
		System.out.println("Family Saloon\nMake\t: " + getMake() + "\nModel\t: " + getModel() + "\nHorsePower\t: " + getHorsePower() + "\nMetallic Paint\t: "+isMetallicPaint()+"\n");
	
	
}
}
