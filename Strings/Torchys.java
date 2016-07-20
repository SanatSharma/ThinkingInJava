package Strings;
/*Torchy's

Time Limit: 1 second

Memory Limit: 64 MB

Jaime goes to Torchy’s Tacos very frequently to get food. Often times, Jaime will go with a set of friends to keep from being lonely; however, Jaime’s friends don’t like splitting the bill when it doesn’t divide evenly amongst them, to which they make Jaime pay the full tab.

Jaime wants to know if he is going to end up paying for everyone’s food and has asked you to figure that out, so he gives you the list of friends he has taken to Torchy’s and the exact amount that will be paid at the restaurant by him and all of his friends. Can you help him?

Input

The first line contains a positive integer T - the number of test cases. T will be at most 10.

Each test case will contain two positive integers, U - the number of friends Jaime has brought to Torchy’s, and V - the amount that will be paid for all of the food. U will be at least 1 and at most 20. V will be between 0 and 1000 inclusively.

The next U lines will contain the names of all of Jaime’s friends that he has brought to Torchy’s.

Output

Print out “NO” if Jaime will end up paying for Torchy’s or “YES” if the bill will split evenly amongst him and his friends.

Sample Input

2
5 12
CAMERON
JON
CHRIS
MATT
VICTORIA
2 4
JON
CHRIS	
Sample Output

YES
NO
*/
import java.util.*;
public class Torchys 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int i=0;i<n;i++)
		{
			int no= scan.nextInt();
			int total= scan.nextInt();
			String[] ch = new String[no];
			for(int j=0;j<no;j++)
			{
				 ch[j] = scan.next();
			}
			
			if(total%(no+1)==0)
			{
				System.out.println("YES");
			}
			else
			{
				System.out.println("NO");
			}
		}
	}
}
