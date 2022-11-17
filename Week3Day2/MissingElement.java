package Week3Day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,7,6,8};
		List<Integer> lst=new ArrayList<Integer>();
		 for(int i=0;i<arr.length;i++)
		 {
			 lst.add(arr[i]);
		 }
			
		Collections.sort(lst);
		System.out.println(lst);
		for(int i=0;i<lst.size()-1;i++)
		{
			if(i+1!=lst.get(i))
			{
				System.out.println(i+1);
				break;
			}
		}

		// Sort the array	
		

		// loop through the array (start i from arr[0] till the length of the array)

			// check if the iterator variable is not equal to the array values respectively
			
				// print the number
				
				// once printed break the iteration

	}

}
