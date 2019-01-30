/**
 * 
 */
package iAnimal;

/**
 * @author User
 *
 */
public class Elephant implements IAnimal {

	/**
	 * 
	 */
	public Elephant() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see iAnimal.IAnimal#move()
	 */
	@Override
	public void move() {
		System.out.println("Elephant goes thump thump thump");
	}

	/* (non-Javadoc)
	 * @see iAnimal.IAnimal#makeNoise()
	 */
	@Override
	public void makeNoise() {
		System.out.println("Elephant goes toot toot");
	}

	/* (non-Javadoc)
	 * @see iAnimal.IAnimal#eat()
	 */
	@Override
	public void eat() {
		System.out.println("Elephant eats peanuts");
	}

}
