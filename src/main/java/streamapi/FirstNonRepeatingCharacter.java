package streamapi;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;

public class FirstNonRepeatingCharacter {
	public static void main(String[] args) {
		
		String str ="abcbadef";
		
		Optional<Entry<Character, Long>> firstNonRepeated = str.chars()
		.mapToObj(ch -> (char) ch)
		.collect(Collectors.groupingBy(ch -> ch, LinkedHashMap:: new , java.util.stream.Collectors.counting()))
		.entrySet()
		.stream()
		.filter(entry -> entry.getValue() == 1)
		.findFirst();
		
		System.out.println("First non-repeating character: " + firstNonRepeated.get());	
	}
}
