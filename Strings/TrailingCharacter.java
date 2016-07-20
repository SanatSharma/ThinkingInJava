package Strings;
/*
 * Write a method removeTrailingChar. The method has two parameters: a String str and a char ch. The method creates and returns a new String that is the same as the parameter, except any characters at the end of the original String equal to the parameter ch are not present.
Examples:
removeTrailingChar("xAAxAA", 'A') -> returns "xAAx"
removeTrailingChar("xAAxAA", 'x') -> returns "xAAxAA"
removeTrailingChar("", 'A') -> returns ""
removeTrailingChar("AAAAAAA", 'A') -> returns ""
removeTrailingChar("xxBBBxBBbX", 'A') -> returns " xxBBBxBBbX"
removeTrailingChar("..X...x!.....", '.') -> returns "..X...x!"
 */
public class TrailingCharacter 
{
	public static void main(String[] args)
	{
		System.out.println(removeTrailingChar("xAAxAA", 'A'));
		System.out.println(removeTrailingChar("xAAxAA", 'x'));
		System.out.println(removeTrailingChar("", 'A'));
		System.out.println(removeTrailingChar("AAAAAAA", 'A'));
		System.out.println(removeTrailingChar("xxBBBxBBbX", 'A'));
		System.out.println(removeTrailingChar("..X...x!.....", '.'));
		
	}
	
	public static String removeTrailingChar(String s, char ch)
	{
		String newStr = "";
		int last = s.length()-1;
		while(last!=-1 && s.charAt(last)==ch)
			last--;
		
		if(last!=-1)
		{		
			newStr = s.substring(0,last+1);
		}
		
		return newStr;
	}
}
