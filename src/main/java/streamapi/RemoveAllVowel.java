package streamapi;

import java.util.stream.Collectors;

public class RemoveAllVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "HelloWorld";
		
		String collect = str.chars()
		       .filter(ch -> !"aeiouAEIOU".contains(String.valueOf((char) ch)))
		       .mapToObj(ch -> String.valueOf((char) ch))
		       .collect(Collectors.joining());
		
		System.out.println(collect);

	}

}
