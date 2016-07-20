package CompetitiveCoding;
/*CS students often talk about which courses at UT are the most difficult.

You decide to settle this debate once and for all. You decide to send out a survey to all of the CS students asking how many hours they spent on each course they took.

Once you have this survey data, you decide the difficulty of a course is the average numbers of hours spent on it, plus the difficulty of all of its prereqs.

Given these numbers, what is the most difficult CS course at UT? There is guaranteed to be a unique one.

Input

The first line contains an integer c (1 ≤ c ≤ 10) - the number of test cases to follow.
Each test case will be structured as:
A line containing a single integer n (1 ≤ n ≤ 10000), the number of classes in the course catalog.
n courses follow, where the first line of each is described below:
name time numps
Where name is the name of the course (guaranteed to be a unique string of up to 10 alphanumeric characters), time is the integer number of hours the average student spent on the course, and numps (0 ≤ numps < n) is the number of prereqs the course has.
If numps > 0, the course will have a second line containing numps prereqs, each which is a name of a different course in the catalog. There are no duplicates among prereqs for a single course, and there are no circular prereqs.

Output

For each test case, print the name of the most difficult course in CS, followed by the difficulty of said course. The difficulty of the course will fit in a 64 bit integer.

Sample Input

2
2
CS314 15 1
CS312
CS312 10 0
4
CS439 100 2
CS429 CS314
CS429 50 1
CS312
CS314 20 1
CS312
CS312 10 0
Sample Output

CS314 25
CS439 190
Explanation of sample case:

For the first case, CS312 has a difficulty of 10 and CS314 has a difficulty of 25, so CS314 is the most difficult.

For the second case, CS312 has 10, CS 314 has 30, CS 429 has 60, and CS439 has 190, so CS439 is the most difficult.
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Difficulty 
{

	// parsing file input to obtain the values and then sorting them using the Comparable object
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int cases = Integer.parseInt(input.nextLine());
		for(int i = 0; i < cases; i++) 
		{
			int num = Integer.parseInt(input.nextLine());
			ArrayList<DiffLevel> diff = new ArrayList<DiffLevel>();
			for(int k = 0; k < num; k++) 
			{
				System.out.println("Im here");
				String[] in = input.nextLine().split(" ");
				String name = in[0];
				System.out.println(Integer.parseInt(in[1]));
				int time = Integer.parseInt(in[1]);
				int preReq = Integer.parseInt(in[2]);
				
				System.out.println(name + " " + time + " " + preReq);
				/*for(int j = 0; j < numP; j++) 
				{
					time += Integer.parseInt(in[j+2]);
				}
				*/
				diff.add(new DiffLevel(preReq, time, name));
			}
			Collections.sort(diff);
			
				System.out.println(diff.get(0).name);
		}
	}
}

class DiffLevel implements Comparable<DiffLevel> 
{
	int preRequisits;
	int totalTime;
	String name;
	
	public DiffLevel(int preReq, int time, String name) 
	{
		preRequisits = preReq;
		totalTime = time;
		this.name = name;
	}
	
	public int compareTo(DiffLevel d) 
	{
		if(preRequisits != d.preRequisits)
			return d.preRequisits - preRequisits;
		if(totalTime != d.totalTime)
			return totalTime - d.totalTime;
		return name.toLowerCase().compareTo(d.name.toLowerCase());
	}
}
