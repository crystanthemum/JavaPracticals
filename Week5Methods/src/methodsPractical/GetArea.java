package methodsPractical;

public class GetArea {

	public static void main(String[] args) {
		getArea(5.6, 1.0);
	}
	/*
	 * method calculates area of a triangle if base and height is known
	 *
	 */
	
	public static double getArea(double base, double height) {
		
		double area = 0;
		
		area = (base/2)*height;
		System.out.println(area);
		return area;
	}

}
