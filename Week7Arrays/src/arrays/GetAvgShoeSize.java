package arrays;

public class GetAvgShoeSize {

	public static void main(String[] args) {
		System.out.printf("The avg shoe size is %.2f",getAvgShoeSize(7.5, 4.0, 12.0));
	}

	/**
	 * method returns avg shoe sizes
	 */
	public static double getAvgShoeSize(double size1, double size2, double size3) {

		double average = 0;

		average = (size1 + size2 + size3) / 3;

		return average;
	}

}
