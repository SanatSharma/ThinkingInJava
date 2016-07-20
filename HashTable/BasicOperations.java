package HashTable;
import java.util.Hashtable;
import java.util.Set;
public class BasicOperations 
{
	public static void main(String[] args)
	{
		Hashtable<Integer,String> h = new Hashtable<Integer,String>();
		h.put(1, "Sanat Sharma");
		h.put(2, "Seema Jhingan");
		h.put(3, "Teddy henman");
		
		String name= h.get(3);
		System.out.println("Value of third item: " + name);
		
		System.out.println("is Hashtable empty: " + h.isEmpty());
		System.out.println("All values: " + h.toString());
		System.out.println("removing the second value " + h.remove(2));
		System.out.println("Size now is : " + h.size());
		System.out.println("Values: " + h.toString());
		
		//iterating through Hashtable
		Set<Integer> keys = h.keySet();
		for(int key: keys)
		{
			System.out.println("Value of " + key + " is: " + h.get(key));
		}
		
	}

}
