/**
 * @user Crystal 
 */
package practical_constructors_inheritance;

/**
 * @author User
 *
 */
public class CityAdmin {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		City c1 = new City("Beijing", 11, true, "China");
		City c2 = new City("Madrid", 5, true, "Spain");
		City c3 = new City("Rome", 6, true, "Italy");
		City c4 = new City("New York", 8, false, "USA");
		City c5 = new City("Washington", 2, true, "USA");
		City c6 = new City("Dallas", 3, false, "USA");

		City[] cityArray = { c1, c2, c3, c4, c5, c6 };

		System.out.println("-----method invoked from City class-------");
		City.displayAll(cityArray);
		System.out.println("-----method invoked from CityAdmin class------");
		displayAll(cityArray);

		System.out.println("-------non static method--------");
		City.displayAll(cityArray);

		getMinPop(cityArray);
		getCapital(cityArray);
		getUSACities(cityArray);
		getAvgPop(cityArray);

	}

	/*
	 * method to display all city details
	 */
	public static void displayAll(City[] cityArray) {
		for (City city : cityArray) {
			System.out.println(city);
		}
	}

	/**
	 * method to get city with smallest population
	 */

	public static void getMinPop(City[] cityArray) {
		// tracking the INDEX of the city with the smallest population
		int city = 0;

		for (int index = 0; index < cityArray.length; index++) {

			if (cityArray[index].getPopulation() < cityArray[city].getPopulation()) {
				// if there's a city with a smaller population, use its index
				city = index;
			}
		}
		System.out.println(cityArray[city].getCityName() + " has the smallest population at "
				+ cityArray[city].getPopulation() + " million\n");
	}

	/**
	 * method to retrieve the capital cities of countries
	 */
	public static void getCapital(City[] cityArray) {

		for (City city : cityArray) {
			if (city.isCountryCapital()) {
				System.out.println(city.getCityName() + " is the capital of " + city.getCountry());
			}

		}
		System.out.println();

	}

	/**
	 * method to retrieve cities of USA
	 * 
	 * @param cityArray
	 */
	public static void getUSACities(City[] cityArray) {

		for (City city : cityArray) {
			if (city.getCountry().equalsIgnoreCase("uSa")) {
				System.out.println(city.getCityName() + " is a city in USA");
			}
		}

	}

	/**
	 * method to calculate the average population of all the cities
	 */
	public static void getAvgPop(City[] cityArray) {
		int totalPop = 0;

		for (City city : cityArray) {
			totalPop += city.getPopulation();
		}
		System.out.printf("Average city population : %.2f million", (double) totalPop / cityArray.length);

	}

}
