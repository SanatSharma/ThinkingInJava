package Strings;
import java.util.*;
//Create a class that contains int, long, float and double and String fields. 
//Create a constructor for this class that takes a single String argument, and scans that string into the various fields. 
//Add a toString( ) method and demonstrate that your class works correctly.
public class ScanningStrings 
{
	private static int i;
	private static String sent;
	private static double d;
	private static long l;
	private static float f;
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		System.out.println("Enter integer, string, double, long, float : ");
		i = scan.nextInt();
		sent = scan.nextLine();
		d=scan.nextDouble();
		l= scan.nextLong();
		f = scan.nextFloat();
		System.out.println(i);
		System.out.println(sent);
		System.out.println(d);
		System.out.println(l);
		System.out.println(f);
	}
		
}
