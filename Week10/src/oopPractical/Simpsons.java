package oopPractical;

public class Simpsons {
	//instance vars
	private String name;
	private String catchPhrase;
	
	Simpsons(){ //the constructor
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCatchPhrase() {
		return catchPhrase;
	}
	public void setCatchPhrase(String catchphrase) {
		this.catchPhrase = catchphrase;
	}
	/*
	 * this method will output character's catchphrase
	 */
	public void sayCatchPhrase() {
		System.out.println(this.getName()+ " says " + this.getCatchPhrase());
	}
}
