package Strings;
/*Write a method repeatedReversedEnd.
The method has 3 parameters, a String str, an int n, and an int num. The method creates and returns a
new String that consists of the last n characters of str in reverse order, repeated num times.
Examples of calls to repeatedReversedEnd(String str, int n, int num):
repeatedReversedEnd("ABCD", 2, 3) returns "DCDCDC"
repeatedReversedEnd("ABCD", 0, 3) returns ""
repeatedReversedEnd("ABCD", 3, 0) returns ""
repeatedReversedEnd("ABCD", 4, 1) returns "DCBA"
The String in the next example contains a single space
repeatedReversedEnd("A *D", 4, 3) returns "D* AD* AD* A"
repeatedReversedEnd("AAABB", 4, 3) returns "BBAABBAABBAA"
Assume 0 <= n <= str.length(), num >= 0, and str != null
*/
public class RepeatingReversedString 
{
	public static void main(String[] args) 
	{
		System.out.println(repeatedReversedEnd("ABCD", 2, 3));
		System.out.println(repeatedReversedEnd("ABCD", 0, 3));
		System.out.println(repeatedReversedEnd("ABCD", 3, 0));
		System.out.println(repeatedReversedEnd("ABCD", 4, 1));
		System.out.println(repeatedReversedEnd("A *D", 4, 3));
		System.out.println(repeatedReversedEnd("AAABB", 4, 3));
	}
	public static String repeatedReversedEnd(String s, int endChar, int multiply)
	{
		String sent = "";
		int last = s.length()-1;
		for(int i=0;i<endChar;i++)
		{
			if(i==0)
				sent+= s.substring(last);
			else
				sent+= s.substring(last-i, last-i+1);
		}
		
		String finalSent = "";
		for(int i=1;i<=multiply;i++)
		{
			finalSent+= sent;
		}
		return finalSent;
	}
}
