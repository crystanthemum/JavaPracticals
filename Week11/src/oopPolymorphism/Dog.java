package oopPolymorphism;
/**
 * @author Crystal 
 */
public class Dog extends Animal {
	/**
	 * method to tell a dog to bark
	 */
	@Override   //good policy to include
	public void makeNoise() {
		System.out.println("Dog goes bark...");
}
}