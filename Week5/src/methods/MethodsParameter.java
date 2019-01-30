package methods;

/*
 * @author crystal fong
 */
public class MethodsParameter {
	/*
	 * 
	 */
	public static void main(String[] args) {
		System.out.println("start main");

		numberCounter(99, 100);

		System.out.println("end main");
	}

	/*
	 * start - the start point for the loop end  the end point for the loop
	 */
	public static void numberCounter(int start, int end) {
		if (start <= end) {
			for (int loop = start; loop <= end; loop++) {
				System.out.println(loop);
			}
		} else {
			System.out.println("please put a valid start number and valid end number");
		}
	}

}
