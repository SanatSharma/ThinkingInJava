package CompetitiveCoding;

import java.util.ArrayList;
import java.util.Scanner;

/*Buhnubis will give you a list of N integers where each integer represents the amount of money that person i has initially. Your task is to take this list and perform the sequence of operations that Buhnubis gives you. 

These operations include: ADD, MULTIPLY, GET and BUHNUBIS. For the GET operation, you will print the total amount of money contained by the range of people given (range is [i,j] inclusive). For ADD and MULTIPLY operations, you will add or multiply person i's amount of money by the amount specified. For the BUHNUBIS operation, you will output the current amount of money that BUHNUBIS has, assuming he started at amount 0, collected money he took from others and lost money that he gave to others.

The first line will contain a positive integer T - the number of test cases. The first line in each test case will contain two integers, N and M, where N represents the number of people and M represents the number of operations to be performed. The next line will contain N space-separated integers, where each integer represents the amount of money that person i owns. Following this line will be M lines, where each contains an operation name ("ADD", "MULTIPLY", "GET" and "BUHNUBIS"). The format for these operations is as follows:
ADD <index of person> <amount>
.... same for MULTIPLY
GET <start index> <end index>
BUHNUBIS

Whenever there is a "GET" operation, output the amount of money shared by person(s) i through j. Whenever there is a "BUHNUBIS" operation, output the current amount of money that Buhnubis has. There will not be required output in any other situation. The output will be bounded by a 64-bit signed integer.


Please do not try this problem in Python - Hackerrank bounds the Python time limit at 10 seconds, which is a time limit we cannot guarantee for this problem.
Constraints

1 <= T <= 10
1 <= N <= 150000
1 <= M <= 10000
Multiplication range: -2 -> 2
Add range: -20 -> 20
Sample Input

2
4 2
1 2 3 4
ADD 1 4
GET 1 3
5 4
5 4 3 2 1
MULTIPLY 0 -2
GET 4 4
GET 0 4
BUHNUBIS

Sample Output

13
1
0
15
Explanation

In the first test case, you add 4 to person 1, who now has an amount of 6(0 based indexing) and then output the sum between index 1 and 3 inclusive, which is 13.
 
 In the second test case, you multiply person 0's amount by -2 (resulting in a -15 for that person and a +15 for Buhnubis), and then output the amount for person 4, the sum between person 0 and person 4, and the amount of money Buhnubis currently has which is 10.
 */
public class Buhnubis 
{
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args)
	{
		int cases = scan.nextInt();
		scan.nextLine();
		for(int i=0;i<cases;i++)
		{
			ArrayList<Integer> a = new ArrayList<Integer>();
			String[] s = scan.nextLine().split(" ");
			int ops = Integer.parseInt(s[1]);
			String[] ints = scan.nextLine().split(" ");
			for(String w : ints)
				a.add(Integer.parseInt(w));
			//System.out.println(a);
			int buhnCount = 0;
			for(int j=0;j<ops;j++)
			{
				String[] line = scan.nextLine().split(" ");
				if(line[0].equals("ADD"))
				{
					int pos = Integer.parseInt(line[1]); int toAdd = Integer.parseInt(line[2]);
					//System.out.println(a.get(Integer.parseInt(line[1])));
					a.set(pos, a.get(pos) + toAdd);
					buhnCount -= toAdd;
				}
				if(line[0].equals("MULTIPLY"))
				{
					int pos = Integer.parseInt(line[1]); int toMultiply = Integer.parseInt(line[2]);
					int temp = a.get(pos);
					a.set(pos, a.get(pos)*toMultiply);
					buhnCount += temp - a.get(pos);
				}
				if(line[0].equals("GET"))
				{
					int start = Integer.parseInt(line[1]); int stop = Integer.parseInt(line[2]);
					int sum =0;
					for(int k=start;k<=stop;k++)
						sum+=a.get(k);
					System.out.println(new StringBuilder().append(sum).toString());
				}
				if(line[0].equals("BUHNUBIS"))
					System.out.println(new StringBuilder().append(buhnCount).toString());			
					
			}
		}
	}
}

