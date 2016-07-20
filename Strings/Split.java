package Strings;
import java.util.*;
public class Split 
{
	private final static String sent = "Now I'm free my child....i need no help, i'm can now touch you harry Potter. The force was not with you this time";
	public static void splitting(String s)
	{
		System.out.println(Arrays.toString(sent.split(s)));
	}
		
	public static void main(String[] args)
	{
		splitting(" ");
		splitting("can");
		splitting("\\W+");
		splitting("\\w+");
	}
		
}
