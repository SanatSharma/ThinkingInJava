import java.util.*;


public class Factorial 
{

	public static void main(String[] args) 
	{
		double f =1;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter integer number: ");
		double n = in.nextDouble();
		if(n>=0 &&(n==Math.floor(n) && !Double.isInfinite(n)))
		{
			for(double i=1;i<=n;i++)
		
			{
				f = fact(i);
			}
			System.out.println("Factorial of " + n + " is "+ f);
		}
		else
		{
			System.out.println("Number entered is not computable!");
		}
	}
	public static double fact(double j)
	{
		double ans=1;
		for(int i = 1;i<=j;i++)
		{
			ans= ans * i;
		}
		return ans;
	}
}
