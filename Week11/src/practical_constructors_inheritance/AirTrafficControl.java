package practical_constructors_inheritance;

public class AirTrafficControl {

	public static void main(String[] args) {

		Flight f1 = new Flight("ESY3214", "Belfast", 2.2, "Amsterdam");
		Flight f2 = new Flight("BA12", "London Heathrow", 7, "Cape Town");
		Flight f3 = new Flight("AE999", "Dublin", 7.5, "New York JFK");
		Flight f4 = new Flight("AA678", "Dublin", 8.5, "Newwark");
		Flight f5 = new Flight("EZY123", "Dublin", 5.0, "Paris");
		Flight f6 = new Flight("AU845", "Beijing", 18.1, "Paris");

		System.out.println("Flights printed out the long way ");
		System.out.println(f1.toString());
		System.out.println(f2.toString());
		System.out.println(f3.toString());
		System.out.println(f4.toString());
		System.out.println(f6.toString());

		System.out.println("-------------------------------------");

		System.out.println("All the flight objects in an array printed out with a for loop\n");
		Flight[] flightsArray = { f1, f2, f3, f4,f5 }; // array is called flights
		for (int index = 0; index < flightsArray.length; index++) {
			System.out.println(flightsArray[index].toString());
		}

		System.out.println("----------Find the longest flight-----------------\n");
		
		double longestFlight = flightsArray[0].getDuration();
		for(int index = 0; index <flightsArray.length; index++) {
			if (flightsArray[index].getDuration()>longestFlight) {
				longestFlight = flightsArray[index].getDuration();
			}
		}
		System.out.println("The longest flight : "+longestFlight+"hours");
		
		System.out.println("----------Flights to Dublin-------------\n");
		
		for (int index = 0; index < flightsArray.length; index++) {
			if (flightsArray[index].getDestination().equalsIgnoreCase("Dublin")) {
				System.out.println(flightsArray[index].getFlightNumber() +" "+    flightsArray[index].getDestination());
			}
		}

	}
}
