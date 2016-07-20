package Holding_objects;

import java.util.*;

public class StackImplementation 
{

	public static void main(String[] args)
	{
		Stack<String> s = new Stack<String>();
		s.push("sanat");
		s.push("left without a roommate");
		s.push("SAD situation");
		System.out.println(s.pop());
		System.out.println(s.peek());
		if(s.isEmpty())
		{
			System.out.println("Empty stack bitch");
		}
		else
		{
			System.out.println(s);
		}
	}
}
