package Arrays;

import java.util.Arrays;

public class LongestString2DArrays 
{
	public static void main(String[] args)
	{
		String[][] a = new String[][]{{"help", "ok", "city lights"},
				{"elvisLives", "hello", "punch-out"},
				{"hurrah", "humptydumpty", "123"}};
		
		System.out.println(Arrays.toString(columnMax(a)));
		
	}
	
	/*Write a static method columnMax that takes a 2-D array of Strings and
	returns a one-dimensional array of integers. In the returned array, the value at index
	i is the length of the maximum length string in column i. For example, consider this
	array:
	String[][] a = {{‘‘help’’, ‘‘ok’’, ‘‘city lights’’},
					{‘‘elvisLives’’, ‘‘hello’’, ‘‘punch-out’’},
					{‘‘hurrah’’, ‘‘humptydumpty’’, ‘‘123’’}};
	Then the call columnMax(a) should return
	[10, 12, 11]
	Note that in column 0, “elvisLives” is the longest string, and it has length 10. In
	column 1, “humptydumpty” is the longest string, and its length is 12. In column 2,
	“city lights” is the longest string, and it has length 11.
	 */
	public static int[] columnMax(String[][] arr)
	{
		int[] a = new int[arr[0].length];
		int c=0;
		for(int col =0;col<arr[0].length;col++)
		{
			int max = arr[0][col].length();
			for(int row=1;row<arr.length;row++)
			{
				if(max<arr[row][col].length())
					max = arr[row][col].length();
			}
			a[c] = max;
			c++;
		}
		return a;
	}
}
