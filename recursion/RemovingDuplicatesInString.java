package recursion;

public class RemovingDuplicatesInString {
/**Write program to remove consecutive duplicates in a string using recursion**/
	public static void main(String[] args) {
		
		System.out.println("Original word: Saannats");
		System.out.println("New Word after removing consecutive duplicates: " + recursiveRemDup("Saannats")+ "\nNew Word after removing all duplicates: "+ remDup("Saannats"));
	}
	
	//removing duplicates non-recursively
	public static String remDup(String str)
	{
		String newStr="";
		for(int i=0;i<str.length();i++)
		{
			int c=0;
			for(int j=0;j<newStr.length();j++)
			{
				if(newStr.charAt(j)==str.charAt(i))
				{
					c++;
				}
			}
			if(c==0)
				newStr += str.charAt(i);
		}
		return newStr;
	}
	
	//removing String duplicates recursively
	public static String recursiveRemDup(String str)
	{
		if(str==null || str.length()<=1)
			return str;
		else if(str.charAt(0)==str.charAt(1))
			return recursiveRemDup(str.substring(1,str.length()));
		return str.charAt(0) + recursiveRemDup(str.substring(1,str.length()));
	}
}
