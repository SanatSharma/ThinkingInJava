import java.util.*;
public class ArraysWithRadomize 
{
	public static void main(String[] args)
	{
		Random rand = new Random();
		int[] a = new int[rand.nextInt(100)];
		int c= a.length;
		for(int i=0; i<c;i++)
		{
			a[i]= rand.nextInt(30);
		}
		System.out.println("Length of array is : " + c);
		System.out.print("the array is as follows : ");
		for(int i=0;i<c;i++)
		{
			System.out.println(a[i]);
		}
	}		
}
