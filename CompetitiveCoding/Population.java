package CompetitiveCoding;



import java.util.ArrayList;
import java.util.Scanner;

/*The first line of input contains the number of test cases, T. T test cases follow.

The first line of each test case contains two space-separated integers N and D. The second line contains N space-separated integers. The ith one is denoted A_i and is the initial population of the ith county. The next D lines describe the documents you've found. The jth of them contains two space-separated integers C_j and L_j, denoting the county number (1-indexed) for document j and the net change in population described in document j (a negative number is emigration, a positive number is immigration) respectively.

Output

Your program should output T lines, one for each test case. The line for a particular test case should contain N space-separated integers, with the ith being the final population of county i.

Constraints

1 <= T <= 5
1 <= N <= 1000
1 <= D <= 1000
0 <= A_i <= 1000000
1 <= C_j <= N
-40000 <= L_j <= 40000

At no point in time did any county's population become negative.
Sample Input

1
5 3
500 420 40000 75 205
1 5
4 25
2 -350
Sample Output

505 70 40000 100 205
Explanation

The first document says that 5 people moved to county 1, so its new population is 505. The second document says that 25 people moved to county 4, so its new population is 100. The third document says that 350 people left county 2, leaving it with a population of 70.
*/
public class Population 
{
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args)
	{
		int cases = scan.nextInt();
		scan.nextLine();
		for(int i=0;i<cases;i++)
		{
			String[] a = scan.nextLine().split(" ");
			//System.out.println(Arrays.toString(a));		
			int case1 = Integer.parseInt(a[1]);
			
			String[] b = scan.nextLine().split(" ");
			ArrayList<Integer> list = new ArrayList<Integer>();
			for(String s: b)
				list.add(Integer.parseInt(s));
			
			for(int j =0;j<case1;j++)
			{
				String[] line = scan.nextLine().split(" ");
				int num = Integer.parseInt(line[0]);
				int val = Integer.parseInt(line[1]);
				list.set(num-1, list.get(num-1) + val);
				//System.out.println(list);
			}
			System.out.print(list.get(0));
			for(int l = 1; l<list.size();l++)
				System.out.print(" " + list.get(l));
		}
	}
	
	
}
