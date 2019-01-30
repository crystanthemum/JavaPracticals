package objectOrientatedProgramming;

public class Kennel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. create dog breed 1
		
		Dog uno = new Dog(2);
		uno.setAge(2);
		uno.setBreed("Cockapoo");
		uno.setfurColour("black");
		System.out.println("Uno is a "+ uno.getAge()+" year old " + uno.getBreed() + " and he is "+ uno.getFurColour());
		uno.fetch(8);
		uno.run(12);
		uno.bark();
		}
	
		
	}
		
	

