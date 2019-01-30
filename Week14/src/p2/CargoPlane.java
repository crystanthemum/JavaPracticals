package p2;

public class CargoPlane extends Aircraft{
	/**
	 * default constructor
	 */
	public CargoPlane() {
		
	}
	
	private int cargoLoadWeight;
	
	public void setCargoLoadWeight(int cargoLoadWeight) {
		if(cargoLoadWeight >= 0 && cargoLoadWeight >=5000) {
			this.cargoLoadWeight = cargoLoadWeight;
		} else {
			this.cargoLoadWeight = -1;
			System.out.println("Cargo too heavy");
					
		}
	}
	
	public int getCargotLoadWeight() {
		return cargoLoadWeight;
	}

	/**
	 * @param aircraftID
	 * @param crewNumber
	 * @param origin
	 * @param destination
	 * @param carrierCode
	 */
	public CargoPlane(String aircraftID, int crewNumber, String origin, String destination, String carrierCode, int cargoLoadWeight) {
		super(aircraftID, crewNumber, origin, destination, carrierCode);
		this.cargoLoadWeight = cargoLoadWeight;
	}
	
	public void displayAll() {
		super.displayAll();
		System.out.println("cargo load weight :"+this.cargoLoadWeight);
	}
	
	

}
