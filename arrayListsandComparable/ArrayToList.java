package arrayListsandComparable;
import java.util.*;
/*Create a class, then make an initialized array of objects of your class. Fill a List from your array.
 *  Create a subset of your List by using subList( ), then remove this subset from your List.
 */
public class ArrayToList 
{
	ArrayToList(String sent)
	{
		 System.out.println(sent);
	}
	public static void main(String[] args) 
	{	
		ArrayToList[] arr = new ArrayToList[]{ new ArrayToList("Howdy"), new ArrayToList("Sucker"), new ArrayToList("Getyour Mojo On") };
		for(ArrayToList a : arr)
		{
			System.out.println(a);
		}
		List<ArrayToList> list = Arrays.asList(arr);
		System.out.println(list);
		
	}

}
