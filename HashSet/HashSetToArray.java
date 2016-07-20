package HashSet;
import java.util.*;
//Program to send elements from HashSet to array
public class HashSetToArray 
{

	public static void main(String[] args) 
	{
		Set<String> hs = new HashSet<String>();
	
		//adding elements to HashSet
		hs.add("one");
		hs.add("two");
		hs.add("three");
		System.out.print("Elements : " + hs);
		System.out.println();
		
		String[] strArr = new String[hs.size()];
		hs.toArray(strArr);
		
		System.out.println("Copied array content!!");
		for(String content : strArr)
		{
			System.out.println(content);
		}
	}

}
