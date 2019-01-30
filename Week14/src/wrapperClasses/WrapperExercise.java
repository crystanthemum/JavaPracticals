package wrapperClasses;

import java.util.Arrays;

public class WrapperExercise {

	public WrapperExercise() {
	}

	public static void main(String[] args) {

		int i1 = 33;
		String i2 = "999";
		double i3 = 23.4;
		Integer i4 = 4;
		int i5 = 67;
		int i6 = 31;
		String i7 = "60";
		double i8 = 22.2;
		int i9 = -22;

		// store all in an Array
		Double[] number = new Double[9];
		number[0] = new Double(i1);
		number[1] = new Double(i2);
		number[2] = new Double(i3);
		number[3] = i4.doubleValue();

		// print whats in the array
		System.out.println("array unsorted");
		for (int loop = 0; loop < number.length; loop++) {
			System.out.println(number[loop]);
		}

		Arrays.sort(number);

		System.out.println("sorted array");
		for (int loop = 0; loop < number.length; loop++) {
			System.out.println(number[loop]);
		}

	}

}
