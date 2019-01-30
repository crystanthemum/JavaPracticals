/**
 * 
 */
package oopInheritance;

/**
 * @author Crystal
 *
 */
public class PettingZoo extends Animal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Fox fox1 = new Fox("Fantastic Mr Fox", "ring-ding-ding-ding-ding-ah-ring" , "blue","orange");
		System.out.println(fox1);
	
		fox1.makeNoise();
		
		Cat cat1 = new Cat("Garfield", "I hate Mondays", "Black", "Ambivalent", "Lasagna");
		System.out.println(cat1);
		cat1.makeNoise();
		
		Cat cat2 = new Cat("Hello Kitty", "N/A","Black","Sweet","Sushi???");
		System.out.println(cat2);
		cat2.makeNoise();
		
		Dog dog1 = new Dog("Doge", "awooooo", "Black", "being an internet meme");
		System.out.println(dog1);
		dog1.makeNoise();
	}

}
