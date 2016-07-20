package Holding_objects;
import java.util.*;
public class SimpleContainers1 
{
	public static void main(String[] args)
	{
		Collection<Integer> container = new ArrayList<Integer>();
		for(int i=0;i<10;i++)
		{
			container.add(i);
		}
		for(Integer a: container)
		{
			System.out.println(a);
		}
		
		Collection<Character> c = new HashSet<Character>();
		for(int a=65;a<91;a++)
		{
				char ch = (char)a;
				c.add(ch);
		}
		for(Character ch :c)
		{
			System.out.println(ch);
		}
			
	}
}
