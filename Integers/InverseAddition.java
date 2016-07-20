package Integers;
/*Write a method named sumTo that takes an integer parameter n and
returns the sum 1 + 1/2 +1/3 + ... +1/n
.
For example, sumTo(2) should return the value 1.5 (1 + 1/2). If sumTo is passed the
value 0, it should return 0.0 as its result. You may assume that sumTo is never passed
a negative value.
*/
import java.util.Scanner;
public class InverseAddition 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a num : ");
		int num = scan.nextInt();
		System.out.println("Sum after inversing eery subsequent digit after 1 till " + num + " is " + sumTo(num));
	}
	
	public static double sumTo(int num)
	{
		double sum=0;
		for(int i=1;i<=num;i++)
		{
			sum+= Math.pow(i, -1);
		}
		return sum;
	}

}
