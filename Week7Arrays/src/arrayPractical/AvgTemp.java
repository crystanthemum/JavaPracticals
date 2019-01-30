package arrayPractical;

public class AvgTemp {

	public static void main(String[] args) {
		
		double[] temps = {3.4,4.2,9.0,2.2,4.5,6.4,3.1};
		
		double totalTemps = 0;
		
		for (int index = 0; index < temps.length; index++) {
			totalTemps+= temps[index];
		}
		System.out.printf("Average temp %.1f degree celsius", totalTemps/temps.length);
	}

}
