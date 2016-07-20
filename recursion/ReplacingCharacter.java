package recursion;

import java.util.Scanner;

public class ReplacingCharacter {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);	
		System.out.print("Enter string: "); String str = scan.nextLine();
		System.out.print("Enter character to change: "); char c = scan.next().charAt(0);
		System.out.print("Enter new character: "); char c2 = scan.next().charAt(0);
		System.out.println("New String is : " + changeChar(str,c,c2));
		scan.close();
	}
	
	//method to recursively change the character to the new character
	public static String changeChar(String str, char c1, char c2) {
		String a = "";
		if(str==null || str.equals("")) return "";
		else if(str.charAt(0)==c1)
		{
			a+=c2;
			return a + changeChar(str.substring(1,str.length()),c1,c2);
		} 
		a+=str.charAt(0); 
		return a+ changeChar(str.substring(1,str.length()),c1,c2);
	}

}
