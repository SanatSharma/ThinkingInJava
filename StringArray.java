/*Create a class with a constructor that takes a String argument. During construction, print the argument.
Create an array of object references to this class, but don’t actually create objects to assign into the array.
When you run the program, notice whether the initialization messages from the constructor calls are printed.*/
import java.util.*;
public class StringArray 
{
	StringArray(String s)
	{
		System.out.println(s);
	}
	public static void main(String[] args) 
	{
		
		String[] ch = new String[5];
		Scanner scan = new Scanner(System.in);
		System.out.println("enter data : ");
		for(int i=0;i<3;i++)
		{
			ch[i]= scan.nextLine();
		}
		for(int i =0; i<3;i++)
		{
			System.out.println(ch[i]);
		}

	}

}
