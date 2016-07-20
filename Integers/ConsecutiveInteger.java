package Integers;

import java.util.Arrays;

public class ConsecutiveInteger
{
	public static void main(String[] args)
	{
		System.out.println("Expect true : " +conInt(1, 3, 2));
		System.out.println("Expect true : " +conInt(2,1, 3));
		System.out.println("Expect true : " +conInt(-10, -9, -8));
		System.out.println("Expect false : " +conInt(-7, -7, -8));
		System.out.println("Expect false : " +conInt(0, 1, 3));

	}
	
	/*Write a method consecutive that takes 3 integers as arguments and returns true if
	they are 3 consecutive integers, i.e., the integers can be arranged into an order such
	that, for some integer k, the arguments are k, k + 1, k + 2. Your method should return
	false if the integers are not consecutive.
	The calls consecutive(1, 3, 2), consecutive(2, 1, 3), consecutive(-10, -8,-9)
	, consecutive(100, 101, 102) would all return true.
	The calls consecutive(3, 4, 3), consecutive(3, 5, 6) would return false.
	 */
	public static Boolean conInt(int a, int b, int c)
	{
		int[] arr = new int[]{a,b,c};
		Arrays.sort(arr);
		if(arr[0]==arr[1]-1&&arr[0]==arr[2]-2)
			return true;
		else
			return false;
		
	}
}
