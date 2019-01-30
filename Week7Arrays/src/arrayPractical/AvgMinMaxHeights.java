package arrayPractical;

public class AvgMinMaxHeights {

	public static void main(String[] args) {

		double heights[] = { 1.4, 1.9, 1.31, 1.2 };
		getAvgHeight(heights);
		getMinMaxHeight(heights);
	}

	public static void getAvgHeight(double[] heights) {
		double avgHeight = 0;
		double totalHeight = 0;
		for (int index = 0; index < heights.length; index++) {
			totalHeight += (heights[index]);
			avgHeight = totalHeight / heights.length;
		}
		System.out.println("Average height is " + avgHeight + "m");
	}

	public static void getMinMaxHeight(double[] heights) {
		double tallest = heights[0];
		double shortest = heights[0];
		for (int index = 0; index < heights.length; index++) {

			if (heights[index] < shortest) {
				shortest = heights[index];
			}
			if (heights[index] > tallest) {
				tallest = heights[index];
			}
		}
		System.out.println("Tallest is "+tallest+"m");
		System.out.println("Shortest is "+shortest+"m");
	}

}
