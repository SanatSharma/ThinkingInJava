//A Fibonacci sequence is the sequence of numbers 1, 1, 2, 3, 5, 8, 13, 21, 34, and so on, where each number
//(from the third on) is the sum of the previous two. 
//Create a method that takes an integer as an argument and displays that many Fibonacci numbers starting from the beginning, 
//e.g., If you run java Fibonacci 5 (where Fibonacci is the name of the class) the output will be: 1, 1, 2, 3, 5.
import java.util.*;
public class FibonacciSequence 
{
	public static void main(String[] args)
	{
		int n;
		Scanner a= new Scanner(System.in);
		System.out.println("enter a limit : ");
		n= a.nextInt();
		fibonacci(n);
	}
	
	private static void fibonacci(int j)
	{
		int i,sum, prev=1,next=1;
		for(i=0;i<j;i++)
		{	
			//printing the sequence
			System.out.print(prev +  " ");
			sum= prev + next; //calculating the next no
			prev=next;
			next= sum;			
		}
		System.out.println();
	}
}
