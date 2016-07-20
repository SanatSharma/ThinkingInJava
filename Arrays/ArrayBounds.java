package Arrays;
import java.util.*;

public class ArrayBounds 
{
	public static void main(String[] args) 
	{
		System.out.println(Arrays.toString(getValuesOutsideRange(new int[] {},0,3)));
		System.out.println(Arrays.toString(getValuesOutsideRange(new int[] {0,3,0,3,3,1},0,3)));
		System.out.println(Arrays.toString(getValuesOutsideRange(new int[] {-1,-10,15,4,3,1,10},0,3)));
		System.out.println(Arrays.toString(getValuesOutsideRange(new int[] {15,-5,20},-3,10)));
		System.out.println(Arrays.toString(getValuesOutsideRange(new int[] {5,-4,4,10},4,4)));
	}

	/*Write a method numOutsideRange. The method has 3 parameters:
	an array of ints, and two ints that represent the low and high ends of a range. 
	The method returns the number of elements in the array that are outside of the 
	range from low to high inclusive.
	Examples:
	numOutsideRange( {}, 0, 3) -> returns 0
	numOutsideRange( {0, 3, 0, 3, 3, 1}, 0, 3) -> returns 0
	numOutsideRange( {-1, -10, 15, 4, 3, 1, 10}, 0, 3) -> returns 5
	numOutsideRange( {15, -5, 20}, -3, 10) -> returns 3
	numOutsideRange( {5, -4, 4, 10}, 4, 4) -> returns 3
	You may not use any other Java classes or methods in your answer.
	Of course you may access the length field of the given array.
	You may assume low <= high
	*/
	public static int numOutsideRange(int[] a, int low, int high)
	{
		int result=0;
		for(int i=0;i<a.length;i++)
		{
			if(low<=a[i]&&a[i]<=high)
			{}	
			else
				result++;
		}
		
		return result;
		
	}
	
	/*Write a method getValuesOutsideRange. The method has 3 parameters: an array of ints, and two ints that represent the low and high ends of a range.
	The method returns a new array with all of the values from the original array that are outside the range from low to high inclusive.
	The values are arranged with the values less than the given range at the front of the array and the values greater than the given range at the end of the array.
	The relative order of the elements less than the given range is unchanged.
	The relative order of the elements greater than the give range is reversed.
	Examples:
	getValuesOutsideRange ( {}, 0, 3) -> returns {}, an empty array
	getValuesOutsideRange ( {0, 3, 0, 3, 3, 1}, 0, 3) -> returns {}
	getValuesOutsideRange ( {-1, -10, 15, 4, 3, 1, 10}, 0, 3) ->
	returns{-1, -10, 10, 4, 15}
	getValuesOutsideRange ( {15, -5, 20}, -3, 10) -> returns {-5, 20, 15}
	getValuesOutsideRange ( {5, -4, 4, 10}, 4, 4) -> returns {-4, 10, 5}
	getValuesOutsideRange ( {5, 3, 6, 7}, 10, 15) -> returns {5, 3, 6, 7}
	getValuesOutsideRange ( {5, 3, 6, 7}, 0, 2) -> returns {7, 6, 3, 5}
	The returned array is a new array.*/
	
	public static int[] getValuesOutsideRange(int[] a, int low, int high)
	{
		int lim = numOutsideRange(a,low,high);
		int[] newArr = new int[lim];
		int c=0;
		int l=newArr.length-1;
		for(int i=0;i<a.length;i++)
		{
			if(low<=a[i]&&a[i]<=high)
			{}	
			else if(a[i]<low)
			{
				newArr[c] = a[i];
				c++;
			}
			else
			{
				newArr[l] = a[i];
				l--;
			}
		}
		
		return newArr;		
	}
}
