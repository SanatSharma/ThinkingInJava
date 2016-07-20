package recursion;

public class PowerFunction {
	public static void main(String[] args)
	{
		System.out.println(powerN(3,2));
		System.out.println(powerN(5,3));
		System.out.println(powerN(2,8));
		
	}
	public static int powerN(int base, int n) 
	{
		int m;
		if(n==0)
			return 1;
		else if(n%2==0)
		{
			m = powerN(base, n/2);
			return m*m;
		}
		return base* powerN(base,n-1);
	}

}
/*Output
9
125
256
*/