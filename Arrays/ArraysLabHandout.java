package Arrays;
import java.util.*;
public class ArraysLabHandout {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a limit: ");
		int limit = scan.nextInt();
		int[] a  = new int[limit];
		for(int i=0;i<limit;i++)
		{
			a[i] = scan.nextInt();
		}
		
		//Methods to do different kinds of work
		findMinMax(a);
		count(a,scan);
		rotateArray(scan, a);
		rotateRight(a);
		stretch(a);
		countLastDigits(scan);
		vowelCount(scan);
	}
	
	//finds min and max element in array
	public static void findMinMax(int[] arr)
	{
		int min= arr[0];
		int max = arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(min>arr[i])
				min = arr[i];
			if(max<arr[i])
				max = arr[i];
		}
		
		System.out.println("Max value : " + max);
		System.out.println("Min value : " + min);
	}
	
	
	//counts number of occurrences of a particular number
	public static void count(int[] arr, Scanner input)
	{
		System.out.print("enter the element you want to search for: ");
		int search= input.nextInt();
		
		int count=0;
		for( int i =0;i<arr.length;i++)
		{
			if(search==arr[i])
				count++;
		}
		System.out.println("Number of occurences of element " + search  +  " : " + count);
	}
	
	//rotates array around user entered number
	public static void rotateArray(Scanner input,int[] a)
	{
		System.out.print("Input the number you want to rotate the array around :");
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
	
	//rotates the array to the right by one
	public static void rotateRight(int[] a)
	{
		int[] temp = new int[a.length];
		
		for(int i=0;i<a.length;i++)
		{
			temp[i] = a[i];
		}
		
		int temp1 = a[a.length-1];
		System.out.println("Currently original array is : " + Arrays.toString(a));
		for(int i=0;i<a.length-1;i++)
		{
			a[i+1] = temp[i];
		}
		a[0] = temp1;
		
		System.out.println("After moving right, the new array is : " + Arrays.toString(a));
	}
	
	//stretches accepts an array and makes an array twice as long, replacing each integer with a pair 
	//or integers each half the original. If the number is odd, make the first element the bigger one
	public static void stretch(int[] a)
	{
		System.out.println("\nWe will now attemp to stretch the array");
		int[] arr = new int[a.length*2];
		int c=0;
		for(int i =0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				arr[c]= a[i]/2;
				arr[c+1] = a[i]/2;
				c=c+2;
			}
			else
			{
				arr[c] = a[i]/2 + 1;
				arr[c+1] = a[i]/2;
				c = c+2;
			}
		}
		
		System.out.println("New array : " + Arrays.toString(arr));
	}
	
	//determines how much numbers in an array end with 0, 1, 2 and so on. Then add this info to an array
	public static void countLastDigits(Scanner input)
	{
		System.out.println("\nEnter a limit: ");
		int a = input.nextInt();
		int[] arr = new int[a];
		for(int i=0;i<a;i++)
		{
			arr[i] = input.nextInt();
		}
		
		int[] digits = new int[10];
		
		for(int i=0;i<arr.length;i++)
		{
			int digit = arr[i]%10;
			
			for(int j=0;j<digits.length;j++)
			{
				if(digit==j)
					digits[j]++;
			}
		}
		
		System.out.println(Arrays.toString(digits));
	}
	
	//counts the vowel and returns an array with the occurrences of each vowel
	public static void vowelCount(Scanner input)
	{
		System.out.print("\nEnter a string: ");
		input.nextLine();
		String sent = input.nextLine();
		sent = sent.toUpperCase();
		System.out.println("We will now print out the occurences of each vowel: ");
		char[] letters = sent.toCharArray();
		int[] vowels = new int[5];
		for(int i=0;i<letters.length;i++)
		{
			if(letters[i]=='A')
				vowels[0]++;
			else if(letters[i]=='E')
				vowels[1]++;
			else if(letters[i]=='I')
				vowels[2]++;
			else if(letters[i]=='O')
				vowels[3]++;
			else if(letters[i]=='U')
				vowels[4]++;
		}
		
		System.out.println("a : " + vowels[0]);
		System.out.println("e : " + vowels[1]);
		System.out.println("i : " + vowels[2]);
		System.out.println("o : " + vowels[3]);
		System.out.println("u : " + vowels[4]);
	}
	
}
