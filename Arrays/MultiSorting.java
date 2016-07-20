package Arrays;
/*Given three arrays A,B,C with n elements each and a number 'K'.
find whether there exists a,b,c where a belongs to A, b to B and c to C such that 
a+b+c = K. It should be done in NlogN time
 */
import java.util.*;
public class MultiSorting 
{
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter a limit for each array: ");
		int n  = scan.nextInt();
		System.out.println("Enter num that you want to find in the first array: ");
		int elementA = scan.nextInt();
		System.out.println("Enter numthat you want to find in the second array: ");
		int elementB = scan.nextInt();
		System.out.println("Enter num that you want to find in the third array: ");
		int elementC = scan.nextInt();
		System.out.println("Enter the number that you want as the final sum: ");
		int k = scan.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		int[] c = new int[n];
		System.out.println("Please enter " + n*3 + " values : ");
		
			for(int j=0;j<n;j++)
			{
				a[j]= scan.nextInt();
				b[j] = scan.nextInt();
				c[j] = scan.nextInt();
			}
		
		int f=arrayCh(n,a,b,c,elementA,elementB,elementC);
		if(f==0)
		{
			System.out.println("All elements not present in arrays");
		}
		else
		{
			if(k==f)
			{
				System.out.println("sum is equal to the intended value");
			}
			else
			{
				System.out.println("sum not equal to intended value");
			}
		}
	}
	public static int arrayCh(int n,int[] a,int[] b, int[] c, int elementA, int elementB, int elementC)
	{	int sum = 0;
		for(int i = 0;i<n;i++)
		{
			if(a[i]==elementA)
			{
				System.out.println(elementA + " is present in array one");
				for(int j=0;j<n;j++)
				{
					if(b[j]==elementB)
					{
						System.out.println(elementB + " is present in array two");
						for(int m=0;m<n;m++)
						{
							if(c[m]==elementC)
							{
								System.out.println(elementC + " is present in array three");
								sum = elementA + elementB + elementC;
								return sum;
								
							}
						}
					}
				}
			}
		}
		return 0;
	}

}
