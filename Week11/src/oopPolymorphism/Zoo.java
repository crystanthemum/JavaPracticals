package oopPolymorphism;
/**
 * 
 * @author Crystal
 *
 */
public class Zoo {
	/**
	 * method to create new animals
	 */
	public static void main(String[] args) {
		Animal a1 = new Animal();
		a1.makeNoise();
		
		//this is dynamic method dispatch 
		Animal d1 = new Dog();
		d1.makeNoise();
		
		Animal lion = new Lion();
		lion.makeNoise();
		System.out.println("--------------------------------------");
		
		// making a polymorphic array (generalised array of animal objects)
		//dont need to make a dog/lion array, put them all in one array bc they're all animals
		
		Animal[] animals = {a1,d1,lion};
		// enhanced for loop
		for(Animal animal: animals) {
			animal.makeNoise();
		}
		System.out.println("----------------------------------------");
		animalNoiseMaker(animals);
		
	}	
		public static void animalNoiseMaker(Animal[]animalS) {
			for(Animal a : animalS) {
				a.makeNoise();
			}
			
		}

}
