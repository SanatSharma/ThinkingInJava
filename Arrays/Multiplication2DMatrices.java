package Arrays;

import java.util.*;

public class Multiplication2DMatrices
{
	/* input
	| -21 14 | |  -7 -24  -4 -23 -21 |
	|   2 24 | | -10  -7 -25   4   5 |
	|  16 10 |
	*/
	
	/* Output
	 * |    7  406 -266  539  511 |
	   | -254 -216 -608   50   78 |
	   | -212 -454 -314 -328 -286 |
	 *
	 */
	static Random rand = new Random();
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args)
	{
		
		int a = 3;
		int b = 2;
		
		int[][] matrix1 = new int[a][b];
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<b;j++)
			{
				matrix1[i][j] = rand.nextInt(10);
			}
		}
		int c = 3;
		int d = 1;	
		int[][] matrix2 = new int[c][d];
		for(int i=0;i<c;i++)
		{
			for(int j=0;j<d;j++)
			{
				matrix2[i][j] = rand.nextInt(10);
			}
		}
		
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<b;j++)
			{
				System.out.print(matrix1[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		for(int i=0;i<c;i++)
		{
			for(int j=0;j<d;j++)
			{
				System.out.print(matrix2[i][j] + "\t");
			}
			System.out.println();
		}
		
		
		if(a==c)	
		{
			int[][] matrix3 = new int[b][d];
			for(int i=0;i<b;i++)
			{
				for(int j=0;j<d;j++)
				{
					matrix3[i][j]=0;
					for(int k=0;k<b;k++)
					{
						matrix3[i][j] = matrix3[i][j] + matrix1[i][k]*matrix2[k][j];
					}
				}
			}
			
			System.out.println("After multiplication:");
			for(int i=0;i<b;i++)
			{
				for(int j=0;j<d;j++)
				{
					System.out.println(matrix3[i][j]);
				}
			}
		}
		else
		{
			System.out.println("Is not multiplicable!");
		}
		
		
		/*if(y==m)
	    {
	 
	        for(i=0;i<x;i++)
	        {
	            for(j=0;j<n;j++)
	            {
	                c[i][j]=0;
	                for(int k=0;k<m;k++)
	                {
	                    c[i][j]=c[i][j]+a[i][k]*b[k][j];
	                }
	            }
	        }
	       */
	}
}
