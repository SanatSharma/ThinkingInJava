package CompetitiveCoding;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*The game is played by constantly swapping cups, given Seth's orders on which cups to swap; however, there's an additional catch: Seth is also allowed to call REVERSE. In the REVERSE situation, the order of the cups will be reversed. 

Given the initial ordering of the cups, the starting position of the cup with the key (0 based indexing) and the list of SWAP and REVERSE commands, can you determine which cup ends up with the key to endless wealth?

The first line will contain an integer T - the number of test cases. Each test case will begin with a line containing 3 integers, N M and K. N represents the number of cups, M represents the number of commands that will be given, and K represents the starting position of the cup with the key under it. Following this line will be M lines, where each line either contains the command "SWAP <i> <j>" where <i> and <j> denote the indices to swap, or "REVERSE" in which all cups will be reversed.

For each test case, output the index of the cup with the key under it at the end of the game.
Constraints

1 <= T <= 10
1 <= N <= 1000
1 <= M <= 100
0 <= i,j <= N-1
Sample Input

2
4 3 0
SWAP 0 1
SWAP 2 1
REVERSE
4 2 3
SWAP 0 0
SWAP 3 2
Sample Output

1
2
*/
public class Game {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args)
	{
		int cases = scan.nextInt();
		scan.nextLine();
		for(int i=0;i<cases;i++)
		{
			String[] a = scan.nextLine().split(" ");
			//System.out.println(Arrays.toString(a));
			
			int cups = Integer.parseInt(a[0]);
			int com = Integer.parseInt(a[1]);
			int pos = Integer.parseInt(a[2]);
			ArrayList<Integer> l = new ArrayList<Integer>();
			for(int k=0;k<cups;k++)
				l.add(k,0);
			l.set(pos, 5);
			for(int j=0;j<com;j++)
			{
				String[] line = scan.nextLine().split(" ");
				String word = line[0];
				if(word.equals("SWAP"))
				{
					Collections.swap(l, Integer.parseInt(line[1]), Integer.parseInt(line[2]));
				}
				if(word.equals("REVERSE"))
				{
					Collections.reverse(l);
				}
			}
			pos = l.indexOf(5);
			System.out.println(pos);
		}
			
	}

}
