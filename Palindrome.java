import java.util.*;
public class Palindrome 
{
	public static void main(String[] args)
	{
		
	      //Calling Integer Palindrome
	      Palindrome p = new Palindrome();
	      p.intPalindrome();
	      p.stringPalindrome();
	}
	void intPalindrome()
	{
		//Int Palindrome
		int a;
		int original,reverse=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter integer: ");
		original=scan.nextInt();
		a =original;
		while(a!=0)
		{
			//reversing digits, eg 123 to 321
			int n = a%10;
			reverse = reverse*10 + n;
			a/=10;
		}
		System.out.println(reverse);
		if(reverse==original)
		{
			System.out.println(original + " is a Palindrome");
		}
		else
		{
			System.out.println(original + " is not a palindrome");
		}
		
	}
	void stringPalindrome()
	{
		//METHOD 1
		int c=0;
		Scanner scan= new Scanner(System.in);
		System.out.println("enter string : ");
		String sent = scan.nextLine();
		int end= sent.length()-1;
		for(int i=0; i<=sent.length()/2; i++)
		{
			if(sent.charAt(i) == sent.charAt(end))
			{}
			else
				c++;

			end--;
		}
		if(c==0)
			System.out.println(sent + " is a Palindrome");	
		
		else
			System.out.println(sent + " is not a Palindrome");
				
		//METHOD 2
		String original, reverse = "";
		 
	    System.out.println("Enter a string to check if it is a palindrome");	
	    original = scan.nextLine();
		int length = original.length();
			 
	    for ( int i = length - 1; i >= 0; i-- )
	    {
	    	reverse = reverse + original.charAt(i);
	    }
	    if (original.equals(reverse))
	    {
	    	System.out.println("Entered string is a palindrome.");
	    }
	    else
	    {
	    	System.out.println("Entered string is not a palindrome.");
	    }
	}	
}
