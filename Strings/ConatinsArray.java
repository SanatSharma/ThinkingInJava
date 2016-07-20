package Strings;

import java.util.ArrayList;
import java.util.Arrays;


/*Given two arrays of strings a1 and a2 return a sorted array r in lexicographical
 *  order and without duplicates of the strings of a1 which are
 *   substrings of strings of a2.

Example 1:

a1 = ["arp", "live", "strong"]

a2 = ["lively", "alive", "harp", "sharp", "armstrong"]

returns ["arp", "live", "strong"]

Example 2:

a1 = ["tarp", "mice", "bull"]

a2 = ["lively", "alive", "harp", "sharp", "armstrong"]

returns []
*/
public class ConatinsArray {
	
	public static void main(String[] args){
		check(inArray(new String[]{"arp", "live", "strong"}, 
				new String[]{"lively", "alive", "harp", "sharp", "armstrong"}),
				new String[]{"arp", "live", "strong"});
		//System.out.println(Arrays.toString(a));
		check(inArray(new String[]{"tarp", "mice", "bull"},
				new String[]{"lively", "alive", "harp", "sharp", "armstrong"}),
				new String[]{});
	}

	private static void check(String[] inArray, String[] strings) {
		// TODO Auto-generated method stub
		if(inArray.length != strings.length)
			System.out.println("Failed test");
		else{
			for(int i=0;i<inArray.length;i++)
				if(!inArray[i].equals(strings[i]))
					System.out.println("Failed test");
			System.out.println("Passed test");
		}
	}

	public static String[] inArray(String[] array1, String[] array2) {
		ArrayList<String> arr = new ArrayList<String>();
		for(int i=0;i<array1.length;i++)
		{
			for(int j=0;j<array2.length;j++)
			{
				if(array2[j].contains(array1[i])){
					arr.add(array1[i]);
					break;
				}
			}
		}
		String[] result = arr.toArray(new String[arr.size()]);
		 Arrays.sort(result);
		return result;
	}
	
	
	//another much much shorter method
	public static String[] inArray2(String[] array1, String[] array2) {
	    return Arrays.stream(array1)
	      .filter(str -> Arrays.stream(array2).anyMatch(s -> s.contains(str)))
	      .distinct().sorted().toArray(String[]::new);
	  }
}
