/**
 * 
 */
package shoes;

/**
 * @author User
 *
 */
public class ShoeFactory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Footwear f1 = new Trainers("Nike", "Huarache", 6, true);
		Footwear f2 = new Trainers("Adidas", "Court Vantage", 8, true);
		Footwear f3 = new Trainers("Puma", "NMDs", 8, true);
		Footwear f4 = new Boots("Dr Martens", "1460", 16, false);
		Footwear f5 = new Boots("Timberlands", "Classic", 16, true);
		Footwear f6 = new Shoes("Hunters", "Tall", 0, "Pink");
		Footwear f7 = new Shoes("Schuh", "Brogues", 6, "Black");

		Footwear[] allShoes = { f1, f2, f3, f4, f5, f6, f7 };
		
		int totalEyelets = 0;
		
		for (int index = 0; index < allShoes.length; index++) {
			if (allShoes[index].getLaceHoles() < 2)
				System.out.println(allShoes[index].getBrand());
			if (allShoes[index].getBrand().equalsIgnoreCase("nike")) {
				System.out.println(allShoes[index].getBrand());
			if (allShoes[index].getBrand()!= "Nike") {
				System.out.println(allShoes[index].getBrand());
			}
		
			}
			totalEyelets += allShoes[index].getLaceHoles();
			
		}
		System.out.printf("Average number of eyelets : %.2f ", 	(double)totalEyelets / allShoes.length);
		
	}

}
