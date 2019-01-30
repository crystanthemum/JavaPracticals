package methods;
/*
 * 
 */
public class BiggestNumberMethod {
	/*
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Start main");
		
		int biggerNumber;
		
		biggerNumber = biggestNumber(78,788);
		
		System.out.println("The bigger number is :" + biggerNumber);
		
		System.out.println("End main");
	}
	public static int biggestNumber(int num1, int num2) {
		
		int biggest;
		
		if (num1 > num2) {
			biggest = num1;
		}else {
			biggest = num2;
		}
		return biggest;
	}
	
	
}
