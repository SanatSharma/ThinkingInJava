package Arrays;
/*Write a method sumArrays. The method has two parameters. Each parameter is an
array of ints. You may assume neither of the array variables equals null. The method returns an array equal
in length to the smaller of the two parameters. The elements of the returned array equal the sum of the
corresponding elements in the two parameters.
Neither of the parameters is altered as a result of this method.
Examples of calls to sumArray:
sumArrays({1, 2}, {2, 3}) returns the array {3, 5}
sumArrays({}, {2, 3}) returns the array {}
sumArrays({1, 2, 2, 4}, {4, 6}) returns the array {5, 8}
sumArrays({}, {}) returns the array {}
You may not use any other methods or classes in your answer other than Java's built in, native arrays.
You may not use the static methods from the Arrays class
*/
import java.util.*;
public class SumArrays 
{
	public static void main(String[] args)
	{
		System.out.println(Arrays.toString(sumArrays(new int[]{1, 2}, new int[]{2, 3})));
		System.out.println(Arrays.toString(sumArrays(new int[]{}, new int[]{2, 3})));
		System.out.println(Arrays.toString(sumArrays(new int[]{1, 2, 2, 4}, new int[]{4, 6})));
		System.out.println(Arrays.toString(sumArrays(new int[]{}, new int[]{}))); 
	}

	public static int[] sumArrays(int[] a, int[] b)
	{
		int la = a.length;
		int lb = b.length;
		int[] arr = new int[(int)Math.min(la, lb)];
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = a[i]+b[i];
		}
		
		return arr;
	}
}
