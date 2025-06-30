package streamapi;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class LengthOfWordString {

	public static void main(String[] args) {

			String str = " Hii Hello World Java to";
			
			Map<String, Integer> collect = Arrays.stream(str.split(" "))
					.distinct()
					.collect(Collectors.toMap(
									          word -> word, 
									          String::length));
			
			System.out.println(collect);
			
			//convert this above implementation to get the words with appearance by using  LinkedHashMap
			
			Map<String, Integer> collectLinkedHashMap = Arrays.stream(str.split(" "))
					.collect(Collectors.toMap(
							word -> word, 
							String::length, 
							(oldValue, newValue) -> oldValue, 
							LinkedHashMap::new));
			System.out.println(collectLinkedHashMap);
			
	}
}
