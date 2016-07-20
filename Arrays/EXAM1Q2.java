package Arrays;

import java.util.Arrays;

public class EXAM1Q2 
{
	public static void main(String[] agrs)
	{
		int[] a = {1,2,4,5,6};
		int[] b = {12,11,23};
		System.out.println(Arrays.toString(addLists(a,b,1,3)));
	}
	
	public static int[] addLists(int[] a, int[] b, int start, int stop)
	{
		int[] newArr = new int[(stop- start)*2];
		int index =0;
		for(int i= start; i<stop;i++)
		{
			newArr[index] = a[i];
			index++;
		}
		for(int i= start; i<stop;i++)
		{
			newArr[index] = b[i];
			index++;
		}
		
		return newArr;
	}
}

