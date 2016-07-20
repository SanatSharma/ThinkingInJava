package Arrays;

public class MajorityInArray 
{
	public static void main(String[] args)
	{
		System.out.println(checkMajority(new int[]{1},1));//true
		System.out.println(checkMajority(new int[]{1},2));//false
		System.out.println(checkMajority(new int[]{2,1},1));//false
		System.out.println(checkMajority(new int[]{2,1,2,3,1},1));//false
		System.out.println(checkMajority(new int[]{-1,1,1,3,1},1));//true
		System.out.println(checkMajority(new int[]{-1,1,1,3,1},10));//false
	}
	/*array: [1], candidate 1, result -> true
array: [1], candidate 2, result -> false
array: [2, 1], candidate 1, result -> false (1 occurs 50% of the time,
not more that 50% of the time)
array: [2, 1, 2, 3, 1], candidate 1, result -> false
array: [-1, 1, 1, 3, 1], candidate 1, result -> true
array: [-1, 1, 1, 3, 1], candidate 10, result -> false

*/
	public static Boolean checkMajority(int[] a, int b)
	{
		int c = a.length/2;
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(b==a[i])
				count++;
		}
		if(count>c)
			return true;
		return false;
	}
}
