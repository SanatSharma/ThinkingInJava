package CompetitiveCoding;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*Each test case begins with a line containing 2 integers, A and B. A represents the number of bags of candy the store sells. B represents the number of TAs that you have this semester.

The next A lines each contain four space seperated integers C_1 - C_4, representing the number of chocolates, sour candies,
 spicy candies, and hard candies in this particular bag (in that order).

The next B lines contain the following:

A single word N, the name of one of your TAs. Each name begins with a single capital letter which is followed by some number
 of lowercase letters. All names will be distinct.
A single integer L, the minimum number of happiness points needed to bribe this TA.
Four space separated integers P_1 - P_4, representing the number of happiness points this TA gains per piece of chocolate, 
sour candy, spicy candy, and hard candy (in that order)*/
/*
1
3 4
1 1 1 1
1 2 3 4
0 0 0 10
Megan 30 5 6 7 8
Arnav 30 1 5 -2 3
Jaime 10 -3 4 5 -10
Jon 50 2 2 2 2
Sample Output

Arnav Megan*/
public class Bribe {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args)
	{
		int tests = scan.nextInt();
		scan.nextLine();
		for(int i=0;i<tests;i++)
		{
			String[] s = scan.nextLine().split(" ");
			int numBags = Integer.parseInt(s[0]);
			int numTA = Integer.parseInt(s[1]);
			ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();
			ArrayList<String> nam = new ArrayList<String>();
			StringBuilder names = new StringBuilder();
			for(int j=0;j<numBags;j++)
			{
				String[] st = scan.nextLine().split(" ");
				ArrayList<Integer> newL = new ArrayList<Integer>();
				for(String s2: st)
					newL.add((Integer.parseInt(s2)));
				a.add(newL);		
			}
			for(int j=0;j<numTA;j++)
			{
				String[] str = scan.nextLine().split(" ");
				String name = str[0];
				int limit = Integer.parseInt(str[1]);
				ArrayList<Integer> points = new ArrayList<Integer>();
				for(int k=2;k<str.length;k++)
				{
					points.add(Integer.parseInt(str[k]));
				}
				for(int k=0;k<a.size();k++)
				{
					int sum = 0;
					for(int l = 0;l<4;l++)
					{
						sum += a.get(k).get(l)* points.get(l);
					}
					if(sum>=limit)
					{
						nam.add(name);
						break;
					}
				}
			}
			Collections.sort(nam);
			for(String s2: nam)
				names.append(s2 + " ");
			System.out.println(names.toString());
		}	
	}
}
