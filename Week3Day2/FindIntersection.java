package Week3Day2;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Pseudo Code
		
		 * a) Declare An array for {3,2,11,4,6,7};	 
		 * b) Declare another array for {1,2,8,4,9,7};
		 * c) Declare for loop iterator from 0 to array length
		 * d) Declare a nested for another array from 0 to array length
		 * e) Compare Both the arrays using a condition statement
		 
		 *  f) Print the first array (shoud match item in both arrays)
		 */
		int[] num1={3,2,11,4,6,7};
		int[] num2= {1,2,8,4,9,7};
		List<Integer> lst1=new ArrayList<Integer>();
		List<Integer> lst2=new ArrayList<Integer>();
		for(int i=0;i<num1.length;i++)
		{
			lst1.add(num1[i]);
		
	}
		for(int i=0;i<num2.length;i++) {
			lst2.add(num2[i]);
		}
			System.out.println(lst1);
			System.out.println(lst2);
for(int i=0;i<lst1.size();i++)
{
for(int j=0;j<lst2.size();j++)
{
	if(lst1.get(i).equals(lst2.get(j)))
	{
		System.out.println(lst1.get(i));
	}

}
}
	}}