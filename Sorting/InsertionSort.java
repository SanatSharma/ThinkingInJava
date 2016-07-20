package Sorting;

import java.util.Arrays;

public class InsertionSort 
{
	public static void main(String[] args) 
	{
		System.out.println(Arrays.toString(insertionSort(new int[]{1,34,1,2,54,23})));
	}
	
	public static int[] insertionSort(int[] a)
	{  
		int key,j;
		for(int i=1;i<a.length;i++)
		{
			key = a[i];  j=i-1;
			while(j>=0 && a[j]>key)
			{
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = key;
		}
		return a;
	}

}
