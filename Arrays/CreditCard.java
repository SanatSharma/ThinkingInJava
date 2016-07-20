package Arrays;

import java.util.*;

public class CreditCard 
{
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of cases: ");
		int a = scan.nextInt();
		for(int i=0;i<a;i++)
		{
			String[] ch = scan.next().split("");
			//System.out.println(Arrays.toString(ch));
			int c=0;
			int[] arr = new int[ch.length-3];
			for(int j=0;j<ch.length;j++)
			{
				//0034-2345-0001-0454
				if(ch[j].equals("-"))
				{
				}
				else
				{
					arr[c] = Integer.parseInt(ch[j]);
					c++;
				}
			}
			
			//System.out.println(Arrays.toString(arr));
			for(int j=0;j<arr.length;j++)
			{
				if(j%2==0)
				{
					arr[j]*=2; 
				}
			}
			//System.out.println(Arrays.toString(arr));
			int sum=0;
			for(int j=0;j<arr.length;j++)
			{
				int num = arr[j];
				if(num>=10)
				{
					while(num>0)
					{
						sum =  sum + num%10;
						num=num/10;
					}
				}
				else
				{
					sum +=num;
				}
			}
			if(sum%10==0)
			{
				System.out.println("YES");
			}
			else
			{
				System.out.println("NO");
			}
			
		}
		scan.close();
	}
}
