package Strings;

/*. Write a method that prints all the trigrams in a String ignoring all non-letter characters in the
String. Print out the letter-only trigrams in the order they appear in the String, one per line, to standard output.
A trigram consists of three consecutive characters in a String. For example the String "compute" contains the
following trigrams: "com", "omp", "mpu", "put", "ute".
In this question you must ignore any non-letter characters in the String.
For example, the String "t**he c!!-A {}t"
has the following letter-only trigrams: "the", "hec", "ecA", "cAt".
Print out all letter-only trigrams in the order they appear even if this means printing out the same trigram multiple times.
If the String does not contain any letter-only trigrams, then there is no output.*/
public class Trigrams 
{
	public static void main(String[] args) 
	{
		trigramPrint("Computer");
		trigramPrint("t**he c!!-A {}t");
	}
	
	public static void trigramPrint(String str)
	{
		String s = "";
		for(int i=0;i<str.length();i++)
		{
			if(Character.isLetter(str.charAt(i)))
			{
				s += str.charAt(i);
			}
		}
		for(int i=0 ; i< s.length()-2;i++)
		{
			System.out.println(s.substring(i,i+3));	
		}
		System.out.println();
		
	}
}
/* Output
Com
omp
mpu
put
ute
ter

the
hec
ecA
cAt
*/