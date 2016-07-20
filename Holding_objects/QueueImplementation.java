package Holding_objects;
import java.util.*;
public class QueueImplementation
{
	private static Scanner scan= new Scanner(System.in);
	private static int n=0;
	public static void main(String[] args) 
	{
	
		Queue<String> q = new LinkedList<String>();
		System.out.println("enter limit : ");
		n = scan.nextInt();
		String[] s = new String[n];
		if(n>0)
		{
			System.out.println("enter strings to be added to the queue : ");
			//Taking in array of strings
			for(int i=0 ;i<n;i++)
			{
				s[i]= scan.nextLine();
				System.out.println("String " + (i+1) + " : ");
			}
			s[n-1] = scan.nextLine();
			
			// Adding values to the queue
			for(int i=0;i<s.length;i++)
			{
				q.add(s[i]);
			}
			//displaying first element
			System.out.println("Front element of Queue is : " + q.peek());
		
			//deleting from queue
			if(q.isEmpty())
			{
				System.out.println("Empty stack bitch");
			}
			else
			{
				System.out.println("Removing top element");
				q.remove();
			}
		
			//displaying queue
			System.out.println("Queue is : " + q);
		
			//searching element
			System.out.println("Enter word to search: ");
			String search = scan.nextLine();
			int c=0;
			for(int i=0;i<s.length;i++)
			{
				if(s[i].equals(search))
				{
					System.out.println("Word entered is present in the queue at position "+ (i));
					c++;
				}	
			}
		
			if(c==0)
			{
				System.out.println("Word entered is not present in queue");
			}
		}
		else
		{
			System.out.println("Please enter only positive integers");
		}
	}
}