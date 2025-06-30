package streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class LongestStringInArrayString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str= "Hello World Hello Java Programming";
		
		Optional<String> max = Arrays.stream(str.split(" "))
		.max(Comparator.comparingInt(String::length));
		
		System.out.println("Longest String: " + max.orElse("No strings found"));
	}
}
