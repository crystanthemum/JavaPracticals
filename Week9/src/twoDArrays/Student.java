/**
 * 
 */
package twoDArrays;

/**
 * @author User
 *
 */
public class Student {
	
	// instance vars (-name String)
	private String name;
	
	//constructors 
	
	
	//instance methods (getters and setters)
					//getter naming convention, get+Var name
	/*
	 * Getter method for the name of the student
	 */
	public String getName() {
		return name;
	}
	/*
	 * Setter method to set the student name 
	 */
	public void setName(String name) {
		this.name = name;						//this.name references the instance var name. the second name ref
	}											//the pararmeter argument (String name)
	
}
