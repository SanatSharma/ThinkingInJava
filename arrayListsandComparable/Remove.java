package arrayListsandComparable;

import java.util.ArrayList;
import java.util.Arrays;

public class Remove {
	private ArrayList<Integer> nums = new ArrayList<Integer>();
	
	public Remove()
	{
		Integer[] c = new Integer[] {1,23,3,5,45,3,22};
		nums.addAll(Arrays.asList(c));
	}
	public static void main(String[] args)
	{
		Remove r = new Remove();
		System.out.println(r.remove(20));
		System.out.println(r.nums);
	}

	public ArrayList<Integer> remove(int cutoff)
	{
		ArrayList<Integer> ret = new ArrayList<Integer>();
		for(int i=nums.size()-1;i>=0;i--)
		{
			if(nums.get(i)>cutoff)
			{
				ret.add(nums.get(i));
				nums.remove(i);
			}	
		}
		
		return ret;
	}
}
