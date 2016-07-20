package recursion;

public class ReversingString {

	public static void main(String[] args) {
		System.out.println("original string: Taylor Swift\nReversed string : " + reverseStr("Taylor Swift") + " && " + recursiveReverse("Taylor Swift"));
		System.out.println("hello world" + " " +  recursiveReverse("hello world"));
	}
	
	//Reversing string non-recursively
	public static String reverseStr(String str)
	{
		String newStr ="";
		for(int i=str.length()-1;i>=0;i--)
		{
			newStr += str.charAt(i);
		}
		return newStr;
	}

	//Reversing string recursively
	public static String recursiveReverse(String str)
	{
		if(str==null || str.length()<=1)
			return str;
		return recursiveReverse(str.substring(1)) + str.substring(0, 1);
	}
}
