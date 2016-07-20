package CompetitiveCoding;
/*You're still bored in number theory class, and after not paying attention and mishearing the teacher, you thought you heard her say something about special numbers that aren't prime. Not knowing what these could be, you decide that a number x is a "special number" if its only factors are 1, x, and two different prime numbers. You then decide to count how many positive special numbers there are, up to some number n.

Input

The first line contains an integer c (1 ≤ c ≤ 10) - the number of test cases to follow.
Each test case consists of a single integer n (n ≤ 1000), which is the limit you are counting to.

Output

For each test case, print out the number of special numbers that are ≤ n (n ≤ 1000).

Sample Input

1
12
Sample Output

2
Explanation of sample case:

In the first case, we must consider numbers 0 - 12. 0 is not a special number, and neither is 1. 2 is not because it is prime, and neither is 3, because 3 is prime. 4's factors are 1, 2, and 4, so it is not a special number. 5 is prime so it is not a special number. 6's factors are 1, 2, 3 and 6, so it is a special number. 7 is not because it is prime, 8's factors are 1, 2, 4, and 8, so it is not a special number because 4 is not prime. 9 is not a special number because its factors are 1, 3 and 9. 10 is a special number because its factors are 1, 2, 5, and 10. 11 is not a special number because it is prime, and 12 is not a special number because it has more than 4 factors (1, 2, 3, 4, 6, and 12). Therefore the answer is 2
*/
import java.util.*;
public class SpecialNumbers 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		for(int i=1;i<=a;i++)
		{
			int numSpecial=0;
			
			int b = scan.nextInt();
			for(int k=1;k<=b;k++)
			{	
				int count=0;
				int factors = 0;
				for(int j=2;j<=k/2;j++)	
				{
					if(k%j==0)
					{
						factors++;
						Boolean check = prime(j);
						if(check ==true)
						{
							count++;
						}
					}
				}
				if(count==2 && factors<=3)
					numSpecial++;
			}
			System.out.println(numSpecial);
		}
	}
	
	public static Boolean prime(int a)
	{
		int n; int count=0;
		Scanner s = new Scanner(System.in);
		n=a/2;
		for(int i=2; i<=n;i++)
		{
			if(a%i==0)
			{
				count++;
			}	
		}
		if(count==0 && a!=1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
