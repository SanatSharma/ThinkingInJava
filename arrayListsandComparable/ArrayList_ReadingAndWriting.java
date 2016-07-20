package arrayListsandComparable;

import java.util.*;

public class ArrayList_ReadingAndWriting 
{
	private static Scanner scan;
	public static List<Integer> getList()
	{
		scan = new Scanner(System.in);
		List<Integer> a =new ArrayList<Integer>();
		for(int i=0;i<3;i++)
		{
			System.out.println("Enter value: ");
			a.add(scan.nextInt());
		}
		return a;
	}
	public static void write(List<Integer> a)
	{
		System.out.println("The list is as follows : " + a);
	}
	public static void main(String[] args)
	{
		List<Integer> l = getList();
		write(l);
	}
}
