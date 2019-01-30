package arrayPractical;

public class Quote {

	public static void main(String[] args) {

		String[] quote = { "Continous", "effort", "not", "strength", "nor", "intelligence", "is", "the", "key", "for",
				"unlocking", "our", "potential" };

		for (String word : quote) {
			System.out.print(word + " ");
		}
		System.out.println();

		System.out.println("Number of words: " + quote.length);

		int letter = 0;
		int totalL = 0;
		String biggestWord = quote[0];
		String smallestWord = quote[0];

		for (int index = 0; index < quote.length; index++) {
			letter += quote[index].length();
			if(quote[index].length() > biggestWord.length()) {
				biggestWord = quote[index];
			}
			if(quote[index].length() < smallestWord.length()) {
				smallestWord = quote[index];
			}
		}
		System.out.println(totalL += letter);
		System.out.println(biggestWord +" "+ biggestWord.length());
		System.out.println(smallestWord +" "+smallestWord.length());

	}

}
