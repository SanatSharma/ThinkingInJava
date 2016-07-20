package Holding_objects;
import java.util.*;
public class GeneralIterator 
{
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) 
	{
		List<Integer> li = new ArrayList<Integer>();
		ListIterator<Integer> litr = null;
		System.out.println("Please enter the integer: ");
		li.add(scan.nextInt());
		System.out.println("Please enter the integer: ");
		li.add(scan.nextInt());
		System.out.println("Please enter the integer: ");
		li.add(scan.nextInt());
		litr = li.listIterator();
		System.out.println("Elements found in list are as follows: ");
		System.out.println(litr.next());  //Apparently the show and the next functions are the same
		System.out.println("Elements in forward order :");
		while(litr.hasNext())
			System.out.println(litr.next());
		System.out.println("Elements in backward order:");
		while(litr.hasPrevious())
			System.out.println(litr.previous());
	}

}
