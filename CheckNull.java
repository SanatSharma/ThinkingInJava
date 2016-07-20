import java.util.ArrayList;


public class CheckNull 
{
	public static void main(String[] args)
	{
		ArrayList<Object> i = new ArrayList<Object>();
		if(i==null)
		{
			System.out.println("Correct");
		}
		else
			System.out.println("We are fucked");
		System.out.println(i);
		System.out.println(i.size());
	}

}
