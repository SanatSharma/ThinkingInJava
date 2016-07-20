package arrayListsandComparable;

import java.util.ArrayList;

public class RemoveString {

	public static void main(String[] args) {
		ArrayList<String> as = new ArrayList<String>();
		String[] s = {"Sand", "Marnie the dog","Zero dark thirty","sd","sanat", "the best ever"};
		for(String l:s)
			as.add(l);
		System.out.println(remEven(as));
	}

	//method to remove strings with even length
	public static ArrayList<String> remEven(ArrayList<String> s)
	{
		for(int i=s.size()-1;i>=0;i--)
			if(s.get(i).length()%2==0)
				s.remove(i);
		return s;
	}
}
