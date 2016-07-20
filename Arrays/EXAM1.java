package Arrays;

public class EXAM1 {

	public static void main(String[] args)
	{
		int[][] arr = new int[1][1];
		arr[0][0] =1;
		int[][] arr2 = {{1,1,0},
						{0,0,1},
						{1,0,0}};
		int[][] arr3 = {{1,0},
						{0,1}};
		int[][] arr4 = {{0,0,1},
						{1,0,0},
						{0,1,1}};
		int[][] arr5 = {{0,0,2,0},
						{0,2,0,0},
						{1,0,0,0},
						{0,0,0,4}};
						
		System.out.println(isLean(arr));
		System.out.println(isLean(arr2));
		System.out.println(isLean(arr3));
		System.out.println(isLean(arr4));
		System.out.println(isLean(arr5));
	}
	
	public static boolean isLean(int[][] a)
	{
		int rowSum = 0; int colSum = 0; int sum = 0;
		int nums = 0;
		for(int i = 0; i < a.length; i++)
		{
			sum = sum + i;
			for(int j=0;j<a.length;j++)
			{
				if(a[i][j]!= 0)
				{
					rowSum+=i;
					colSum+=j;
					nums++;
				}
			}
		}
		if(a.length==1 && a[0][0]!= 0)
			return true;
		else if(rowSum != colSum)
			return false;
		else if(rowSum+colSum == sum*2 && nums == a.length)
			return true;
		else
			return false;
	}
}
