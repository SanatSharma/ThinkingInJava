package Strings;
import java.util.*;
public class StringManipulation 
{
	//manipulate strings in several ways as described in the below shown methods
	private String sentence;
	private int words;
	//creating a scanner object that will be used later in void main
	private static Scanner in;
	public StringManipulation(String str)
	{
		int count=1;
		//Constructor creates sentence from string str
		//finds words in sentence
		sentence= str;
		for(int i=0;i<sentence.length();i++)
		{
			if(Character.isWhitespace(sentence.charAt(i)))
			{
				count++;
			}
		}
		System.out.println("Number of words in sentence is : "+count);
	}
	public int getWords()
	{
		return words;
	}
	public String getSentence()
	{
		return sentence;
	}
	private static String removeBlanks(String s)
	{
		//return string with all blanks removed
		for(int i=0;i<s.length();i++)
		{
			if(Character.isWhitespace(s.charAt(i)))			
			{
				s = s.replaceAll(" ", "");
			}
		}
		System.out.println("After removing blanks : " + s);
		return s;
	}
	private static String lowerCase(String s)
	{
		//return string with all characters in lower case
		/*for(int i = 0;i<s.length();i++)
		{
			s=s.toLowerCase();
		}
		*/
		s = s.toLowerCase();
		System.out.println("Making string lowercase : " + s);
		return s;
	}
	private static String removePunctuation(String s)
	{
		//return string with all punctuation marks removed
		s = s.replaceAll("\\W", "");
		System.out.println("Removing punctuation marks : " + s);
		return s;
	}
	public Boolean Palindrome()
	{
		String temp = removeBlanks(sentence);
		temp = lowerCase(temp);
		temp = removePunctuation(temp);
		return Palindrome(temp,0, temp.length()-1);
	}
	private static Boolean Palindrome(String s, int start, int end)
	{
		//check whether the entered sentence is a palidrome or not
		int middle= (end+start)/2;
		int c=0;
		for(int i=start;i<middle;i++)
		{
			if(s.charAt(i)== s.charAt(end))
			{
			}
			else
			{
				c++;
			}
			end--;
		}
		if(c==0)
		{
			return true;
		}
		else if(c>0)
		{
			return false;
		}
		return false;
		
	}
	
	public static void main(String[] args)
	{
		in = new Scanner(System.in);
		System.out.println("Please enter a string: ");
		String str= in.nextLine();
		StringManipulation s = new StringManipulation(str);
		Boolean b = s.Palindrome();
		if(b==true)
		{
			System.out.println(str + " is a Palindrome!!");
		}
		else if(b == false)
		{
			System.out.println(str + " is not a Palindrome!!");
		}
	}
}