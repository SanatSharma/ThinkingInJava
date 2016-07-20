package CompetitiveCoding;

import java.util.Scanner;
/*Time Limit: 2 seconds

Memory Limit: 256MB

You're bored during number theory class while your teacher is talking about prime numbers, so you decide to count up all of the prime numbers that are even, going up to some number n (inclusive). If you were listening to your teacher, you would know that a number x is prime if its only two factors are x and 1 where x ≠ 1, and a number is even if, when divided by 2, it has a remainder of 0.

Input

The first line contains an integer c (1 ≤ c ≤ 5) - the number of test cases to follow.
Each test case consists of a single integer n, which is the limit you are counting to.

Output

For each test case, print out the number of even primes that are ≤ n (n ≤ 1000).

Sample Input

2
1
3
Sample Output

0
1
Explanation of sample case:

In the first case, the only possibilities are 0 and 1. 0 is not prime, and neither is 1, and it is also not even. Therefore, there are 0.

In the second case, we also consider 2 and 3. Both 2 and 3 are prime, but 3 is not even, so the answer is 1.
*/

public class EvenPrimes 
{
	public static void main(String[] args) 
	{
		int a; 
		Scanner s = new Scanner(System.in);
		a= s.nextInt();
		for(int i=0;i<a;i++)
		{
			int n; int count=0;
			int b = s.nextInt();
			n=b/2;
			for(int j=1; j<b;j++)
			{
					Boolean check = prime(j);
					if(check ==true)
					{
						if(j%2==0)
						{
							count++;
						}
					}
			}
			System.out.println(count);
		
		}
	}
	
	public static Boolean prime(int a)
	{
		
			int n; int count=0;
			Scanner s = new Scanner(System.in);
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
				return true;
			}
			else
			{
				return false;
			}
	}
}
