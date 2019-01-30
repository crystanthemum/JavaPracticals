package practical_constructors_inheritance;

public class Flight {
	private String flightNumber;
	private String destination;
	private String origin;
	private double duration;

	// default constructor
	public Flight() {

	}

	/**
	 * constructor with arguments
	 * 
	 * @param flightNumber
	 * @param destination
	 * @param duration
	 * @param origin
	 */
	public Flight(String flightNumber, String destination, double duration, String origin) {
		super();
		this.flightNumber = flightNumber;
		this.destination = destination;
		this.setDuration(duration);
		this.origin = origin;
	}

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
	 * @return the duration
	 */
	public double getDuration() {
		return duration;
	}

	/**
	 * @param duration the duration to set
	 */
	public void setDuration(double duration) {
		if (duration <= 18.0) {
			this.duration = duration;
		} else {
			this.duration = 0;
			System.out.println("Invalid input");
		}

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

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Flight Number = " + flightNumber + " Destination = " + destination + " Duration = " + duration
				+ " Origin = " + origin;
	}
	/*
	 * e. Update the Flight class. Add validation to the class to ensure that the
	 * Duration upper limit is 18 hours (inclusive). If this happens then default
	 * Duration to 0 and output an appropriate message to the user. Hint : put the
	 * validation in the setter for the duration and call it directly from the
	 * constructor.
	 * 
	 */

}
