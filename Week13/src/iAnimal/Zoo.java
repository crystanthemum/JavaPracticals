/**
 * 
 */
package iAnimal;

/**
 * @author User
 *
 */
public class Zoo {

	/**
	 * 
	 */
	public Zoo() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Panda a1 = new Panda();
		a1.eat();
		a1.makeNoise();
		a1.move();
		System.out.println();
		
		Elephant a2 = new Elephant();
		a2.eat();
		a2.makeNoise();
		a2.move();
		System.out.println();
		
		Lion a3 = new Lion();
		a3.eat();
		a3.makeNoise();
		a3.move();
		System.out.println();
		
		
	}

}
