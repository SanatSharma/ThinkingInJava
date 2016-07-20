package Arrays;
import java.util.Random;
import java.util.Scanner;
public class Simulation 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number of dice to roll: ");
		int n = scan.nextInt();
		rollUntilSame(n);
		System.out.print("Enter number between 1 and 12: ");
		int s = scan.nextInt();
		System.out.print("Enter number of occurences: ");
		int o = scan.nextInt();
		doubleDice(s,o);


	}
	
	/*Write a method rollUntilSame. The method has one parameter, int num.
	The method rolls num 6-sided dice per round. The method prints out the results of each round.
	The method repeats rounds of rolling the num 6-sided dice until a round occurs where all num dice have the
	same value. All dice are rerolled every round.
	Here is one sample run with num dice equal to 5. Your method's output must match the format below.
	4 4 5 6 6
	4 5 4 2 5
	1 6 1 5 6
	1 3 6 6 3
	3 3 3 6 6
	4 5 6 5 6
	5 1 6 3 2
	4 4 4 4 4
	Number of rounds before all dice the same: 8
	 */
	public static void rollUntilSame(int n)
	{
		Random rand = new Random();
		int turns=0;
		Boolean check = false;
		while(!check)
		{
			turns++;
			int[] dice = new int[n];
			for(int i=0;i<n;i++)
			{
				dice[i] = rand.nextInt(6)+1;
			}
		
			for(int i=0;i<dice.length;i++)
			{
				System.out.print(dice[i] + " ");
			}
			System.out.println();
			int c=0;
			for(int i=0;i<dice.length-1;i++)
			{
				if(dice[i]==dice[i+1])
				{}
				else
					c++;
			}
			if(c==0)
			{
				check=true;
				System.out.println("Number of rounds before all dice same: " + turns);
	
			}
		}
	}
	
	/*Write a method that simulates rolling two six-sided dice. The method accepts two
	parameters, a target number between 2 and 12, and a required goal, an int greater than 0. The method
	simulates rolling a pair of six sided dice until the number of times the target number has been rolled
	 equals the goal.
	For example if the target number is 7 and the goal is 3, the method "rolls" the dice until 7 has been rolled three
	times. The method returns the total number of times the dice were rolled to achieve the goal.
	Consider this example with a target of 7 and the required number of 7's equal to 3. If the random dice rolls are
	12, 5, 2, 8, 5, 7, 6, 7, 5, 5, 7
	The method would return 11 because it took 11 rolls of the dice to get three 7's.
	Recall how to create an object of type Random:
	*/
	public static void doubleDice(int target, int occurences)
	{
		int o = 0;
		int rolls =0;
		while(o!=occurences)
		{
			rolls++;
			int a=(new Random().nextInt(12) + 1);
			if(target==a)
				o++;
			System.out.print(a + " ");
		}
		System.out.println();
		System.out.println("Number of rolls required to get "+ occurences + " occurences of " + target + " is: " + rolls);
	}
	
}
