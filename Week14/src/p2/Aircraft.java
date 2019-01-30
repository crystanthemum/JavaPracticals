package p2;
/**
 * this class is to create an aircraft
 * @author User
 *
 *
 */
/**
 * default constructor
 * @author User
 *
 */
public class Aircraft{


public Aircraft() {
}
	
	/**
	 * constructor with arguments
	 * @param aircraftID
	 * @param crewNumber
	 * @param origin
	 * @param destination
	 * @param carrierCode
	 */
	public Aircraft(String aircraftID, int crewNumber, String origin, String destination, String carrierCode) {
		super();
		this.aircraftID = aircraftID;
		this.crewNumber = crewNumber;
		this.origin = origin;
		this.destination = destination;
		this.carrierCode = carrierCode;
	}



	private String aircraftID;
	private int crewNumber;
	private String origin;
	private String destination;
	private String carrierCode;
	
	/**
	 * @return the aircraftID
	 */
	public String getAircraftID() {
		return aircraftID;
	}


	/**
	 * @param aircraftID the aircraftID to set
	 */
	public void setAircraftID(String aircraftID) {
		this.aircraftID = aircraftID;
	}



	/**
	 * @return the crewNumber
	 */
	public int getCrewNumber() {
		return crewNumber;
	}



	/**
	 * @param crewNumber the crewNumber to set
	 */
	public void setCrewNumber(int crewNumber) {
		this.crewNumber = crewNumber;
	}



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



	/**
	 * @return the destination
	 */
	public String getDestination() {
		return destination;
	}



	/**
	 * @param destination the destination to set
	 */
	public void setDestination(String destination) {
		this.destination = destination;
	}



	/**
	 * @return the carrierCode
	 */
	public String getCarrierCode() {
		return carrierCode;
	}



	/**
	 * @param carrierCode the carrierCode to set
	 */
	public void setCarrierCode(String carrierCode) {
		
		switch(carrierCode);
		case 1 : 
		this.carrierCode = carrierCode;
	}



	public void displayAll() {
		System.out.println("aircraft ID :"+this.aircraftID);
		System.out.println("crew :"+this.crewNumber);
		System.out.println("origin :"+this.origin);
		System.out.println("destination :"+this.destination);
		System.out.println("carrier code :"+this.carrierCode);
	}
}
