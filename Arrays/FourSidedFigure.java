/*The output should contain N lines. Each line should contain either the string 
 * "Possible", or "Impossible". The line should say "Possible" if one can form a 
 * non-degenerate convex quadrilateral from the 4 given side lengths.
 *  Otherwise, it should say "Impossible".

Example input

8
26 3 13 9
22 39 3 21
34 38 35 7
14 7 10 19
26 36 20 15
33 16 14 11
1 25 26 31
10 27 5 7
Example output

Impossible
Possible
Possible
Possible
Possible
Possible
Possible
Impossible
*/
package Arrays;
import java.util.*;

public class FourSidedFigure 
{
	static Random rand = new Random();
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.println("Please enter a limit: ");
		int n= scan.nextInt();
		
		int[][] sides = new int[n][4];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<4;j++)
			{
				sides[i][j] = rand.nextInt(100);
			}
		}
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.print(sides[i][j] + " ");
			}
			System.out.println();
		}
		
		fourSideCheck(sides,n);
	}

	public static void fourSideCheck(int[][] arr, int lim)
	{
		for(int i=0;i<lim;i++)
		{
			int max=0,sum=0;
			for(int j=0;j<4;j++)
			{
				if(max<arr[i][j])
				{
					max=arr[i][j];
				}
				sum = sum + arr[i][j];
			}
			sum= sum-max;			
			if(max>=sum)
			{
				System.out.println("Impossible");
			}
			else
			{
				System.out.println("Possible");
			}
		}
	}
}
