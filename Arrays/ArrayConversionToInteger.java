package Arrays;
/*
Given an integer array of variable length like so [9, 8, 8, 3] where each item in 
array could be 0 to 9, write a function that would take would interpret the array 
[9, 8, 8, 3] as a number 9883 and increment it by 1. The return of the function would 
be an integer array containing the addition like so [9,8,8,4].
 No zeros in the first position like [0,1,2,3]. 
*/
import java.util.*;
public class ArrayConversionToInteger 
{
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter a limit: ");
		int n = scan.nextInt();
		int[] a = new int[n];
		for(int i = 0;i<n;i++)
		{
			System.out.println("Enter value " + (i+1) + " : ");
			a[i] = scan.nextInt();
		}
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(convert(a)));
	}
	
	static int[] convert(int[] a)
	{
		long[] b = new long[a.length];
		for(int i=0;i<a.length;i++)
		{
			b[i] = a[i];
		}
		long num=0;
		int count = a.length-1;
		for(int i=0;i<a.length;i++)
		{
			num += a[i]*Math.pow(10, count);
			count--;
		}
		System.out.println(num);
		num++;
		System.out.println(num);
		ArrayList<Long> array = new ArrayList<Long>();
		for( int i=0;i<b.length;i++)
		{
			if(i!=b.length-1)
				array.add(b[i]);
			else
				array.add(b[i] +1);
		}
		for(int i=0;i<a.length;i++)
		{
			a[i]=array.get(i).intValue();
		}
		return a;		
	}
}
