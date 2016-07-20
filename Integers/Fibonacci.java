package Integers;
import java.util.*;
public class Fibonacci 
{
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.println("Enter limit: ");
		int n= scan.nextInt();
		fibo(n);
	}
	static void fibo(int n)
	{
		int sum=0, last=1,next=1;
		for(int i =0;i<n;i++)
		{
			System.out.println(last);
			sum = last + next;
			last = next;
			next = sum;
		}
	}

}
