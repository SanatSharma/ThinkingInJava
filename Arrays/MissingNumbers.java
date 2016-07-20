package Arrays;
/*
 * Given a sorted array of numbers N through M, return an array that contains all
 * numbers N through M that are NOT in the initial array in sorted order.

	missing(0, 6, [0, 4, 5, 6]) -> [1, 2, 3]
	missing(-4, 7, [-1, 3, 6]) -> [-4, -3, -2, 0, 1, 2, 4, 5, 7]
*/
import java.util.*;
public class MissingNumbers 
{
	//take sorted input.
	//take the final and the lower limit
	//M-N is the amo8nt of numbers that should be present.
	//Try to search if each number from this range is present. 

	//Program works for both sorted and unsorted arrays
	static Scanner scan= new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.println("Enter lower limit: ");
		int n = scan.nextInt();
		System.out.println("Enter upper limit: ");
		int m = scan.nextInt();
		System.out.println("How many value do you wish to enter : ");
		int num = scan.nextInt();
		System.out.println("Please enter values: ");
		int[] a  = new int[num];
		for(int i=0;i<num;i++)
		{
			System.out.println(i+1 + " : " );
			a[i] = scan.nextInt();
		}
		missing(n,m,a);
	}
	
	public static void missing(int a, int b, int[] arr)
	{
		int count = a;
		int c;
		while(count<=b)
		{
			c=0;
			for(int i = 0; i<arr.length;i++)
			{
				/*int c=0;
			
				//wrong code
				for(int j = a;j<=arr[i];j++)
				{
					if(j!=arr[i])
					{
						System.out.println(j);
					}
				}
			 */
				if(arr[i]==count)
				{
					c++;
				}
			}
			if(c==0)
			{
				System.out.println(count);
			}
			count++;
		}
		
	}
	
}
