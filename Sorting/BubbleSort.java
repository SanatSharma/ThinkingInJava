package Sorting;
import java.util.*;
public class BubbleSort
{
	//874 180 338 767 391 560 769 397 46 147 468 428 46 873 716 491 811 876 279 545 602 961 123 259 250 431 531 637 114
	static Scanner scan = new Scanner(System.in);
	static Random rand = new Random();
	public static void main(String[] args)
	{
		
		List<Integer> li = new ArrayList<Integer>(Arrays.asList(874,180,338,767,391,560,769,397,46,147,468,428,46,873,716,491,811,876,279,545,602,961,123,259,250,431,531,637,114));
		int[] a = new int[]{874,180,338,767,391,560,769,397,46,147,468,428,46,873,716,491,811,876,279,545,602,961,123,259,250,431,531,637,114};
		bubbleSortUsingLists(li);
		bubbleSortUsingArrays(a);
	}
	public static void bubbleSortUsingLists(List<Integer> li)
	{
		boolean swapped = true;
		int c=0;
		while (swapped) 
		{
			swapped = false;
			for (int i = 0; i < li.size()-1; i++)
			{   
				if (li.get(i)>li.get(i+1)) 
				{                    
                      int temp = li.get(i);
                      li.set(i,li.get(i + 1));
                      li.set(i+1, temp);
                      swapped = true;
                      c++;
				}
			}
		}
		System.out.println("Number of swaps: " + c);
		System.out.println(li.toString());
	}
	
	public static void bubbleSortUsingArrays(int[] arr)
	{
		Boolean swapped = true;
		
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp =arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		System.out.println();
		System.out.println(Arrays.toString(arr));
	}
}
