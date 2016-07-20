package Strings;
import java.util.Scanner;
//input a string 
//reverse() reverses the whole string
//reversehalf() returns half string reversed 
public class StringReversal 
{
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("enter a string : ");
		String sent = scan.nextLine();
		
		System.out.println(reverse(sent));
		System.out.println(reverseHalf(sent));
		
	}
	public static String reverse(String sent)
	{
		String str = "";
		for(int i=sent.length()-1;i>=0;i--)
		{
			str += sent.charAt(i);
		}
		return str;
		
	}
	public static String reverseHalf(String sent)
	{
		String str = "";
		int i = sent.length()/2; //11/2 = 5  6/2=3 
		for(int j=sent.length() - 1; j>=i;j--)
		{
			str+=sent.charAt(j);
		}
		return str;
	}
}
