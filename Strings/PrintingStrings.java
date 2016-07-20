package Strings;
public class PrintingStrings 
{
	private final static String ch= "Babu";
	private final static int s = 23;
	private final static float f = 120.23f;
	public static void main(String[] a)
	{
		//Method 1 Old method
		System.out.println("The output is : " + ch + " " + s + 	" " + f);
		//Using format
		System.out.format("The output is : [%s %d %f] \n", ch,s,f);
		//Using printf
		System.out.printf("Row 1: [%s %d %f]\n", ch, s, f);

	}
}
