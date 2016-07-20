package Holding_objects;
/*Scoreboard

Time Limit: 1 second

Memory Limit: 256 MB

You knew there was something wrong with the scoreboard! Someone clearly didn't write the back-end correctly, but let's not point any fingers at Jon... Let's just fix it instead!

Let's assume there are two competitors named A and B. Here's how the ranking system works:

Rule 1: If A solves more problems than B does, then A is ranked higher than B.
Rule 2: If A and B solve the same number of problems, then... Sum all of the times it took for A and B to solve their problems. If A has a smaller sum than B's sum, then A is ranked higher.
Rule 3: If A and B solved the same number of problems and have the same time sum, then... Whoever's name comes first lexicographically wins.

Input

The first line contains a positive integer T, the number of test cases.

For each test case T the first line contains a single integer N, the number of people in the competition. The next N lines contains the competitor's name, the number of problems they solved, K, and K times. A competitor's name will only include uppercase and lowercase letters.

Output

Print out the ranks of each competitor on a new line.

Constraints

1 ≤ T ≤ 10

1 ≤ N ≤ 100

0 ≤ K ≤ 6

Sample Input

2
3
Jaime 3 10 40 60
Veronica 4 8 16 32 64
Cameron 3 10 39 60
2
Daniel 2 100 200
Arnav 2 100 200
Sample Output

1. Veronica
2. Cameron
3. Jaime
1. Arnav
2. Daniel
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import javafx.scene.control.SpinnerValueFactory.IntegerSpinnerValueFactory;

public class Scoreboard 
{

	// parsing file input to obtain the values and then sorting them using the Comparable object
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int cases = Integer.parseInt(input.nextLine());
		for(int i = 0; i < cases; i++) 
		{
			int num = Integer.parseInt(input.nextLine());
			ArrayList<Person> people = new ArrayList<Person>();
			for(int k = 0; k < num; k++) 
			{
				String[] in = input.nextLine().split(" ");
				String name = in[0];
				int numP = Integer.parseInt(in[1]);
				int time = 0;
				for(int j = 0; j < numP; j++) 
				{
					time += Integer.parseInt(in[j+2]);
				}
				people.add(new Person(numP, time, name));
			}
			Collections.sort(people);
			for(int j = 0; j < num; j++) 
			{
				System.out.println((j+1) + ". " + people.get(j).name);
			}
		}
	}
}

class Person implements Comparable<Person> 
{
	int numProblems;
	int totalTime;
	String name;
	
	public Person(int num, int time, String name) 
	{
		numProblems = num;
		totalTime = time;
		this.name = name;
	}
	
	public int compareTo(Person p) 
	{
		if(numProblems != p.numProblems)
			return p.numProblems - numProblems;
		if(totalTime != p.totalTime)
			return totalTime - p.totalTime;
		return name.toLowerCase().compareTo(p.name.toLowerCase());
	}
}

//jaime@cs.utexas.edu