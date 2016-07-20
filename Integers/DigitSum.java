package Integers;
import java.util.Scanner;
public class DigitSum 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = scan.nextInt();
		System.out.println("Sum of digits of the number entered is " + digitSum(num));
	}

	public static int digitSum(int num)
	{
		int sum=0;
		while(num>0)
		{
			sum+=num%10;
			num/=10;
		}
		return sum;
	}
}
