package recursion;

public class PairStar {

	public static void main(String[] args) 
	{
		System.out.println(pairStar("hello") + " expected: hel*lo");
		System.out.println(pairStar("xxyy") + " expected: x*xy*y");
		System.out.println(pairStar("aaaa") + " expected: a*a*a*a");
	}
	//Given a string, compute recursively a new string where identical chars that are adjacent in the original string are separated from each other by a "*". 
	public static String pairStar(String str) 
	{
		String a="";
		if(str==null || str.length()==0)
			return "";
		else if(str.length()>1 && str.charAt(0)==str.charAt(1))
			a+= str.charAt(0) + "*";
		else
			a+= str.charAt(0);

		return a + pairStar(str.substring(1,str.length()));
	}

/*
*/
}
