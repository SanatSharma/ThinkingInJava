package Strings;
import java.util.*;
public class Pattern 
{
	public static void main(String[] args) 
	{
		int i,j,k;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a limit : ");
		int n=scan.nextInt();
		//Right Half triangle
		for(i=1;i<=n;i++)
		{
			for(j=i;j<=n;j++)
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
		//Left half triangle
		for(i=1;i<=n;i++)
		{
			for(j=i;j>0;j--)
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
		//Left side Full triangle
		for(i=1;i<=n;i++)
		{
			for(j=i;j<n;j++)
			{
				System.out.print("   ");
			}
			for(k=n-i;k<n;k++)
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
		for(i=1;i<=n;i++)
		{
			for(j=i-1;j>0;j--)
			{
				System.out.print("   ");
			}
			for(k=i;k<=n;k++)
			{
				System.out.print(" * ");
			}
			System.out.println();
		 }
		System.out.println();
		//Central Full Triangle
		 for(i=1;i<=n;i++)
			{
				for(j=i;j<n;j++)
				{
					System.out.print("   ");
				}
				for(k=n-i;k<n;k++)
				{
					System.out.print(" * ");
				}
				for(k=i-1;k>0;k--)
				{
					System.out.print(" * ");
				}
				System.out.println();
			}
			 for(i=1;i<=n;i++)
			{
				for(j=i;j>0;j--)
				{
					System.out.print("   ");
				}
				for(k=i;k<n;k++)
				{
					System.out.print(" * ");
				}
				for(k=i+1;k<n;k++)
				{
					System.out.print(" * ");
				}
				System.out.println();
			}
			 //Right full triangle
			for(i=1;i<=n;i++)
			{
				for(j=1;j<n;j++)
				{
					System.out.print("   ");
				}
				for(k=n-i;k<n;k++)
				{
					System.out.print(" * ");
				}
				System.out.println();
			}
			for(i=1;i<=n;i++)
			{
				for(j=1;j<n;j++)
				{
					System.out.print("   ");
				}
				for(k= n-i;k>0;k--)
				{
					System.out.print(" * ");
				}
				System.out.println();
			}
	}	
}
/*#include<iostream.h>
#include<conio.h>
void main()
{
	clrscr();
	int i,j,k,n;
	cout<<"enter limit : ";
	cin>>n;
	for(i=1;i<=n;i++)
	{
		for(j=i;j<=n;j++)
		{
			cout<<" * ";
		}
		cout<<endl;
	}
	for(i=1;i<=n;i++)
	{
		for(j=i;j>0;j--)
		{
			cout<<" * ";
		}
		cout<<endl;
	}
	for(i=1;i<=n;i++)
	{
		for(j=i;j<n;j++)
		{
			cout<<"   ";
		}
		for(k=n-i;k<n;k++)
		{
			cout<<" * ";
		}
		cout<<endl;
	}
	for(i=1;i<=n;i++)
	{
		for(j=i-1;j>0;j--)
		{
			cout<<"   ";
		}
		for(k=i;k<=n;k++)
		{
			cout<<" * ";
		}
		cout<<endl;
	 }
	 	 for(i=1;i<=n;i++)
	{
		for(j=i;j<n;j++)
		{
			cout<<"   ";
		}
		for(k=n-i;k<n;k++)
		{
			cout<<" * ";
		}
		for(k=i-1;k>0;k--)
		{
			cout<<" * ";
		}
		cout<<endl;
	}
	 for(i=1;i<=n;i++)
	{
		for(j=i;j>0;j--)
		{
			cout<<"   ";
		}
		for(k=i;k<n;k++)
		{
			cout<<" * ";
		}
		for(k=i+1;k<n;k++)
		{
			cout<<" * ";
		}
		cout<<endl;
	}
	for(i=1;i<=n;i++)
	{
		for(j=1;j<n;j++)
		{
			cout<<"   ";
		}
		for(k=n-i;k<n;k++)
		{
			cout<<" * ";
		}
		cout<<endl;
	}
	for(i=1;i<=n;i++)
	{
		for(j=1;j<n;j++)
		{
			cout<<"   ";
		}
		for(k= n-i;k>0;k--)
		{
			cout<<" * ";
		}
		cout<<endl;
	}
	getch();
}
*/