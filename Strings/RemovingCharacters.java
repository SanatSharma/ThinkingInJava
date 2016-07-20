package Strings;

public class RemovingCharacters {

	public static void main(String[] args) 
	{
		System.out.println(removingSpecialCharacters("C*S*42*9", '4'));
		System.out.println(removingSpecialCharacters("****333", '3'));
		System.out.println(removingSpecialCharacters("CS312", 'a'));
		System.out.println(removingSpecialCharacters("BATMAN", 'A'));
		System.out.println();
		System.out.println("expect Hi : " + removeChars("Hi", new char[]{'a','b'}));
		System.out.println("expect H : " +removeChars("Hi", new char[]{'h', 'i'}));	
		System.out.println("expect \" \" : " +removeChars("Hi12Hi", new char[]{'H', 'i', '1', '2', '3', 'a'}));
		System.out.println("expect _* : " +removeChars("Hi_12*Hi", new char[]{'H','i', '1', '2', 'a', 'b', '3'}));
	}
	
	/*Write a method named newString that accepts two parameters, a String and a
	char. The method returns a String with all instances of the char parameter removed and all instances of the
	asterisk character, '*', removed. The order of other characters is the same.
	Examples:
	newString("C*S*42*9", '4') returns "CS29"
	newString("****3333", '3') returns ""
	newString("CS312", 'a') returns "CS312"
	The only methods you may use from the String class are length and charAt.
	 */
	public static String removingSpecialCharacters(String s, char ch)
	{
		String newStr = "";
		for(int i =0; i<s.length();i++)
		{
			if(s.charAt(i)==ch || s.charAt(i)=='*')
			{}
			else
			{
				newStr+=s.charAt(i);
			}
		}
		return newStr;
	}
	
	/*The method takes as its arguments a
	String and an array of chars. The method returns a new String that is the same as the
	String argument, except that all characters that appear in the char array have been
	removed. The only methods you may call in your method are charAt and length from
	the String class. You may assume that the array of characters contains at least one
	character.
	Here are some example calls to removeChars and the value that should be returned:
	removeChars("Hi", {’a’, ’b’}) --> "Hi"
	removeChars("Hi", {’h’, ’i’}) --> "H"
	removeChars("Hi12Hi", {’H’, ’i’, ’1’, ’2’, ’3’, ’a’}) --> "" //all chars removed
	removeChars("Hi_12*Hi", {’H’, ’i’, ’1’, ’2’, ’a’, ’b’, ’3’}) --> "_*"
	removeChars("hello world", {’e’, ’o’, ’3’}) --> "hll wrld"
	 */
	public static String removeChars(String s, char[] ch)
	{
		String newStr = "";
		for(int i=0;i<s.length();i++)
		{
			int c=0;
			for(int j=0;j<ch.length;j++)
			{
				
				if(s.charAt(i)==ch[j])
				{
					c++;
				}
			}
			if(c==0)
			{
				newStr+=s.charAt(i);
			}
		}
		
		return newStr;
	}

}
