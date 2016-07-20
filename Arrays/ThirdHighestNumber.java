package Arrays;
/*
 * Given an array of integers, determine the third highest number.

	thirdHighest([1, 3, -6, 7, 0]) -> 1
	thirdHighest([10, -1, 4, 5, 20]) -> 5
*/
import java.util.*;
public class ThirdHighestNumber 
{
	static Random rand = new Random();
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.println("enter a limit : ");
		int n = scan.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i] = rand.nextInt(20);
		}
		System.out.println(Arrays.toString(a));
		
		thirdHighest(a);
	}
	
	static void thirdHighest(int[] arr)
	{
		Boolean flag = true;
		while(flag)
		{
		    flag = false;
			for(int i=0;i<arr.length-1;i++)
			{
				if(arr[i]<arr[i+1])
				{
					int temp = arr[i];
					arr[i]=arr[i+1];
					arr[i+1] = temp;
					flag =true;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(arr[2]);
	}
}
