package recursion;

import java.util.Scanner;

public class RemovingCharacterFromString {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);	
		System.out.print("Enter string: "); String str = scan.nextLine();
		System.out.print("Enter character to remove: "); char c = scan.next().charAt(0);
		System.out.println("Recursively: " + recCharRem(str,c));
		System.out.println("Non-recursively: " + characterRem(str,c));
		scan.close();
	}
	
	//recursively removing character from string
	public static String recCharRem(String str, char ch) 
	{
		String a = "";
		if(str==null || str.equals(""))
			return "";
		else if(str.charAt(0)==ch)
			return a + recCharRem(str.substring(1,str.length()),ch);

		a+=str.charAt(0);
		return a + recCharRem(str.substring(1,str.length()),ch);
	}

	//non-recursively
	public static String characterRem(String str, char ch)
	{
		String a ="";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=ch)
				a+=str.charAt(i);
		}
		return a;
	}
}
