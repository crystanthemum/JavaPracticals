package practicePolyMorphism;

public class PettingZoo {

	public static void main(String[] args) {

		Animal a1 = new Animal();
		Animal a2 = new Dog();
		Animal a3 = new Cat();
		Animal a4 = new Cow();

		a1.makeNoise();
		a2.makeNoise();
		a3.makeNoise();
		a4.makeNoise();
		System.out.println();
		a1.eats();

		// creating a polymorphic array of the Animal superclass
		System.out.println("--------within a polymorphic array---------");
		Animal[] animalArray = { a1, a2, a3, a4 };

		for (Animal eachAnimal : animalArray) {
			eachAnimal.makeNoise();
			eachAnimal.eats();
		}
		/*
		System.out.println();
		NoiseAnalyser(a1);
		NoiseAnalyser(a2);
		NoiseAnalyser(a3);
		NoiseAnalyser(a4);
		
		getFavFood(a1);
		*/

	}

	public static void NoiseAnalyser(Animal a) {
		a.makeNoise();

	}
	public static void getFavFood(Animal b) {
		b.eats();
	}

}
