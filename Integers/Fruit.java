package Integers;
/*Fruit

Time Limit: 1 second

Memory Limit: 64 MB

You come home from class one day and find that someone has left you several crates of fruit! You call the food pantry to inquire about donating it, but they need to know exactly how much of each fruit you have.

Luckily, all of the crates are labeled with the name of the fruit and the amount inside the crate. How much of each fruit do you have?

Input

The first line contains a positive integer T - the number of different kinds of fruit you have. T will be at most 10.

The next T lines contain a single word representing the name of the fruit, an integer N that is the number of crates, and an integer M that is the amount of fruit in each crate. 0 < N < 10 and 0 < M < 1000.

Output

For each kind of fruit print the name of the fruit followed by a space and the total amount of that fruit.

Sample Input

3
ORANGE 3 5
APPLE 2 4
GRAPE 1 7
Sample Output

ORANGE 15
APPLE 8
GRAPE 7
*/
import java.util.*;
public class Fruit 
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		for(int i=0;i<n;i++)
		{
			int a,b;
			String ch;
			ch= scan.next();
			a=scan.nextInt();
			b=scan.nextInt();
			int prod= a*b;
			System.out.println(ch + " " + prod);
		}
	}

}
