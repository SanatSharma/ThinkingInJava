package Strings;
import java.util.*;
//: strings/Concatenation.java
public class Concatenation 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter string 1: ");
		String s= scan.nextLine();
		Scanner sent = new Scanner(System.in);
		System.out.print("Enter string 2: ");
		String p =sent.nextLine();
		Scanner a = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int l =a.nextInt();
		String ch = s + p + l;
		System.out.print("Concatenated string is : " + ch);
	}
} 