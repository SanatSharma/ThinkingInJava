package Strings;

import java.util.Scanner;

/* 
 * limit =5
----*----
---***---
--*****--
-*******-
*********
*/
public class Pattern2 
{
	public static void main(String[] args)
	{
		Scanner scan =new Scanner(System.in);
		System.out.println("Please enter a limit: ");
		int num = scan.nextInt();
		for(int i=1;i<=num;i++)
		{
			for(int j=num;j>i;j--)
			{
				System.out.print("-");
			}
			for(int k=1;k<=i*2-1;k++)
			{
				System.out.print("*");
			}
			for(int j=num;j>i;j--)
			{
				System.out.print("-");
			}
			System.out.println();
		}
	}
}
