package recursion;

import java.util.Scanner;

/**
 * @author Sanat
 * program to convert a decimal based number to a binary number using recursion
 */
public class ConvertToBinary {

	public static void main(String[] args) 
	{
		ConvertToBinary c = new ConvertToBinary();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to convert to binary: ");
		int n = scan.nextInt();
		System.out.println("Expected Output: " + Integer.toBinaryString(n));
		System.out.println("Actual Output non-recursively: ");	c.convBinary(n); c.convBinary2(n);;
		System.out.println("\nActual output recursively: "); c.recConvBinary(n);
		System.out.println("\nActual output recursively: " + c.recConvBinary2(n));

	}
	
	//non-recursively
	// we create a string of values with the values and then reverse the string
	public void convBinary(int a)
	{
		if(a<2)
			System.out.println(a);
		else
		{
			System.out.print(1);
			String st = "";
			while(a>1)
			{
				st += a%2;
				a/=2;
			}
			String l = new StringBuffer(st).reverse().toString();
			System.out.println(l);
		}
	}
	
	//we create an array and fill it with values of the binary values. We then rpint out the reverse of the array
	public void convBinary2(int a)
	{
		int[] binary = new int[40];
		int index =0;
		while(a>0)
		{
			binary[index] = a%2;
			index++;
			a/=2;
		}
		for(int i= index-1;i>=0;i--)
			System.out.print(binary[i]);
		System.out.println();
	}
	
	//Recursively converting to binary
	public void recConvBinary(int a)
	{
		if(a<=1)
		{	System.out.print(a);
			return;
		}
		recConvBinary(a/2);
		System.out.print(a%2); //if this statement comes above the previous statement, the output gets reversed
	}
	
	public String recConvBinary2(int a)
	{
		String res = "";
		if(a<=0)
			return "0";
		else if(a==1)
			return "1";
		else
		{
			res += a%2;
			return recConvBinary2(a/2) + res;
		}
	}
}
