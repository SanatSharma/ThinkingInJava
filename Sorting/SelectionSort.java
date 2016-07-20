package Sorting;
import java.util.*;
public class SelectionSort 
{
	
	public static void main(String[] args) 
	{
		Scanner scan  =new Scanner(System.in);
		System.out.println("Enter a limit: ");
		int n = scan.nextInt();
		System.out.print("Enter " + n + " values: ");
		double[] a = new double[n];
		for(int i=0;i<n;i++)
		{
			a[i] = scan.nextDouble();
		}
		
		selectionSort(a);
		System.out.println("Array after sorting : ");
		System.out.print(Arrays.toString(a));
	}
	
	//Sorts array using selection sort
	public static void selectionSort(double[] arr)
	{
		final int LIMIT = arr.length;
		
		for(int i=0;i<LIMIT;i++)
		{
			int indexMin =i;
			for( int j= i+1;j<LIMIT;j++)
			{
				if(arr[j]<arr[indexMin])
					indexMin = j;
			}
			
			double temp = arr[i];
			arr[i] = arr[indexMin];
			arr[indexMin] = temp;
		}
	}

}
