package Holding_objects;
import java.util.*;
public class AddingElementsInLists 
{
	public static void  main(String[] args)
	{
		//Creating list
		List<Integer> c = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4 , 5));
		//printing list
		System.out.print(c + " ");
		System.out.println();
		
		//Adding element to list at last position(appending list)
		c.add(27);
		System.out.print(c + " ");
		System.out.println();
		
		//Adding element to list at desired position
		c.add(3, 121);
		System.out.print(c + " ");
		System.out.println();
		
		//obtaining element from list
		//displaying autoboxing(Integer gets automatically converted to int)
		int n = c.get(3);
		System.out.println(n);

		//removing element from list from desired position
		c.remove(2);
		System.out.print(c + " ");
		System.out.println();
		
		//adding elements of an array to the list
		Integer[] i = {23, 666, 420};
		c.addAll(Arrays.asList(i));
		System.out.print(c + " ");
		System.out.println();
		
		//adding elements to list through the Collections class
		Collections.addAll(c, 21,22222, 13);
		System.out.print(c + " ");
		System.out.println();
		
		//printing size of list
		System.out.println("SIze is : " + c.size());
		
		
	}
}
