package nestForLoops;

public class PreFixAndPostFix {

	public static void main(String[] args) {
		
		int num = 2;
		//postfix: operator comes after
		System.out.println(num);
		System.out.println(num++);
		System.err.println(num);
		
		int num1 = 2;
		System.out.println(num1);
		System.out.println(++num1); //prefix operator: adds one before itget printed out
		System.out.println(num1);
	}

}
