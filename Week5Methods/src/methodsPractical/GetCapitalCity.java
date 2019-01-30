package methodsPractical;

public class GetCapitalCity {

	public static void main(String[] args) {
		System.out.println(getCity("France"));
	}
	/*
	 * method will return the capital city of entered country
	 */

	public static String getCity(String country) {
		String city = null;

		switch (country) {
		case "France":
			city = "Paris";
			break;
		case "Canada":
			city = "Ottawa";
			break;

		}
		return city;
	}

}
