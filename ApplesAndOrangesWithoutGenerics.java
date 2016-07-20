
//: holding/ApplesAndOrangesWithoutGenerics.java
// Simple container example (produces compiler warnings).
// {ThrowsException}
import java.util.*;
class Apple 
{
	private static long counter;
	private final long id = counter++;
	public long id() 
	{
		return id; 
	}
}
class Orange extends Apple
{
	
}
public class ApplesAndOrangesWithoutGenerics 
{
	@SuppressWarnings("unchecked")
	public static void main(String[] args) 
	{
		ArrayList<Apple> apples = new ArrayList<Apple>();
		for(int i = 0; i < 3; i++)
		{
			apples.add(new Apple());
		}
		apples.add(new Orange());
		// Not prevented from adding an Orange to apples:
		
		for(int i = 0; i < apples.size(); i++)
		{
			System.out.println(apples.get(i).id());
		}
		for(Apple a : apples)
		{// Orange is detected only at run time
			System.out.println(a.getClass().getSimpleName());
		}
	}
} /* (Execute to see output) *///:~