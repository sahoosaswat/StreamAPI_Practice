package streamapi;

import java.util.Map;
import java.util.stream.Collectors;

public class OccuranceEcahCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Hello World";
		
		 Map<Character, Long> collect = str.chars()
		     .mapToObj(ch -> (char) ch)
		     .collect(Collectors.groupingBy(ch -> ch, Collectors.counting()));
		     
		 System.out.println(collect);

	}
}
