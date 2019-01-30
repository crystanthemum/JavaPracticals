package practicePolyMorphism;

public class Company {

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		Employee e2 = new Director();
		Employee e3 = new Surgeon();
		Employee e4 = new Barber();
		
		Employee[]employees = {e1, e2, e3, e4};
		
		for(Employee e : employees) {
			e.cut();
		}
		System.out.println("--------------------");
		
		e1.cut();
		e2.cut();
		e3.cut();
		e4.cut();

}
}