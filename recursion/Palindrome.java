package recursion;

public class Palindrome {

	public static void main(String[] args) {
		System.out.println("Checks if string is palindrome or not.");
		System.out.println(isPalindrome("rotor") + ", expected true");
		System.out.println(isPalindrome("Rotor") + ", expected false");
		System.out.println(isPalindrome("motor") + ", expected false");
		System.out.println(isPalindrome("R") + ", expected true");
		System.out.println(isPalindrome("malayalam") + ", expected true");
	}
	
	public static boolean isPalindrome(String s){
		if(s.length()<=1)
			return true;
		
		if(s.charAt(0)==s.charAt(s.length()-1)){
			return isPalindrome(s.substring(1, s.length()-1));
		}
		return false;
	}

}
