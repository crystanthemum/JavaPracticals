/**
 * 
 */
package flights;

/**
 * @author User
 *
 */
public class Flight {

	private String flightNumber;
	private String destination;
	private String origin;
	private double duration;

	/**
	 * @return the flightNumber
	 */
	public String getFlightNumber() {
		return flightNumber;
	}

	/**
	 * @param flightNumber the flightNumber to set
	 */
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
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
	 * @return the duration
	 */
	public double getDuration() {
		return duration;
	}

	/**
	 * @param max duration hours = 18hrs
	 */
	public void setDuration(double duration) {
		if (duration <=18.0) {
		this.duration = duration;
		} else {
			this.duration = 0.0;
			System.out.println("Duration exceeds 18hrs");
		}
	}

	// default constructor

	public Flight() {

	}

	/**
	 * Constructor with arguments
	 * 
	 * @param flightNumber
	 * @param destination
	 * @param origin
	 * @param duration: max duration hours = 18hrs
	 */
	public Flight(String flightNumber, String destination, String origin, double duration) {
		super();
		this.flightNumber = flightNumber;
		this.setDuration(duration);
		this.origin = origin;
		this.duration = duration;
	}
	
	// method to display all instance variables

	
	@Override
	public String toString() {
		return "Flight Number\t: " + flightNumber + ", Destination\t: " + destination + ", Origin\t: " + origin
				+ ", Duration\t: " + duration;
	}

}
