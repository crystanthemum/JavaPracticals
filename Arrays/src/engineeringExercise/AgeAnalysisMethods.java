package engineeringExercise;

//finish.

public class AgeAnalysisMethods {

	public static void main(String[] args) {
		int [] age = {22,29,22,23,29,25,22,22};
		averageAge(age);
		
		getYoungOld(age);
		
	}
	//2. method to display member's age and the average age
	public static void averageAge(int []age) { //parameters taking in the age array above
		
		int totalAge = 0;
		int averageAge = 0;
		for (int loop = 0; loop<age.length; loop++) {
			System.out.println("member "+loop + " is "+age[loop] + " years old");
			totalAge+= age[loop];
			
		}
		averageAge = totalAge/age.length;
		System.out.println("average age is " + averageAge);
	}
	// method to get the youngest age and oldest age
	public static void getYoungOld(int[]age) {
		
		int youngest = age[0];
		int oldest = age[0];
		for (int loop = 0; loop<age.length; loop++) {
			if (age[loop]>oldest) {
				oldest = age[loop];
			} 
			if (age[loop]<youngest) {
				youngest = age[loop];
			}
		}
		System.out.println("oldest age = " + oldest);
		System.out.println("youngest age = " + youngest);

	}
			
			
			
}
