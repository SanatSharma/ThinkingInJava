package Strings;
/*Write a complete program that reads a line of text from the user, and prints every
other character in this String, starting with the second character. If the String entered
by the user has odd length, print the middle character of the string as well.
If the user enters:”helloAworld”, the output will be:
elAol
middle character: A
*/
import java.util.*;
public class PrintingAlternate 
{
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter a string : ");
		String str = scan.nextLine();
		printAlternate(str);
	}
	public static void printAlternate(String sent)
	{
		String print = "";
		for(int i=0;i<sent.length();i++)
		{
			if(i%2!=0)
			{
				print+= sent.charAt(i);
			}
		}
		if(print.length()%2!=0)
		{
			System.out.println(print);
			System.out.println(print.charAt(print.length()/2));
		}
		else
			System.out.println(print);
	}

}
