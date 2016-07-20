package Arrays;
/*Amazon Interview Question for Software Engineer / Developers
amazon-interview-questions 
Rotate a array by N. N can be smaller of greater than the array length. 
e.g {0,1,2,4,5,6,7} N =4 should return {5,6,7,4,0,1,2}. 
*/
import java.util.*;
public class RotatingArrayAmazonInterviewQuestion 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a limit: ");
		int n = scan.nextInt();
		System.out.println("Enter " + n + " values: ");
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = scan.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		rotateArray(scan,arr);
	}
	public static void rotateArray(Scanner input,int[] a)
	{
		System.out.println("Input the number you want to rotate the array around :");
		int n = input.nextInt();
		if (n>a.length)
		{
			n=n%a.length;
		}
		int[] temp = new int[a.length];
		int c=0;
		int pos = a[n-1];
		for(int i=n;i<a.length;i++)
		{
				temp[c] = a[i];
				c++;
		}
		temp[c] = pos;
		c++;
		for(int j=1;j<a.length-c;j++)
		{
				temp[c+j] = a[j];
		}
		System.out.println(Arrays.toString(temp));
	}
}
/*
Output:
Enter a limit: 
7
Enter 7 values: 
0
1
2
4
5
6
7
[0, 1, 2, 4, 5, 6, 7]
Input the number you want to rotate the array around :
4
[5, 6, 7, 4, 0, 1, 2]
*/
