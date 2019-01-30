/**
 * 
 */
package flights;

/**
 * @author User
 *
 */
public class AirTrafficControl {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Flight f1 = new Flight("ESY3214", "Belfast", "Amsterdam", 2.2);
		Flight f2 = new Flight("BA127", "London Heathrow", "Cape Town", 11.5);
		Flight f3 = new Flight("AE999", "Dublin", "New York JFK", 7.5);
		Flight f4 = new Flight("AA678", "Dublin", "Newwark", 8.5);
		Flight f5 = new Flight("AUS12", "Beijing", "Paris", 18.1);

		System.out.println(f5.toString());

		Flight[] flightsArray = { f1, f2, f3, f4 };

		System.out.println("All flights");
		for (Flight f : flightsArray) {
			System.out.println(f.toString());
		}

		// flight with longest duration
		int longest = 0;

		for (int index = 0; index < flightsArray.length; index++) {

			if (flightsArray[index].getDuration() > flightsArray[longest].getDuration()) {
				longest = index;
			}
		}
		System.out.println(flightsArray[longest].getDuration() + flightsArray[longest].getOrigin());
		
		
	getDublinFlights(flightsArray);

	}
	
	//method to get flights to dublin
	
	public static void getDublinFlights(Flight[]flightsArray) {
		
		for(int index = 0; index <flightsArray.length; index++) {
			if(flightsArray[index].getDestination().equalsIgnoreCase("Dublin")) {
				System.out.println(flightsArray[index].getFlightNumber() + flightsArray[index].getOrigin());
			}
		} 
		
	}

}
