package arrayPractical;

public class HoursAndWages {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] weekOneHours = {8,7,9,7,4,7};	
		int [] weekTwoHours = {7,2,8,10,6,7};
		getSalary(weekTwoHours);
		System.out.println("__________________");
		getSalary(weekOneHours);
	}
	public static final double RATE = 11.50;
	public static void getSalary(int[]hours) {
		int totalHours=0;
		double totalSalary=0;
		for (int day = 0; day < hours.length; day++) {
			System.out.printf("Day: %d, Hours worked: %d \n", (day +1), hours[day]);
		
		totalHours+=hours[day];}
		
		System.out.println("Total hours worked for the week :" +totalHours);
		totalSalary = totalHours * RATE;
		System.out.println("Salary for the week :£" + totalSalary);
			
		}
		
	}


