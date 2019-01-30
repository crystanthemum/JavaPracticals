package methodsPractical;

public class GetMonths {

	public static void main(String[] args) {
		getMonth(55);
	}
	public static String getMonth(int month) {
		
		String monthName=null;
		switch(month) {
		case 1: System.out.println("January");
		break;
		case 2: System.out.println("Feb");
		break;
		case 3: System.out.println("Mar");
		break;
		case 4: System.out.println("April");
		break;
		case 5: System.out.println("May");
		break;
		case 6: System.out.println("June");
		break;
		default: System.out.println("invalid number, no months associated");
		}
		return monthName;
	
		
	}

}
