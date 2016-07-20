package Sorting;

public class MergeSort2 
{
	public static void main(String[] args) 
	{
		int[] inputArr = {45,23,11,89,77,98,4,28,65,43};
		MergeSort2.sort(inputArr);
		for(int i:inputArr)
		{
			System.out.print(i + " ");
		}
	}
	public static void sort(int[] a) 
	{
		int[] from = a;
		int[] to = new int[a.length];
		for (int blockSize=1; blockSize<a.length; blockSize*=2) {
			for (int start=0; start<a.length; start+=2*blockSize)
				mergeWithoutCopy(from, to, start, start+blockSize, start+2*blockSize);
			int[] temp = from;
			from = to;
			to = temp;
		}
		if (a != from)
			// copy back
			for (int k = 0; k < a.length; k++)
				a[k] = from[k];
	}

	private static void mergeWithoutCopy(int[] from, int[] to, int lo, int mid, int hi) 
	{
		// DK: cannot just return if mid >= a.length, but must still copy remaining elements!
		// DK: add two tests to first verify "mid" and "hi" are in range
		if (mid > from.length) 
		{
			mid = from.length;
		}
		if (hi > from.length) 
		{
			hi = from.length;
		}
	
		int i = lo, j = mid;
		
		for (int k = lo; k < hi; k++) 
		{
			if(i == mid)
				to[k] = from[j++];
			
			else if (j == hi)        
				to[k] = from[i++];
			
			else if (from[j] < from[i])
				to[k] = from[j++];
			
			else
				to[k] = from[i++];
		}
		// DO NOT copy back
		// for (int k = lo; k < hi; k++)
		//   a[k] = aux[k];
	}
}