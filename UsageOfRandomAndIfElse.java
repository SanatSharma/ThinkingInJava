//Write a program that generates 25 random int values.
//For each value, use an if-else statement to classify it as greater than, less than, or equal to a second randomly generated value.
import java.util.*;
public class UsageOfRandomAndIfElse 
{
	public static void main(String[] args) 
	{
		int i;
		int[] a= new int[10];
		Random rand= new Random();
		for(i=0;i<5;i++)
		{
			a[i]= rand.nextInt();
		}
		for(i=0;i<5;i++)
		{
			System.out.println("nos added : "+ a[i]);
		}
		for(i=0;i<5;i++)
		{
			if(a[i]>a[i+1])
			{
				System.out.println(i + "is greater than " + (i+1));
			}
			else if(a[i]==a[i+1])
			{
				System.out.println(i + "is equal to " + (i+1));
			}
			else
			{
				System.out.println(i + "is less than " + (i+1));
			}
		}
	}

}
