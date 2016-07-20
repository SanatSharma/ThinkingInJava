package Arrays;

import java.lang.reflect.Array;

public class UniqueElements {

	public static void main(String[] args) 
	{
		System.out.println(isUnique(new int[]{14, 0, -10, 8, 3, 0, 4, 11}));
		System.out.println(isUnique(new int[]{19,44,2,8,3,-7,7,14}));
		System.out.println(isUnique(new int[]{1,1,1,1}));
		System.out.println(isUnique(new int[]{0,1,34,2,1,0}));
	}

	/*Write a static method isUnique that takes an array of integers as its arguments
	and returns a boolean value indicating whether or not the values in the array
	are unique. The values in the array are unique if no value occurs more than once in
	the array.
	Note: You may not call any methods from the Arrays class in your solution.
	For example, consider this array:
	int[] list = {14, 0, -10, 8, 3, 0, 4, 11};
	The call isUnique(list) should return false, since the value 0 appears more than
	once in this list.
	Consider this array:
	int[] list = {19, 44, 2, 8, 3, -7, 7, 14};
	Then the call isUnique(list) should return true, since there are no duplicated values
	in the list.
	 */
	public static boolean isUnique(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i;j<arr.length-1;j++)
			{
				if(arr[i]==arr[j+1])
					return false;
			}
		}
		return true;
	}
}
