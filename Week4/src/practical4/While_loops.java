package practical4;

public class While_loops {

	public static void main(String[] args) {
		int sum = 0;
		int num = 1;
		
		sum = num+sum;
		System.out.println(sum);
		
		while (num <=11)
			{
			System.out.println("the sum is" + (sum = sum+num));
			num++;
			}
		}
	}


