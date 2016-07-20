package Integers;
/*Callie and Hannah just got back from their annual roadtrip and want to know how far they drove. Unfortunately, the odometer in their car resets every time the car is turned off, so they just took note of the mileage each time they stopped. Can you tell them how far they traveled?

Input

The first line contains a positive integer T- the number of test cases. T will not exceed 10.

For each test case T the first line contains a single integer N, the number of times the travelers stopped and wrote down their miles. On the next line there are N reals, each between 0 and 500, representing one of the values that the travelers recorded. 0 < N < 300

Output

A single value that represents the distance traveled.

Sample Input

2
4
8.9 5.6 7.0 2.3
2
7.8 9.0
Sample Output

23.8
16.8
*/
import java.util.*;
public class RoadTrip 
{
	
	
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);	
		int cases = scan.nextInt();
		for(int i=0;i<cases;i++)
		{
			double sum=0;
			int a =scan.nextInt();
			for(int j=0;j<a;j++)
			{
				sum+= scan.nextDouble();
			}
			System.out.printf("%.2f",sum);
			System.out.println();
		}
	}

}
