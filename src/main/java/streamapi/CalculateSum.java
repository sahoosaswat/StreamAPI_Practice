package streamapi;

public class CalculateSum {

	public static void main(String[] args) {

		
		int num= 87654321;
		int sum = String.valueOf(num).chars()
		.map(ch -> ch - '0') // Convert char to int)
		.sum();
		
		System.out.println("Sum of digits: " + sum);
	}

}
