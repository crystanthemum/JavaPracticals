/**
 * 
 */
package twoDArrays;

/**
 * @author User
 *
 */
public class StudentRecordManager {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//1. create student 1
		
		Student student1 = new Student();
		student1.setName("Crystal");
		System.out.println(student1.getName());
		
		//2. create student 2
		Student student2 = new Student();
		student2.setName("Ciaran");
		System.out.println(student2.getName());
		
		//3. create student 3
		Student student3 = new Student();
		student3.setName("Dylan");
		System.out.println(student3.getName());
	}

}
