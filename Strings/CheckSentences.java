package Strings;
//import java.util.*;
//write and test a regular expression that checks a sentence to see that it begins with a capital letter and ends with a period.
public class CheckSentences 
{
	public static void main(String[] args)
	{
		String tokens = "Hi Sanat.";
		String[] a = tokens.split("");
		System.out.println(tokens);
		String c = a[1];
		String ch = a[a.length -1];
		System.out.println("length is " + a.length);
		System.out.println("first char is : " + c);
		System.out.println("last char is : " + ch);		
		if(c==c.toUpperCase() && ch== ".")
		{
			System.out.println("Sentence starts with a capital letter and ends with a period");
		}
		else
		{
			System.out.println("Sentence does not start with a capital letter and end with a period");
		}
	}
}
