package arrayPractical;

public class Heights {

	public static void main(String[] args) {
		double[] heights = { 1.4, 1.9, 1.31, 1.2 };

		getAvg(heights);
		getMinMax(heights);
	}

	public static void getAvg(double[] heights) {

		double totalH = 0;
		for (double h : heights) {
			totalH += h;
		}
		System.out.printf("Average height : %.2fm \n", totalH / heights.length);

	}
	/**
	 * method to retrieve the average height, tallest and shortest student
	 * @param heights
	 */
	public static void getMinMax(double[] heights) {

		double minH = heights[0];
		double maxH = heights[0];

		for (int index = 0; index < heights.length; index++) {
			if (heights[index] < minH) {
				minH = heights[index];
			}
			if(heights[index]> maxH) {
				maxH = heights[index];
			}
		}
		System.out.printf("Shortest %.1f \n",minH);
		System.out.printf("Tallest %.1f",maxH);

	}
}
