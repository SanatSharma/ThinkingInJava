package Strings;
//: strings/UsingStringBuilder.java
import java.util.*;
public class UsingStringBuilder 
{
	
	public static Random rand = new Random(47);
	public String toString() 
	{
		StringBuilder result = new StringBuilder("[");
		for(int i = 0; i < 25; i++) 
		{
			result.append(rand.nextInt(100));
			result.append(", ");
		}

		result.append("]");

		result.delete(1,12);
		return result.toString();
	}
	public static void main(String[] args) 
	{
		UsingStringBuilder usb = new UsingStringBuilder();
		System.out.println(usb);
		System.out.println(usb.toString());
	}
} /* Output:
[58, 55, 93, 61, 61, 29, 68, 0, 22, 7, 88, 28, 51, 89, 9, 78, 98, 61, 20, 58, 16, 40, 11, 22, 4]
*///:~