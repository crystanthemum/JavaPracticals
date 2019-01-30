package practical_constructors_inheritance;

public class City {

	private String cityName;
	private int population;
	private boolean countryCapital;
	private String country;

	// GETTERS AND SETTERS FOR INSTANCE VARIABLES
	/**
	 * gets the city name
	 * 
	 * @return the cityName
	 */
	public String getCityName() {
		return cityName;
	}

	/**
	 * sets the city name
	 * 
	 * @param cityName the cityName to set
	 */
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	/**
	 * sets the population
	 * 
	 * @return the population
	 */
	public int getPopulation() {
		return population;
	}

	/**
	 * gets the population
	 * 
	 * @param population has to be more than 0 but less than 50
	 */
	public void setPopulation(int population) {
		if (population < 0 && population > 50) {
			this.population = 1;
		} else {
			this.population = population;
		}
	}

	/**
	 * gets the country capital if applicable
	 * 
	 * @return the countryCapital
	 */
	public boolean isCountryCapital() {
		return countryCapital;
	}

	/**
	 * sets country capital to true or false
	 * 
	 * @param countryCapital the countryCapital to set
	 */
	public void setCountryCapital(boolean countryCapital) {
		this.countryCapital = countryCapital;
	}

	/**
	 * gets country
	 * 
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * sets the country
	 * 
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	// default constructor

	public City() {
	}

	// constructor with args
	/**
	 * 
	 * @param cityName
	 * @param population
	 * @param countryCapital
	 * @param country
	 */
	public City(String cityName, int population, boolean countryCapital, String country) {
		this.cityName = cityName;
		this.setPopulation(population);
		this.countryCapital = countryCapital;
		this.country = country;
	}

	/**
	 * method to display details of city
	 */

	@Override
	public String toString() {
		return "City city Name = " + cityName + ", population=" + population + ", countryCapital=" + countryCapital
				+ ", country=" + country;
	}

	// method to display detail of all the cities
	public static void displayAll(City[] cityArray) {

		for (City city : cityArray) {
			System.out.println(city);
		}

	}

}
