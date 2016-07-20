package Holding_objects;
import java.util.*;
/*Create a generator class that produces character names (as String objects)
 *  from your favorite movie (you can use Snow White or Star Wars as a fallback) each time you call next( ), 
 *  and loops around to the beginning of the character list when it runs out of names. 
 *  Use this generator to fill an array, an ArrayList, a LinkedList, a HashSet, a LinkedHashSet, and a TreeSet, 
 *  then print each container.
*/
public class PrintingContainers2 
{
	static Collection fill(Collection<String> collection)
	{
		collection.add("Darth Vader");
		collection.add("Voldemort");
		collection.add("The Joker");
		collection.add("Mogambo");
		return collection;
	}
	public static void main(String[] args)
	{
		System.out.println(fill(new ArrayList<String>()));
		System.out.println(fill(new LinkedList<String>()));
		System.out.println(fill(new HashSet<String>()));
		System.out.println(fill(new LinkedHashSet<String>()));
		System.out.println(fill(new TreeSet<String>()));
		
	}
}
