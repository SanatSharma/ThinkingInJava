package arrayListsandComparable;
import java.util.*;
public class LongestString {

	public static void main(String[] args) 
	{
		ArrayList<String> as = new ArrayList<String>();
		String[] s = {"Sand", "Marnie the dog","Zero dark thirty"};
		for(String l:s)
			as.add(l);
		System.out.println(maxLength(as));
	}

	//method that takes in an arraylist of strings as parameter and returns the length of the longest string
	public static int maxLength(ArrayList<String> s)
	{
		int maxLength = 0;
		for(int i=0;i<s.size();i++)
		{
			if(maxLength<s.get(i).length())
				maxLength= s.get(i).length();
		}
		return maxLength;
	}
}
