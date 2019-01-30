package practicals;

import java.util.Scanner;

public class MastersGrading {

	public static void main(String[] args) {
		
		int studentGrade;
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("what grade did you get");
		
		studentGrade = scanner.nextInt();
		
			if ((studentGrade >=0)&&(studentGrade <=49))
			{
				System.out.println("fail");
			}
			else if ((studentGrade >=50)&&(studentGrade <=59))
			{
				System.out.println("pass");
			}
			else if ((studentGrade >= 60)&&(studentGrade <=69))
			{
				System.out.println("merit");
			}
			else if ((studentGrade >= 70) &&(studentGrade<=100))
			{
				System.out.println("distinction");
			}
			else
			{
				System.out.println("invalid input");
			}
			
			scanner.close();
			}
		
		
	}


