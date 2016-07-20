

import java.util.Arrays;
import java.util.Scanner;
/*
 * Unfortunately the people who worked with the power grid have all turned to zombies and fixing the situation has been left to you. The only command that you know is in the format [R/C] [integer]. If the first argument is R, the command flips the status of all cells in all rows for which the row number modulus the integer equals zero, turning cells that were on off and cells that were off on. If the first argument is C, it does the same thing but with the columns.

Given a starting grid and a sequence of commands, print out the end result of all of the operations.

Input

The first line will contain a single integer T, the number of test cases.

T test cases follow. Each test case begins with a line containing three integers, R, C, and O. R represents the number of rows in the grid, C represents the number of columns, and O represents the number of commands.

R lines follow, containing C characters each. Every character will be a 1 or a 0.

O commands follow. The first character of each command will be either R or C. This character is followed by a space and an integer M, explained above.

Output

Print out the resulting power grid after all operations have been completed.

Constraints

1 <= T <= 10
1 <= R, C, M, O <= 100
Sample Input

1
3 3 3
010
100
111
R 2
C 4
C 1
Sample Output

110
111
011
Explanation

Originally:
010
100
111

Flip rows 0 and 2:
101
100
000

Flip column 0:
001
000
100

Flip columns 0, 1, and 2:
110
111
011
*/

public class PowerGrid {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args)
	{
		int tests = scan.nextInt();
		scan.nextLine();
		for(int i=0;i<tests;i++)
		{
			String[] s = scan.nextLine().split(" ");
			int rows = Integer.parseInt(s[0]);
			int cols = Integer.parseInt(s[1]);
			int com = Integer.parseInt(s[2]);
			
			int[][] d = new int[rows][cols];
			for(int j=0;j<rows;j++)
			{
				int k=0;
					String l =  scan.next();
					for(int m=0;m<l.length();m++)
					{
						d[j][k] = (int)(l.charAt(m)) - 48;
						k++;
					}
			}
			
			scan.nextLine();
			for(int q=0;q<com;q++)
			{
				String[] st = scan.nextLine().split(" ");
				String val = st[0];
				int num = Integer.parseInt(st[1]);
				if(val.equals("R"))
				{
					for(int p = 0; p<d.length;p++)
					{
						if(p%num==0)
						{
							//	System.out.println(p);
								for(int t = 0;t<d[0].length;t++)
								{
									if(d[p][t]==1)
										d[p][t]=0;
									else
										d[p][t] = 1;
								}
							}
	
					}
				}
				else
				{
					for(int p = 0; p<d[0].length;p++)
					{
						if(p%num==0)
						{
							for(int t=0;t<d.length;t++)
							{
								if(d[t][p] ==1)
									d[t][p]=0;
								else
									d[t][p] =1;
							}
						}
					}
				}
			//	System.out.println(Arrays.deepToString(d));
			}
			for(int w=0;w<d.length;w++)
			{
				for(int z=0;z<d[0].length;z++)
					System.out.print(d[w][z]);
				System.out.println();
			}
		}
	}
}
