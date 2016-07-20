package Integers;

public class ParallelLines 
{
	public static void main(String[] args)
	{
		System.out.println(areParallel(1, 3, 3, 6, 5, 10, 9, 16)); 
		System.out.println(areParallel(1, 3, 3, 6, 5, 10, 8, 16));
		System.out.println(areParallel(0, 5, 0 , 10, 5, 3, 10, 3));
		System.out.println(areParallel(0, 5, 0 , 10, 7, 3, 7, 10));
	}
	/*Write a method to determine if two lines are parallel. Each line will be
	designated with 4 integers. The integers will represent the x and y coordinates of 2 distinct points on each line.
	Recall lines are parallel if they have the same slope. Slope is the ratio of the change in the y values between two
	points on a line and the change in x values of those same two points.
	Here are some example calls and their expected results
	areParallel(1, 3, 3, 6, 5, 10, 9, 16) -> true
	areParallel(1, 3, 3, 6, 5, 10, 8, 16) -> false
	areParallel(0, 5, 0 , 10, 5, 3, 10, 3) -> false
	areParallel(0, 5, 0 , 10, 7, 3, 7, 10) -> true
	Complete the method below:
	/* Determine if two lines are parallel or not.
 	x1, y1 and x2, y2 represent two distinct points on line 1.
 	x3, y3 and x4, y4 represent two distinct points on line 2.
 	return true if the first line is parallel with the second line, false
 	otherwise.
	 */
	public static boolean areParallel(int x1, int y1, int x2, int y2,
			int x3, int y3, int x4, int y4)
	{
		double m1=0;
		if((x2-x1)!=0)
			m1 = (y2-y1)/(x2-x1);
		else
			m1=-1;
		
		double m2 = 0;
		if((x4-x3)!=0)
			m2 =(y4-y3)/(x4-x3);
		else
			m2=-1;

		if(m1==m2)
		{
			return true;
		}
		return false;
	}

}
