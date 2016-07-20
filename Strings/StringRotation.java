package Strings;
/*The goal of this exercise is to write a method that takes two strings as parameters and returns an integer n, where n is equal to the amount of spaces "rotated forward" the second string is relative to the first string (more precisely, to the first character of the first string).

For instance, take the strings "fatigue" and "tiguefa". In this case, the first string has been rotated 5 characters forward to produce the second string, so 5 would be returned.

If the second string isn't a valid rotation of the first string, the method returns -1.
Examples:

"coffee", "eecoff" => 2

"eecoff", "coffee" => 4

"moose", "Moose" => -1

"isn't", "'tisn" => 2

"Esham", "Esham" => 0

"dog", "god" => -1*/
public class StringRotation {

	public static void main(String[] args){
		test();
	}
	private static void test() {
		check(shiftedDiff("coffee", "eecoff"), 2);
		check(shiftedDiff("eecoff", "coffee"), 4);
		check(shiftedDiff("moose", "Moose"), -1);
		check(shiftedDiff("isn't", "'tisn"), 2);
		check(shiftedDiff("Esham", "Esham"), 0);
		check(shiftedDiff("dog", "god"), -1);

	}
	private static void check(int shiftedDiff, int i) {
		// TODO Auto-generated method stub
		if(shiftedDiff == i)
			System.out.println("Passed test");
		else{
			System.out.println(shiftedDiff);
			System.out.println("Failed test");
		}
	}
	static int shiftedDiff(String first, String second){
	   if(first.length() != second.length() || 
			   (first+ first).indexOf(second)==-1) 
	    return -1;
	   else
		   return (second + second).indexOf(first);
	  }
}
