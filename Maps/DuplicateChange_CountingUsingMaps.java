package Maps;

import java.util.HashMap;

/*The goal of this exercise is to convert a string to a new string where each
character in the new string is '(' if that character appears only once in the
original string, or ')' if that character appears more than once in the original 
string. Ignore capitalization when determining if a character is a duplicate.

Examples:

"din" => "((("

"recede" => "()()()"

"Success" => ")())())"
		check(encode("din"), "(((");

"(( @" => "))(("
*/
public class DuplicateChange_CountingUsingMaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test();
	}
	
	public static void test(){
		check(encode("din"), "(((");
		check(encode("recede"), "()()()");
		check(encode("Success"), ")())())");

	}
	private static void check(String encode, String string) {
		// TODO Auto-generated method stub
		if(encode.equals(string))
			System.out.println("Passed test");
		else{
			System.out.println(encode);
			System.out.println("Failed test");
		}
	}

	static String encode(String word){
	   String result = "";
	   word = word.toLowerCase();
	   HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
	   for(int i=0;i<word.length();i++)
	   {
		   char ch = word.charAt(i);
		   if(hashMap.containsKey(ch)){
			   int freq = hashMap.get(ch);
			   hashMap.put(ch, freq+1);
		   }
		   else{
			   hashMap.put(ch, 1);
		   }
	   }
	   
	   for(int i= 0;i<word.length();i++){
		   char ch = word.charAt(i);
		   if(hashMap.get(ch)>1)
			   result += ")";
		   else
			   result += "(";
	   }
		return result;
	  }

}
