package practical_constructors_inheritance;

public class Animal {
	private String name;
	
	//default constructor 
	Animal(){
		
	}
	
	
	/**constructor with args
	 * @param name
	 */
	public Animal(String name) {
		super();
		this.name = name;
	}
	//getters and setters

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
	
	
}
