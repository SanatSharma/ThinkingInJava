
/*A vampire number has an even number of digits and is formed by multiplying a pair of numbers containing half the number of digits of the result. 
 * The digits are taken from the original number in any order. 
 * Pairs of trailing zeroes are not allowed. Examples include:
1260 = 21 * 60
1827 = 21 * 87
2187 = 27 * 81
Write a program that finds all the 4-digit vampire numbers. (Suggested by Dan Forhan.)*/
public class VampireNumber 
{
	public static boolean trueVampire(int num, int[] a)
	{
		int num1 = num/100;
		int num2 = num%100;
		
		int[] fangs = new int[4];
		
		fangs[0] = num1/10;
		fangs[1] = num1%10;
		fangs[2] = num2/10;
		fangs[3] = num2%10;
		
		for(int i=0; i< fangs.length; i++)
		{
			int answer=0;
		
			for(int j=0;j< fangs.length; j++)
			{
				if(j==i)
					continue;
				
				for(int k=0; k< fangs.length;k++)
				{
					if(k==i||k==j)
						continue;
					
					for(int l=0; l< fangs.length;l++) 
					{
						if(l==i||l==j||l==k)
							continue;
						a[0] = fangs[l]*10 + fangs[j];
						a[1] = fangs[k]*10 + fangs[i];
						answer = a[0]*a[1];
						if(answer == num) //checking the number in the main loop
						{
							return true;
						}
						
					}
				}
			}
		}
		return false;
	}
			
							
		public static void main(String[] args) 
	{
		System.out.println("Number of 4 digit Vampire Numbers are as follows: ");
		for(int num=1000; num<10000;num++)
		{
			int[] a = new int[2];
			if(trueVampire(num,a))
			{
				System.out.println("Number : " + num + " = " + a[0] + " * " + a[1]);
			}
		}
	}

}
