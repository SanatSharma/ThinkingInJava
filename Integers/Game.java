package Integers;

import java.util.Scanner;

/*Your bag has n_1 screws, and your robot's bag has n_2 screws. On your turn, you can remove between 1 and k_1 screws, and on the robot's turn, it can remove between 1 and k_2 screws (all bounds are inclusive). The first player who cannot make a move loses.

Given n_1, n_2, k_1, k_2 can you figure out who will win given you and your robot both play optimally? It's a little troubling if your robot wins, as this game is an indicator that skynet will soon be a reality.

Input

The first line of input contains the number of test cases. Each test case consists of a line containing the four integers n_1, n_2, k_1, k_2.

Output

For each test case output in a line each: "I will win" if you can guarantee your victory and "I am screwed" otherwise.

Sample Input

2
2 2 1 2
2 1 1 1
Sample Output

I am screwed
I will win
*/
public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int i=0;i<n;i++)
		{
			int n1 = scan.nextInt();
			int n2 = scan.nextInt();			int k1 = scan.nextInt();			int k2 = scan.nextInt();
			Boolean c = screwed(n1,n2,k1,k2);
			if(!c)
				System.out.println("I am screwed");	
			else
				System.out.println("I will win");

		}

	}
	public static Boolean screwed(int n1,int n2, int k1, int k2)
	{
		while(n1>=0)
		{
			n1--;			
			if(n2<0)
			{
				return true;
			}
			n2--;
		}
		return false;
	}
}
