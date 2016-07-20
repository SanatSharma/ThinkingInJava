package Integers;
/*Write a static method sumThem() that takes 2 integers m and n as its arguments, and
returns the sum of the integers between m and n (inclusive).
Sample Results:
sumThem(2, 5) will return 14
sumThem(5, 2) will return 14
sumThem(3, -1) will return 5
sumThem(1, 4) will return 10
*/
import java.util.Scanner;
public class AdditionInBetween 
{
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.println("Enter 2 integers : ");
		int a = scan.nextInt(); int b= scan.nextInt();
		System.out.println(sumThem(a,b));
	}
	
	public static int sumThem(int a , int b)
	{
		int sum =0;
		if(a>b)
		{
			int temp = a;
			a=b;
			b=temp;
		}
		for(int i=a;i<=b;i++)
		{
			sum+=i;
		}
		return sum;
	}
}
