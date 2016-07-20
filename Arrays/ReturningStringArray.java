package Arrays;

//: arrays/IceCream.java
//Returning arrays from methods.
import java.util.*;
public class ReturningStringArray 
{
	private static Random rand = new Random();
	static final String[] FLAVORS = {"Chocolate", "Strawberry", "Vanilla Fudge Swirl",
									 "Mint Chip", "Mocha Almond Fudge", "Rum Raisin",
									 "Praline Cream", "Mud Pie"
									};
	public static String[] flavorSet(int n) 
	{
		if(n > FLAVORS.length)
		{
			throw new IllegalArgumentException("Set too big");
		}
		String[] results = new String[n];
		for(int i = 0; i < n; i++) 
		{
			int t;
			t = rand.nextInt(FLAVORS.length);
			results[i] = FLAVORS[t];
		}
		return results;
	}
	//method to return integer array
	public static int[] fav(int n)
	{
		long counter = 0;
		int[] a = new int[n];
		final long id = counter++;
		for(int i=0;i<n;i++)
		{
			int t = rand.nextInt(FLAVORS.length);
			a[i] = t;
		}
		return a;
		
	}
	public static void main(String[] args) 
	{
		
		for(int i = 0; i < 7; i++)
		{
			System.out.println(Arrays.toString(flavorSet(3)));
			System.out.println(Arrays.toString(fav(3)));
		}
	}
}
/* Output:
[Rum Raisin, Mocha Almond Fudge, Praline Cream]
[5, 1, 0]
[Mud Pie, Mocha Almond Fudge, Mocha Almond Fudge]
[4, 2, 3]
[Mud Pie, Mint Chip, Chocolate]
[0, 7, 0]
[Strawberry, Mint Chip, Chocolate]
[4, 2, 6]
[Praline Cream, Mud Pie, Strawberry]
[0, 7, 1]
[Vanilla Fudge Swirl, Mocha Almond Fudge, Rum Raisin]
[6, 2, 4]
[Rum Raisin, Chocolate, Strawberry]
[6, 1, 0]
*///:~