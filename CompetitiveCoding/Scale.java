package CompetitiveCoding;
import java.util.Arrays;
import java.util.Scanner;

/*Osiris tells Heket that she can evaluate the souls in any order that she wants, but she must minimize the number of souls that become impatient. What is the maximum number of souls Heket can prevent from becoming impatient?

Input:
The first line will contain a single integer T, the number of test cases.

T pairs of lines follow. The first line of each pair contains a single integer S, the number of souls in the pile. The next line contains S integers, each representing the patience of one soul in the pile.

Output:
Print out a single integer representing the maximum number of souls Heket can prevent from becoming impatient. 
Constraints

0 < T <= 10
0 < S <= 10000
All souls will have patience of at least 1 and at most 1 billion. 
Sample Input

1
5
1 3 13 2 8
Sample Output

4
*/
public class Scale 
{
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args)
	{
		int tests = scan.nextInt();
		for(int i=0;i<tests;i++)
		{
			int cases = scan.nextInt();
			scan.nextLine();
			String s = scan.nextLine();
			String[] ss = s.split(" ");
			int[] times = new int[ss.length];
			for(int j=0;j<times.length;j++)
				times[j] = Integer.parseInt(ss[j]);

			Arrays.sort(times);
			int count=0;
			int sum = times[0];
		 	for(int j=1;j<times.length;j++)
		 	{
		 		int seek =0;
		 		int pos = 0;
		 		for(int l = j;l<times.length;l++)
		 		{
		 			if(sum<=times[l])
		 			{
		 				seek++;
		 				pos = l;
		 				break;
		 			}
		 		}
		 		if(seek>0)
		 		{
		 			count++;
		 			sum += times[pos];
		 		}
		 		System.out.println(sum);
		 	}
		 	System.out.println(count+1);
		}
	}
	

}
