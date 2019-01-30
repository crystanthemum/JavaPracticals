package practicals;

public class VowelConsonantCheck {

	public static void main(String[] args) {
		char alphabet = 'c';
		switch (alphabet) 
		{
		
		case 'a' : System.out.println("this letter is a vowel");
			break;
		case 'b' : System.out.println("this letter is a consonant");
			break;
		case 'c' : System.out.println("vowel");
			break;
		
		default : System.out.println("invalid input, please enter a letter of the alphabet");
		
		}

	}
}
