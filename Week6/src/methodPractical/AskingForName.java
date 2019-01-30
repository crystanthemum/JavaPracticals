package methodPractical;

import java.util.Scanner;

public class AskingForName {

	public static void main(String[] args) {
		yourName();

	}

	public static void sayHello() {
		System.out.print("Hello! ");
	}

	public static void yourName() {
		sayHello();
		Scanner scanner = new Scanner(System.in);
		System.out.println("What's your name?");
		String userName;
		userName = scanner.next();

		for (int loop = 0; loop < 10; loop++) {
			System.out.println(userName);
		}
		scanner.close();
	}
}
