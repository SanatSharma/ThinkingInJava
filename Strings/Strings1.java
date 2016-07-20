package Strings;
//: strings/Immutable.java
public class Strings1 
{	
	public static String uppercase(String s)
	{
		return s.toUpperCase();
	}
	public static void main(String[] args) 
	{
		String ch = "howdy Texas I'm Comin";
		System.out.println(ch); // howdy
		String sent = uppercase(ch);
		System.out.println(sent); // HOWDY
		System.out.println(ch); // howdy
	}
} /* Output:
howdy
HOWDY
howdy
*///:~