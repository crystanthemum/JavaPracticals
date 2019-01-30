package whatDoesTheFoxSay;

public class RunLyrics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal dog = new Animal();
		dog.setName("dog");
		dog.setNoise("woof");
		System.out.println(dog.getName() + " goes " + dog.getNoise());

		Animal cat = new Animal();
		cat.setName("cat");
		cat.setNoise("meow");
		System.out.println(cat.getName() + " goes " + cat.getNoise());

		Animal bird = new Animal();
		bird.setName("bird");
		bird.setNoise("tweet");
		System.out.println(bird.getName() + " goes " + bird.getNoise());

		Animal mouse = new Animal();
		mouse.setName("mouse");
		mouse.setNoise("squeak");
		System.out.println(mouse.getName() + " goes " + mouse.getNoise());

		System.out.println("But there's one sound that no one knows.....\nWHAT DOES THE FOX SAY?");

		for (int loop = 0; loop < 3; loop++) {
			System.out.println("Ring-ding-ding-ding-dingringeding");
		}
		System.out.println("What does the fox say?");
		for (int loop = 0; loop < 3; loop++) {
			System.out.println("Hatee-hatee-hatee-ho!");

		}
		System.out.println("What does the fox say?");
	}

}
