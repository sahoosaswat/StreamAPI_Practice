package streamapi;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class CountFrequencyWordString {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Hello World Hello Java";
		
		Map<String, Long> collect1 = Arrays.stream(str.split(" "))
		      .collect(Collectors.groupingBy(word -> word, Collectors.counting()));

		System.out.println(collect1);
	}
}
