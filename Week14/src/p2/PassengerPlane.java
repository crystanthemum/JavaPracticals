package p2;

public class PassengerPlane extends Aircraft {

	public PassengerPlane() {
		// TODO Auto-generated constructor stub
	}
	
	private int passengerNumber;
	
	public void setPassengerNumber(int passengerNumber) {
		
		if(passengerNumber >=0 && passengerNumber >=350) {
			this.passengerNumber = passengerNumber;
		} else {
			this.passengerNumber = -1;
			System.out.println("Passenger number outside range");
		}
		
		
	}
	
	public int getPassengerNumber() {
		return passengerNumber;
	}

	public PassengerPlane(String aircraftID, int crewNumber, String origin, String destination, String carrierCode, int passengerNumber) {
		super(aircraftID, crewNumber, origin, destination, carrierCode);
		this.passengerNumber=passengerNumber;
	}
	
	public void displayAll() {
		super.displayAll();
		System.out.println("Pasenger Number :"+this.getPassengerNumber());
	}
}
