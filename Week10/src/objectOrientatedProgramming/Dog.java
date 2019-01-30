package objectOrientatedProgramming;

public class Dog {
	//instance variables
	private String furColour;
	private String breed;
	private int age;
	//constructors
	public Dog(int dogsAge) {
		age = dogsAge;
		breed = "undefined";
		furColour = "undefined";
	}
	//getters & setters
	public void setfurColour(String furColour) {
		this.furColour = furColour;
	}
	public String getFurColour() {
		return furColour;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public String getBreed() {
		return breed;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public void bark() {
		System.out.println("Uno can go bark bark!");
	}
	public void fetch(int numberOfBalls) {
		System.out.println("Balls fetched : "+ numberOfBalls);
	}
	public void run(int metres) {
		System.out.println("Uno can run "+ metres+" metres!");
	}
}
