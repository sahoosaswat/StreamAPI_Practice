package streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class SecondHighestElement {

	public static void main(String[] args) {

		int[] arr = { 10, 20, 4, 45, 99, 99, 99 };
		
		Optional<Integer> secondHighest = Arrays.stream(arr)
		.boxed() // Convert int to Integer
		.sorted(Comparator.reverseOrder()) // Sort in descending order)
		.distinct() // Remove duplicates
		.skip(1) // Skip the first element (highest)
		.findFirst() // Get the second highest element
		;
		
		System.out.println("Second highest element: " + secondHighest.orElse(null));
	}

}
