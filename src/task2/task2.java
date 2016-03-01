package task2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class task2 {
	
	public static void main(String[] args) {
	
	int [] array = {5, 65, 23, 79, 23, 65, 1, 45, 23};
	
	System.out.print("Given array:\n");
	for (int i=0; i<array.length; i++){
		System.out.print(array[i] + " ");
	}
	
	List<Integer> newarray = new ArrayList<Integer>();
	
	for (int i=array.length-1; i>=0; i--){
		newarray.add(array[i]);
}
	
	System.out.print("\nArray reverce: \n");
	for (Integer a:newarray){
		System.out.print(a+ " ");
	}	
	
Set <Integer> set = new LinkedHashSet<Integer>(newarray);	

List<Integer> arrayWithoutDups = new ArrayList<Integer>(set);

System.out.print("\nWithout dups: \n");
for (Integer a:arrayWithoutDups){
	System.out.print(a+ " ");
}	
	
}
}


