package Arrays;
import java.util.*;
public class PassingArrayToMethod 
{


	public static int[] changeElement(int location, int value, int[] array)
	{
		array[location] = value;
		return array;
	}
	public static void main(String[] args)
	{
		Scanner in =  new Scanner(System.in);
	
		System.out.println("Enter size of array: ");
		int size = in.nextInt();
		
		int[] a = new int[size];
		for(int i=0;i<size;i++)
		{
			
			System.out.print("enter element " + (i+1) + " : ");
			a[i]= in.nextInt();
			System.out.println();
		}
		System.out.print("Arrays entered is : ");
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Arrays.toString(a));
		System.out.println();
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Enter location of element to be replaced : ");
		int n = in.nextInt();
		n=n-1;
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Enter new value : ");
		int x = in.nextInt();
		a = changeElement(n,x,a);
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.print("The new array is: ");
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.print(Arrays.toString(a));
	
	}
}
		