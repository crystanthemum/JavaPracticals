package practical4;

import java.util.Scanner;

public class ForLoops {

	public static void main(String[] args) {
		String name;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What is your name?");
		name = scanner.next();
		
		
		for (int i = 0;i <=9; i++)
			System.out.println(name);
		
		scanner.close();
	}
}
