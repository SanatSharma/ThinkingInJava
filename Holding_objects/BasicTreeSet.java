package Holding_objects;
import java.util.TreeSet;
import java.util.*;;
public class BasicTreeSet 
{
	public static void main(String[] args)
	{
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("one");
		ts.add("two");	
		System.out.print("ELEMENTS: " + ts);
		System.out.println();
		//check if set is empty
		System.out.println("Is set empty: " + ts.isEmpty());
		
		//size of set
		System.out.println("Size of set :" + ts.size());
		
		//remove one string
		System.out.println("Removing an element");
		ts.remove("one");
		
		System.out.println(ts);
	}
}
