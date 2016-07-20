package Sorting;

public class IsSorted 
{
	public static void main(String[] args)
	{
		System.out.println(isSorted( new double[]{}));
		System.out.println(isSorted( new double[]{1.0}));
		System.out.println(isSorted( new double[]{0.0, 0.0, 0.0, 0.0}));
		System.out.println(isSorted( new double[]{0.0, 0.1, 0.0, 0.0}));
		System.out.println(isSorted( new double[]{0.5, 1.0, 1.0, 2.5}));
		System.out.println(isSorted( new double[]{0.5, 1.0, 1.0, 0.5}));
	}

	/*isSorted( {} ) -> true
	isSorted( {1.0} ) -> true
	isSorted( {0.0, 0.0, 0.0, 0.0} ) -> true
	isSorted( {0.0, 0.1, 0.0, 0.0} ) -> false
	isSorted( {0.5, 1.0, 1.0, 2.5} ) -> true
	isSorted( {0.5, 1.0, 1.0, 0.5} ) -> false 
	 */
	public static Boolean isSorted(double[] data)
	{
		for(int i=0;i<data.length-1;i++)
		{
			if(data[i]<=data[i+1])
			{
			}
			else
				return false;
		}
		return true;
	}

}
