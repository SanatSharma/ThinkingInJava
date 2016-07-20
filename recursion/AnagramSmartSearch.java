package recursion;

import java.math.BigInteger;
import java.util.Arrays;

/*Consider a "word" as any sequence of capital letters A-Z (not limited 
to just "dictionary words"). For any word with at least two different 
letters, there are other words composed of the same letters but in a 
different order (for instance, STATIONARILY/ANTIROYALIST, which happen to
both be dictionary words; for our purposes "AAIILNORSTTY" is also a 
"word" composed of the same letters as these two).

We can then assign a number to every word, based on where it falls in an 
alphabetically sorted list of all words made up of the same group of letters.
One way to do this would be to generate the entire list of words and find the 
desired one, but this would be slow if the word is long.

Given a word, return its number. Your function should be able to accept any 
word 25 letters or less in length (possibly with some letters repeated), and 
take no more than 500 milliseconds to run. To compare, when the solution code 
runs the 27 test cases in JS, it takes 101ms.

Python, Java and Haskell have arbitrary integer precision, so you must be precise
in those languages (unless someone corrects me).

C# is using a long, which may not have the best precision, but the tests are 
locked so we can't change it.

Sample words, with their rank:
ABAB = 2
AAAB = 1
BAAA = 4
QUESTION = 24572
BOOKKEEPER = 10743
 */
public class AnagramSmartSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test();
	}
	public static void test(){
		check(listPosition("ABAB"), 2);
		check(listPosition("AAAB"), 1);
		//	check(listPosition("ABAB"), 4);
		//check(listPosition("QUESTION"), 24572);


	}

	private static void check(BigInteger listPosition, int i) {
		// TODO Auto-generated method stub
		if(listPosition == BigInteger.valueOf(i))
			System.out.println("Passed test");
		else
			System.out.println("Failed test");

	}
	public static BigInteger listPosition(String word) {
		char[] c = word.toCharArray();
		Arrays.sort(c);
		String word2 = new String(c);
		char ch = word.charAt(0);
		BigInteger r = null;
		r = BigInteger.valueOf(anagramHelper(word2,"", word,false) + 1);
		return r;
	}

	private static int anagramHelper(String word, String s, String sear, boolean magic) {
		if(word.length()<=0){
			System.out.println(s);
			if(s.equals(sear))
				magic = true;
			return 1;
		}
		int val=0;
		if(!magic){
		for(int i=0;i<word.length();i++){
				val += anagramHelper(word.substring(0, i)+ word.substring(i+1, word.length()),
						s + word.charAt(i), sear, magic);
			}
		}
		return val;
	}

}
