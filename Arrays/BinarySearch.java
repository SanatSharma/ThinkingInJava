package Arrays;
import java.util.*;
public class BinarySearch 
{
	public static void main(String[] args)
	{
		Scanner scan  =new Scanner(System.in);
		System.out.println("Enter a limit: ");
		int n = scan.nextInt();
		System.out.print("Enter " + n + " values in an arranged order: ");
		int[] a = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i] = scan.nextInt();
		}
		
		System.out.println("Enter value of element you wish to search for: ");
		int value = scan.nextInt();
		
		int  place = binarySearch(a,value);
		if(place ==-1)
		{
			System.out.println("Element " + value + " isn't present in the array");
		}
		else
		{
			System.out.println("Element " + value + " is present in the array at the position : " + (place+1));
		}
	}
	
	public static int binarySearch(int[] arr, int value)
	{
		int start = 0;
		int end = arr.length-1;
		while (start<=end)
		{
			int middle = (start + end)/2;
			if(arr[middle]>value)
			{
				end = middle-1;
			}
			else if(arr[middle]<value)
			{
				start = middle + 1;
			}
			else
				return middle;
		}
		return -1;
	}

}
