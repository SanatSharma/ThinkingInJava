package recursion;

public class InterativeSum {

	public static void main(String[] args) {

		System.out.println(add(10) + " == "  + recSum(10));
		System.out.println(add(25) + " == "  + recSum(25));
		System.out.println(add(16) + " == "  + recSum(16));
	}
	
	//the non-recursion based solution
	public static int add(int k)
	{
		int sum=0;
		for(int i=0;i<=k;i++)
		{
			sum+=i;
		}
		return sum;
	}
	
	//recursion based solution
	public static int recSum(int k)
	{
		if(k==0)
			return 0;
		return recSum(k-1) + k;
	}

}
