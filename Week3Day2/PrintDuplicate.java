package Week3Day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrintDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
     List<Integer> lst=new ArrayList<Integer>();
	 for(int i=0;i<arr.length;i++)
	 {
		 lst.add(arr[i]);
	 }
		
	Collections.sort(lst);
	System.out.println(lst);
	for(int i=0;i<lst.size()-1;i++)
	{
		if(lst.get(i)==lst.get(i+1))
		{
			System.out.println(lst.get(i));
		}
	}
		
		// get the length of the array
		// declare an int variable named count
		
		// iterate from 0 to the array length-1 (outer loop starts here)
		
			// assign 0 to count 
			
			// iterate from i to the length of the array by adding 1 to it (inner loop starts here)
			
					// compare both the loop variables & check they're equal
				
							// print the matching value
					
			

	}

}
