package recursion;

import java.util.Scanner;

public class CountCharacter {

	public static void main(String[] args) 
	{
		System.out.println("Number of x's in xxhixx is : " + recCountChar("xxhixx", 'x'));
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = scan.nextLine();
		System.out.print("Enter the character to be searched: ");
		char c = scan.next().charAt(0);
		System.out.println("Number of " + c+"'s in " + str + " is: " + recCountChar(str,c));
		scan.close();
	}
	
	//recursively count the occurrence of a particular character
	public static int recCountChar(String str, char ch)
	{
		if(str==null || str.equals(""))
			return 0;
		else if(str.charAt(0) == ch)
			return 1 + recCountChar(str.substring(1,str.length()), ch);
		else
			return recCountChar(str.substring(1, str.length()),ch);
	}

}
