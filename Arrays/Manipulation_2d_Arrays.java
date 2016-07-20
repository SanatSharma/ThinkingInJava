package Arrays;
import java.util.*;
public class Manipulation_2d_Arrays
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the limit of the 2D array: ");
		int n= in.nextInt();
		double[][] a = new double[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print("Please enter value [" + i + "," + j + "]");
				System.out.println();
				a[i][j] = in.nextDouble();
			}
		}
		System.out.println();
		System.out.println("Array grid is :");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
		double sumLeftDiagonal=0;
		double sumRightDiagonal=0;
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==j)
				{
					sumLeftDiagonal += a[i][j];
				}
				if((i+j)==(n-1))
				{
					sumRightDiagonal+= a[i][j];
				}
			}
			
		}
		System.out.println();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Sum of left diagonal is : " + sumLeftDiagonal);
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Sum of right diagonal is : "+ sumRightDiagonal);
		
		double productRow=1;
		double productColumn=1;
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				productRow *= a[i][j];
				productColumn *= a[j][i];
			}
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println();
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Product of row " + (i+1) + " is : " + productRow);
			System.out.println("Product of Column " + (i+1) + " is : " + productColumn);	
			productRow=1;
			productColumn=1;
		}
		
		System.out.println("We will now exchange the first and last rows!!");
		double temp;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==(n-1))
				{
					temp = a[0][j];
					a[0][j]= a[i][j];
					a[i][j]= temp;
				}
			}
		}
		System.out.println("Array grid now is :");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
		
	}
}
