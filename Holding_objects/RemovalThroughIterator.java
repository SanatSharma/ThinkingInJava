package Holding_objects;
import java.util.*;
public class RemovalThroughIterator 
{
	private static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int c=0;
		List<String> myList = new ArrayList<String>();
		System.out.println("Please enter the string: ");
		 myList.add(scan.nextLine());
		System.out.println("Please enter the string: ");
		myList.add(scan.nextLine());
		System.out.println("Please enter the string: ");
		myList.add(scan.nextLine());
		System.out.println("Please enter the string: ");
		myList.add(scan.nextLine());
		System.out.println("Please enter the string: ");
		myList.add(scan.nextLine());
		Iterator<String> itr = myList.iterator();
		System.out.println("Enter string you want to delete");
		String removeElem = scan.nextLine();
		while(itr.hasNext())
		{
			if(removeElem.equals(itr.next()))
			{
				c++;
				itr.remove();
			}
		}
		if(c!=0)
		{
			System.out.println("After removing the element : ");
			System.out.println(myList);
		}
		else
			System.out.println("Entered element is not in list!!");
	}

}
