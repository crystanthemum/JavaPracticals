package rugbyplayer;

/**
 * this superclass is rugby player
 * 
 * @author User
 *
 */
public class RugbyPlayer {

	private String name;
	private int age;
	private double weight;
	private String nationality;

	// Getters and Setters for instance variables
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param valid age 16-40 y.o
	 */
	public void setAge(int age) {
		if (age < 16 && age > 40) {
			this.age = -1;
			System.out.println("invalid age");
		} else {
			this.age = age;
		}
	}

	/**
	 * @return the weight
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * @param weight the weight to set
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}

	/**
	 * @return the nationality
	 */
	public String getNationality() {
		return nationality;
	}

	/**
	 * @param nationality the nationality to set
	 */
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	// default constructor
	public RugbyPlayer() {

	}

	/**
	 * constructor with arguments
	 * 
	 * @param name
	 * @param             age: age has to be 16 or above and under 40 years old
	 * @param weight
	 * @param nationality
	 */
	public RugbyPlayer(String name, int age, double weight, String nationality) {
		this.name = name;
		this.setAge(age);
		this.weight = weight;
		this.nationality = nationality;
	}

	/**
	 * method to display all the instance variables to screen
	 */
	public void showAll() {
		System.out.println("name : " + this.name);
		System.out.println("age :" + this.age);
		System.out.println("weight :" + this.weight);
		System.out.println("nationality :" + this.nationality);
	}
}
