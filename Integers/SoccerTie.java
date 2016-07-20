package Integers;
/*Write a method named soccerWinner that determines which soccer team wins a two-legged tie.
 A two-legged tie is commonly used in soccer tournaments, although not the World Cup.
The two-legged tie consist of two games between teams A and B.
The first game (or leg) is played at team A's home stadium and the second game (or leg) is played at team B's home stadium.
The winner of the two-legged tie is based on aggregate goals, the total number of goals scored in the two games.
Consider the following example:
 First leg at Team A's home stadium: Team A 4 – 1 Team B
 Second leg at Team B's home stadium: Team B 2–1 Team A
The aggregate score is Team A 5 - 3 Team B, so Team A wins the two-legged tie.
If there is a tie in aggregate score the first tiebreak is based on away goals. In other words if the aggregate score is tied the team that scored more goals away from their home stadium is the winner.
Consider the following example
 First leg at Team A's home stadium: Team A 4 – 2 Team B (Team B scored 2 away goals)
 Second leg at Team B's home stadium: Team B 2 – 0 Team A (Team A scored 0 away goals)
The aggregate score is tied at Team A 4 - 4 Team B, but the away goals are Team A 0 - 2 Team B so Team B wins the two-legged tie.
If there is still a tie after considering away goals then the teams complete a shootout with penalty kicks and whichever team scores more penalty kicks wins.
Your method shall accept 4 parameters: Team A's number of goals at home, Team A's number of goals away, Team B's number of goals at home, and Team B's number of goals away.
Based on these parameters if there is a winner the method prints out the winner.
If the there is still a tie the method asks the user for the number of penalty kicks Team A and Team B scored and prints out the winner based on that information.
Examples of output for the soccerWinner method are shown below
parameters are Team A home goals, Team A away goals, Team B home goals, Team B away goals
soccerWinner(4, 1, 2, 1) -> Team A wins
soccerWinner(4, 0, 2, 2) -> Team B wins
The user input is italicized below:
soccerWinner(2, 1, 2, 1) ->
Shootout
Enter Team A penalty kicks: 3
Enter Team B penalty kicks: 4
Team B wins
CS 312 – Midterm 1 – Fall 2014 13
Assume the Scanner class has already been imported to the program.
You may assume the user will enter valid input for the penalty kicks if necessary. In other words the user will enter integer values greater than or equal to 0 and the two values will not be equal to each other.
*/
import java.util.*;
public class SoccerTie 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Team A home goals: ");
		int teamAHome = scan.nextInt();
		System.out.println("Enter Team A away goals : ");
		int teamAAway = scan.nextInt();
		System.out.println("Enter Team B home goals : ");
		int teamBHome = scan.nextInt();
		System.out.println("Enter Team B away goals : ");
		int teamBAway = scan.nextInt();
		
		soccerWinner(teamAHome,teamAAway, teamBHome, teamBAway);
	}

	public static void soccerWinner(int teamAHome,int teamAAway, int teamBHome,int teamBAway)
	{
		Scanner scan = new Scanner(System.in);
		int sumA = teamAHome + teamAAway;
		int sumB = teamBHome + teamBAway;
		if(sumA>sumB)
		{
			System.out.println("Team A is victorius");
		}
		else if(sumB>sumA)
		{
			System.out.println("Team B is victorius");
		}
		else
		{
			if(teamAAway>teamBAway)
			{
				System.out.println("Team A is victorious");
			}
			else if (teamAAway<teamBAway)
			
			{
				System.out.println("Team B is victorious");
			}
			else
			{
				System.out.println("Team A penalites: ");
				int penA = scan.nextInt();
				System.out.println("Team B penalities: ");
				int penB = scan.nextInt();
				if(penA>penB)
				{
					System.out.println("Team A victorious");
				}
				else
				{
					System.out.println("Team B victorious ");
				}
			}
		}
	}
}
