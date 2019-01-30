package arrayPractical;

public class AverageTemperature {

	public static void main(String[] args) {
		double temps[] = {3.4,4.2,9.0,2.2,4.5,6.4,3.1};
		getAvgTemp(temps);
		getMinMaxTemps(temps);
	}
	public static void getAvgTemp(double[]temps) {
		double totalTemp=0;
		for(int index = 0; index <temps.length; index++) {
		totalTemp+= temps[index];}
		
		System.out.println("total temp : "+ totalTemp);
		double avgTemp = (totalTemp/temps.length);
		System.out.println(avgTemp);
	}
	public static void getMinMaxTemps(double[]temps) {
		double maxTemp = temps[0];
		double minTemp = temps[0];
		
		for(int index = 0; index <temps.length; index++) {
		if (maxTemp < temps[index]) {
			maxTemp = temps[index];
		}
		if (minTemp > temps[index]) {
			minTemp = temps[index];
		}
		
		}
		System.out.println("Max temp: "+maxTemp+ " degrees");
		System.out.println("Min temp:" +minTemp+" degrees");
	}
}

