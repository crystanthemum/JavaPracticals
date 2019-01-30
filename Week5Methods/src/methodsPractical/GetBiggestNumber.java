package methodsPractical;

public class GetBiggestNumber {

	public static void main(String[] args) {
		System.out.println(getBiggestNum(7, 2));
	}/*
		 * method will return the biggest integer passed in its parameters
		 */

	public static int getBiggestNum(int num1, int num2) {
		int biggestNum = 0;

		if (num1 > num2) {
			biggestNum= num1;
		} else if (num2 > num1) {
			biggestNum=num2;
		} else if (num2 == num1) {
			System.out.println("Both numbers are the same");
		} else
			System.out.println("invalid input");

		return biggestNum;

	}

}
