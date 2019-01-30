package practical;

public class Practical {

	public static void main(String[] args) {
		String myName = "Crystal Fong";
		
		// dot operator triggers String methods (action
		//that could be performed on a string
		
		System.out.println(myName);
		System.out.println(myName.length());
		System.out.println(myName.charAt(0));
		System.out.println(myName.charAt(1));
		System.out.println(myName.toUpperCase());
		System.out.println(myName.replace('a', '%'));
		System.out.println("----------------------------");
		
		int month = 1;
		switch (month) {
		case 9:
		case 10:
		case 11:
		case 12:
		case 1:
			System.out.println("semester 1");
			break;
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("semester 2");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("Summer");
			break;
		default:
			System.out.println("Invalid input");
		}
	}

}
