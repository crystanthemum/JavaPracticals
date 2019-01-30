package oopPractical;

public class CartoonApp {
/*
 * this class will ad hoc test the Simpsons class
 */
	public static void main(String[] args) {
		
		Simpsons char1 = new Simpsons();
		char1.setName("Bart");
		char1.setCatchPhrase("Eat my shorts!");
		Simpsons char2 = new Simpsons();
		char2.setName("Homer");
		char2.setCatchPhrase("D'Oh!");
		Simpsons char3 = new Simpsons();
		char3.setName("Lisa");
		char3.setCatchPhrase("I'll be in my room");
		Simpsons char4 = new Simpsons();
		char4.setName("Nelson");
		char4.setCatchPhrase("HaHa");
		
		char1.sayCatchPhrase();
		char2.sayCatchPhrase();
		char3.sayCatchPhrase();
		char4.sayCatchPhrase();
	}

}
