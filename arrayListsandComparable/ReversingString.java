package arrayListsandComparable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ReversingString implements Iterable<String>{

	public static void main(String[] args) 
	{
		ArrayList<String> a = new ArrayList<String>();
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter string: ");
		String s = scan.nextLine();
		a.add(s);
		System.out.println(a.toString()); //printing out using the set toString
		iterate(a); //printing out using iterator
		reverse(a);
		iterate(a);
		scan.close();
	}
	
	public static void iterate(ArrayList<String> a) 
	{			
		Iterator<String> i = a.iterator();
		while(i.hasNext())
		{
			String s = i.next();
			System.out.println(s);
		}
	}

	public Iterator<String> iterator() {
		return null;
	}
	
	//method to reverse string entered by user using an arraylist
	public static void reverse(ArrayList<String> a)
	{
		String s = "";
		for(int i = a.get(0).length()-1;i>=0;i--)
		{
			s+= a.get(0).charAt(i);
		}
		a.remove(0);
		a.add(s);
	}
}