package recursion;

public class GreatestCommonDivisor 
{
	public static void main(String[] a)
	{
		System.out.println("GCD of numbers 6 and 12 is :\nnon recursively: " + gcd(6,12) + "\nrecursively: " + recGCD(6,12));
		System.out.println("GCD of numbers 5 and 12 is :\nnon recursively: " + gcd(5,12) + "\nrecursively: " + recGCD(5,12));
		System.out.println("GCD of numbers 1 and 1 is :\nnon recursively: " + gcd(1,1) + "\nrecursively: " + recGCD(1,1));
		System.out.println("GCD of numbers 15 and 12 is :\nnon recursively: " + gcd(15,12) + "\nrecursively: " + recGCD(15,12));
	
	}

	//find GCD non-recursively
	public static int gcd(int a, int b)
	{
		int max=0;
		int n = Math.min(a,b);
		if(b%a==0 || a%b==0)
			return n;
		else
		{
			for(int i=1;i<=n/2;i++)
			{
				if(a%i==0&&b%i==0)
					if(max<i)
						max=i;
			}
		}		
		return max;
	}
	
	//find GCD recursively
	public static int recGCD(int a, int b)
	{
		int rem = a%b;
		if(rem==0)
			return b;
		
		return recGCD(b, rem);
	}
}
