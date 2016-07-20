package Holding_objects;

import java.util.*;
//	this is a HOSPITAL. PATIENTS WITH HIGHET PRIORITY IS CONTACTED WHEN ORGAN IS AVAILABLE FOR ORGAN TRANSPLANT
class Patient implements Comparable
{
	private String myName;
	private int myPriority;
	
	public Patient(String name, int priority)
	{
		myName = name;
		myPriority = priority;
	}
	
	public int compareTo(Object o)
	{
		Patient rhs = (Patient) o;
		if(myPriority< rhs.myPriority)
		{
			return -1;
		}
		
		else if(myPriority > rhs.myPriority)
		{
			return 1;
		}
		
		else
		{
			return 0;
		}
	}
	
	public String toString()
	{
		String s = myName + " with priority " + myPriority;
		return s;
	}
}

public class Priority_queue
{
	public static void main(String[] args)
	{
		PriorityQueue<Patient> p = new PriorityQueue<Patient>();
		Patient p1 = new Patient("HENMAN", 3);
		Patient p2 = new Patient("Salmanash", 1);
		Patient p3 = new Patient("gonzalo", 6);
		p.add(p1);
		p.add(p2);
		p.add(p3);
		System.out.println(p);
		while(!p.isEmpty())
		{
			System.out.println("The next patient for liver transplant is : "+ p.remove());
		}
		
	}
}