package streamapi;

import java.util.Arrays;
import java.util.List;

public class StringToUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<String> nameList = Arrays.asList("Ram" ,"Shyam" , "Mohan" , "Sita");
		List<String> upperList = nameList.stream()
			     .map(String :: toUpperCase)
			     .toList();
		
		System.out.println(upperList);

	}

}
