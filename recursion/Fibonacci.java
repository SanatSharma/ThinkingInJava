package recursion;

import java.util.Scanner;

public class Fibonacci 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter limit: ");
		int n= scan.nextInt();
		if(!(n<0))
		{
			fibonacci(n);
			System.out.println("\nnth element: " + recFib(n));
		}
	}
	//non-recursively
	public static void fibonacci(int n)
	{
		int last=1, next=1, sum=0;
		for(int i=0;i<n;i++)
		{
			System.out.print(last + " ");
			sum = last+next;
			last = next;
			next = sum;
		}
	}
	
	//recursively
	public static int recFib(int n)
	{
		if(n==0)
			return 0;
		else if(n==1)
			return 1;
		return recFib(n-1) + recFib(n-2);
	}
}
