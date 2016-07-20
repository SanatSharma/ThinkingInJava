package recursion;

/*A method of recursion is tail recursive if the last action of the recursive method
is the recursive call. Because recursion builds frame upon frame of the stack, the
additional overhead required by non-tail recursive functions could be
costly for large inputs. */

//We would try to implement a modulus function using tail recursion
public class TailRecursion {

	public static void main(String[] args) 
	{
		System.out.println("10%5==0 " + modulus(10,5));
		System.out.println("7%3==1 " + modulus(7,3));
		
	}
	
	public static int modulus(int val, int divisor)
	{
		if(divisor==0)
			return 0;
		boolean neg = val<0;
		
		if(val<divisor)
		{
			if(neg)
				return -val;
			else
				return val;
		}
		else
		{
			if(neg)
				return -modulus(val-divisor, divisor);
			else
				return modulus(val-divisor, divisor);
		}
			
			
	}
}
