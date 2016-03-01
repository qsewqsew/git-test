package task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class task3 {

	public static void main(String[] args) {

Integer [] arr = {48,61,12,54,88,12,90};
		 
List<Integer> newarr = new ArrayList<Integer>(Arrays.asList(arr));
	

	System.out.print("Given array: ");
	for(Integer a:newarr){
	System.out.print(a +" ");
	}
	
	Integer min = Integer.MAX_VALUE;
	int minIndex=0;
	for(int i=0;i<newarr.size(); i++){
		Integer b = newarr.get(i);
		if (b<=min){
			min=b;
			minIndex = i;
			}
	}
	
	Integer sum = 0;
	for(Integer c:newarr){
			sum+=c;
		}
	Integer averege = sum/newarr.size();
	
	newarr.set(minIndex, averege);
	
	System.out.print("\nResult: ");
	for(Integer a:newarr){
	System.out.print(a +" ");
	}
	
	}
	
}

