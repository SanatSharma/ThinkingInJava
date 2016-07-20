package Holding_objects;
import java.util.*;
class ListNode
{
	private Object value;
	private ListNode next;
	
	public ListNode(Object initValue, ListNode initNext)
	{
		value = initValue;
		next = initNext;
	}
	
	public Object getValue()
	{
		return value;
	}
	
	public ListNode getNext()
	{
		return next;
	}
	
	public void setValue(ListNode theNewNext)
	{
		next = theNewNext;
	}

}

class LinearLinkedList
{
	private ListNode firstNode;
	
	//Construct an empty list
	public LinearLinkedList()
	{
		firstNode=null;
	}
	//return true if list is empty, false otherwise
	public boolean isEmpty()
	{
		return firstNode==null;
	}
	
	//Accesses the firstnode; needed to traverse the list
	public ListNode getFirstNode()
	{
		return firstNode;
	}
	
	//Changes first node of list
	public void setFirstNode(ListNode node)
	{
		firstNode = node;
	}
	
	//Insert object o at front of list
	public void addFirst(Object o)
	{
		if(isEmpty())
		{
			firstNode = new ListNode(o,null);
		}
		
		else
		{
			firstNode = new ListNode(o, firstNode);
		}
	}
	
	//Insert object o at end of list
	public void addLast(Object o)
	{
		if(isEmpty())
		{
			firstNode = new ListNode(o,null);
		}
		
		else
		{
			ListNode current = firstNode;
			while( current.getNext() != null)
			{
				current = current.getNext();
			}
			
			current.setValue(new ListNode(o,null));
		}
		
	}
	
	//Remove and return first element
	public Object removeFirst()
	{
		if(isEmpty())
		{
			throw new NoSuchElementException("Can't remove from empty list");
		}
		Object item = firstNode.getValue();
		firstNode = firstNode.getNext();
		return item;
	}
	
	//Remove and return last element
	public Object removeLast()
	{
		if(isEmpty())
		{
			throw new NoSuchElementException("Can't remove from empty list");
		}
		ListNode current = firstNode;
		ListNode follow = null;
	
		while(current.getNext()!=null)
		{
			follow = current;
			current = current.getNext();
		}
		
		if(follow==null)
		{
			firstNode= null;
		}
		else
		{
			follow.setValue(null);
		}
		return current.getValue();
	}
	
	//Return LinearLinkedList as String
	public String toString()
	{
		if(isEmpty())
		{
			return "empty";
		}
		else
		{
			String s = "";
			ListNode current = firstNode;
			while(current!=null)
			{
				s = s+ current.getValue() + " ";
				current = current.getNext();
			}
			return s;
		}
	}
}

public class LinearLinkList
{
	
	static Scanner in = new Scanner(System.in);
	//return linear linked list of strings 
	public static LinearLinkedList getList()
	{
		final String s = "-999";
		LinearLinkedList list = new LinearLinkedList();
		System.out.println("Terminate with " + s);
		System.out.println("ENter list: ");
		String word = in.nextLine();
		
		while(!(word.equals(s)))
		{
			list.addLast(word);
			System.out.println("enter string : ");
			word = in.nextLine();
		}
		return list;
	}


	public static boolean search(LinearLinkedList tlist, Object tkey)
	{
		ListNode current = tlist.getFirstNode();
		
		while(current!=null)
		{
			if(current.getValue().equals(tkey))
			{
				return true;
			}
			
			current = current.getNext();
		}
		
		return false;
	}
	
	public static void main(String[] args)
	{
		//Testing getList and toString
		LinearLinkedList list = getList();
		System.out.println("List is : ");
		System.out.println(list);
		
		//Testing removeFirst and removeLast
		String first = (String) list.removeFirst();
		System.out.println("First elemnt was : " + first);
		System.out.println("Removing first element");
		String last = (String) list.removeLast();
		System.out.println("LAst element was : "+ last);
		System.out.println("Removing first element");
		System.out.print("List is now : ");
		System.out.println(list);
		
		//Testing search
		System.out.println("ENter key word for search: ");
		String key = in.nextLine();
		if(search(list,key)==true)
		{
			System.out.println("the element \"" + key + "\" was present and was deleted");
		}
		else if(search(list,key)==false)
		{
			System.out.println("the element \"" + key + "\"was not present. Sorry!");
		}
		
		//displaying list
		System.out.print("The list now is :" + list);
	}
}
