package arrayListsandComparable;
import java.util.ArrayList;
public class RemoveDuplicates {

	public static void main(String[] args) 
	{
		ArrayList<String> as = new ArrayList<String>();
		String[] s = {"and", "or","or","not","if","and","or","if"};
		for(String l:s)
			as.add(l);
		remDup(as);
		System.out.println(as.toString());
	}

	//method to remove duplicate values in unsorted ArrayList
	public static void remDup(ArrayList<String> a)
	{
		for(int i=0;i<a.size()-1;i++)
		{
			for(int j=i+1;j<a.size();j++)
				if(a.get(i).equals(a.get(j)))
						a.remove(j);
		}
	}
	
	//method to remove duplicate values in a sorted arraylist
	public static void remConsecutiveDuplicates(ArrayList<String> al)
	{
		for(int i=0;i<al.size()-1;i++)
			if(al.get(i).equals(al.get(i+1)))
				al.remove(i+1);
	}
}
