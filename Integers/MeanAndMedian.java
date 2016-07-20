package Integers;
import java.util.*;
public class MeanAndMedian {

	public static void main(String[] args) 
	{
		System.out.println(diffMeanAndMedian(new double[]{-2.5,0.0,3.5,12.5,27.0}));
		System.out.printf("%.2f\n",diffMeanAndMedian(new double[]{-2.5,0.0,3.5,12.5,27.0,27.1}));
		System.out.println(diffMeanAndMedian(new double[]{-2.5}));
		System.out.println(diffMeanAndMedian(new double[]{-2.5,-2.5,-2.5,-2.5}));
		System.out.println(diffMeanAndMedian(new double[]{1.0,1.0,1.0,1.0,100.0}));
		System.out.println(diffMeanAndMedian(new double[]{23.2, 13.2,1.4, -2.4}));
	}
	
	/* Complete a method that given an array of doubles returns the difference
	between the mean of the elements in the array and the median of the elements in the array. Recall the mean of a
	group of values is the average of those values. The median of a group of values is the middle element in the group
	assuming the values are sorted. You may assume the elements in the array are already sorted in ascending order and
	that the length of the array is greater than 0.
	If a sorted array has an odd number of values the middle element is the median:
	{-2.5, 0.0, 3.5, 12.5, 27.0} -> median is 3
	If a sorted array has an even number of values the median is the average of the two middle values:
	{-2.5, 0.0, 3.5, 12.5, 27.0, 27.1} -> median is (3.5 + 12.5) / 2 = 8.0
	Write a method that returns the mean of the elements in an array minus the median of the elements in the array.
	Here are some examples of expected return values for various arrays.
	diffMeanAndMedian( {-2.5, 0.0, 3.5, 12.5, 27.0} ) -> 4.6
	diffMeanAndMedian({-2.5, 0.0, 3.5, 12.5, 27.0, 27.1} ) -> 3.266666666666667
	diffMeanAndMedian ( {2.5} ) -> 0
	diffMeanAndMedian ( {-5.0, -5.0, -5.0, -5.0} ) -> 0
	diffMeanAndMedian ( {1.0, 1.0, 1.0, 1.0, 100.0} ) -> 19.8
	 */
	public static double diffMeanAndMedian(double[] data)
	{
		double mean = 0;
		double sum =0;
		double median;
		int l = data.length;
		Arrays.sort(data);
		if(data.length%2==0)
		{
			median = (data[l/2] + data[l/2-1])/2; 
		}
		else
			median = data[l/2];
		
		for(int i =0;i<l;i++)
		{
			sum +=data[i];
		}
		
		mean = sum/l;
		
		return mean-median; 
	}

}
