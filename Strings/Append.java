package Strings;
//: strings/WhitherStringBuilder.java
public class Append 
{
	public String implicit(String[] fields) 
	{
		String result = "";
		for(int i=0; i< fields.length;i++)
		{
			result = result + fields[i];
		}
		return result;
	}
		
	public String explicit(String[] fields) 
	{
		StringBuilder result = new StringBuilder();
		for(int i = 0; i < fields.length; i++)
			result.append(fields[i]);
		result.deleteCharAt(2);
		return result.toString();
	}
	public static void main(String[] args)
	{
		Append a = new Append();
		String[] ch= new String[] {"Babu Whatcha doin"};
		System.out.println(a.implicit(ch));
		System.out.println(a.explicit(ch));
	}
} ///:~
