package Week3Day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Pseudo code 
		 
		 * a) Use the declared String text as input
			String text = "We learn java basics as part of java sessions in java week1";
		 * c) Split the String into array and iterate over it 
		 * d) Initialize another loop to check whether the word is there in the array
		 * e) if it is available then increase and count by 1. 
		 * f) if the count > 1 then replace the word as "" 
		 
		 * g) Displaying the String without duplicate words	
		 */
		String text = "We learn java basics as part of java sessions in java week1";
		String[] split = text.split(" ");
		List<String> lst=new ArrayList<String>(Arrays.asList(split));
			System.out.println(lst);
		    int count=0;
		for(int i=0;i<lst.size()-1;i++)
		{
		for(int j=0;j<lst.size()-1;j++) {
			if(lst.get(i).equals(lst.get(j)))
					{
			 count = count+1;
			}
			if(count>1)
			{
		
		lst.removeAll(Collections.singleton(lst.get(i)));
		
	}

}
		System.out.println(lst);
}

}
}