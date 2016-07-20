import java.util.Scanner;
/*The density of the disk at a given point is the natural logarithm of the square of the distance from that point to the origin.

Input

The first line contains a single integer T, the number of test cases. T test cases follow.

Each test case contains three positive integers: X, Y, and R, indicating that we have a disk centered at (X, Y) with radius R.

Output

For each test case, output to exactly 6 decimal places the weight of the disk.

Constraints

T <= 100
X, Y, and R are positive integers.
1 <= X, Y <= 100
The origin will be strictly outside the disk.
Sample Input

1
1 1 1
Sample Output

2.177586
*/

public class Disk
{
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args)
	{
		int tests = scan.nextInt();
		scan.nextLine();
		for(int i=0;i<tests;i++)
		{
			String[] s = scan.nextLine().split(" ");
			int	x = Integer.parseInt(s[0]);
			int y = Integer.parseInt(s[1]);
			int r = Integer.parseInt(s[2]);
			double ans = 0;
			double vol = Math.PI * r*r*x;
			double dens = Math.log(x*x + y*y);
			ans = vol*dens;
			
			System.out.format("%.6f", ans);

		}
	}
}

