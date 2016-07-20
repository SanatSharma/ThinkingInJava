package Arrays;
import java.util.*;
public class StringSeperationUsingArrays 
{
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.println("Enter string: ");
		String str = scan.nextLine();
		System.out.println(sort(str));
		
		System.out.println(Arrays.toString(getNGrams("dogs",2)));
		System.out.println(Arrays.toString(getNGrams("computers",3)));
		System.out.println(Arrays.toString(getNGrams("***",4)));
		System.out.println(Arrays.toString(getNGrams("",1)));
		System.out.println(Arrays.toString(getNGrams("sanat",5)));
	}
	
	/*A string contains a-z, A-Z, spaces and numbers1-9. Sort the string so that all
	lower cases are at the beginning, spaces next, then upper cases and numbers at the
	end. Original order among lower and upper cases needs to remain the same. 
	For example: a cBd LkmY becomes ackm BLY. Is there a way in O(n) without extra space?
	*/

	static String sort(String sent)
	{
		String lowerStr = "";
		String upperStr = "";
		String spaces ="";
		String numStr = "";
		for(int i =0;i<sent.length();i++)
		{
			if(Character.isLowerCase(sent.charAt(i)))
			{
				lowerStr+=sent.charAt(i);
			}
			else if(Character.isUpperCase(sent.charAt(i)))
			{
				upperStr += sent.charAt(i);
			}
			else if(sent.charAt(i)== ' ')
			{
				spaces += sent.charAt(i);
			}
			if(Character.isAlphabetic(sent.charAt(i)))
			{}
			else
			{
				if(sent.charAt(i)==' ')
				{}
				else
				{
					numStr += sent.charAt(i);
				}
			}
		}
		sent = lowerStr + spaces + upperStr + numStr;
		return sent;
	}
	
	/*Write a method getNGrams. The method takes 2 parameters, a String
	str and an int n. The method returns an array of Strings that are the n-grams of the String str.
	An n-gram is a continuous sequence of n characters from a given String.
	For example if n = 2 and the String is "dogs" the n grams (in this case bigrams) are "do", "og", and "gs".
	If n = 3 and the String is "computer" the n grams are (in this case trigrams) are "com", "omp", "mpu", "put",
	"ute", and "ter".
	If n = 4 and the String is "***" there are no quadgrams and the method shall return an empty array.
	You may Strings including the length, substring and charAt methods and Java's built in, native
	arrays. You may not use any other methods or classes.
	You may assume str != null and n > 0.
	 */
	public static String[] getNGrams(String str, int n)
	{
		String[] arrayStr;
		int l = (str.length()-n+1);
		if(l>0)
		{
			arrayStr = new String[l];
		}
		else
		{
			arrayStr = new String[0];
			return arrayStr;
		}
		
		for(int i=0;i<l;i++)
		{
			arrayStr[i] = str.substring(i,i+n);
		}
		
		return arrayStr;
	}
	

}
