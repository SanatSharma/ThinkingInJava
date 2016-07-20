package arrayListsandComparable;
import java.util.*;
/*Create a new class called Gerbil with an int gerbilNumber that’s initialized in the constructor. 
Give it a method called hop( ) that displays which gerbil number this is, and that it’s hopping. 
Create an ArrayList and add Gerbil objects to the List.
Now use the get( ) method to move through the List and call hop( ) for each Gerbil.
*/
class Gerbil
{

	private static int num;
	Gerbil()
	{
		num=1;
	}
	public void hop()
	{
		System.out.println("number is " + num + " and it is hopping");
		num++;
	}
}
public class ArrayList1 
{
	
	public static void main(String[] args)
	{
		ArrayList<Gerbil> abc = new ArrayList<Gerbil>();
		for(int i=0; i<3;i++)
		{
			abc.add(new Gerbil());
		}
		for(Gerbil g : abc)
		{
			g.hop();
		}
		ArrayList<String> l = new ArrayList<String>(Arrays.asList(new String[]{"A"}));
	}	
}
/* possible alternate method with an error(correct)
class Gerbil
{

	
}
public class ArrayList1 
{
	private static int num;
	ArrayList1()
	{
		num=1;
	}
	public void hop()
	{
		System.out.println("number is " + num + " and it is hopping");
		num++;
	}
	
	public static void main(String[] args)
	{
		ArrayList abc = new ArrayList();
		for(int i=0; i<3;i++)
		{
			abc.add(new ArrayList1());
		}
		for(ArrayList1 g : abc)
		{
			g.hop();
		}
	}	
}
*/