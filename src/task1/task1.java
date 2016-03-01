package task1;

import java.util.ArrayList;
import java.util.List;

public class task1 {

	public static void main(String[] args) {

		List<String> numbers = new ArrayList <> ();
		numbers.add("one");
		numbers.add("two");
		numbers.add("one");
		numbers.add("tree");
		numbers.add("one");
		numbers.add("four");
		numbers.add("five");
		numbers.add("six");
		
		System.out.print("My list: \n");
		for (String a:numbers){
			System.out.println(a);
		}
		
		for (int i=0; i<(numbers.size())/2; i++){
		String b = numbers.get(i);
		if (b.equals("one")){
			numbers.set(i, "dog");
		}
		
	}
	
	System.out.print("My list with replacemenet of \"one\" : \n");
	for (String a:numbers){
		System.out.println(a);
	}	
		
		}
}


