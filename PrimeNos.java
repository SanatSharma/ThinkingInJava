//Write a program that uses two nested for loops and the modulus operator (%) to detect and print prime numbers 
//(integral numbers that are not evenly divisible by any other numbers except for themselves and 1)
import java.util.*; 
public class PrimeNos
{
	public static void main(String[] args) 
	{
		int a; int n; int count=0;
		Scanner s = new Scanner(System.in);
		System.out.println("enter no to be checked : ");
		a= s.nextInt();
		n=a/2;
		for(int i=1; i<=n;i++)
		{
			if(i!=1)
			{
				if(a%i==0)
				{
					count++;
				}
			}
		}
		if(count==0)
		{
			System.out.println("No entered is a prime number!");
		}
		else
		{
			System.out.println("Number entered is not a prime no!");
		}

	}

}
