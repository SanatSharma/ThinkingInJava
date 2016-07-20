package LinkedList;

public class Palindrome 
{
	private static class Node
	{
		private String data;
		private Node next;

		public Node(String data)
		{
			this.data = data;
			next = null;
		}
		public Node(String data, Node next)
		{
			this.data = data;
			this.next = next;
		}
	}
	
	public boolean isPalindrome(Node head) {
	    if(head == null)
	        return true;
	 
	    Node p = head;
	    Node prev = new Node(head.data);
	 
	    while(p.next != null){
	        Node temp = new Node(p.next.data);
	        temp.next = prev;
	        prev = temp;
	        p = p.next;
	    }
	 
	    Node p1 = head;
	    Node p2 = prev;
	 
	    while(p1!=null){
	        if(p1.data != p2.data)
	        {}
	        p1 = p1.next;
	       	p2 = p2.next;
	       
	    }
	 
	    return true;
	}

	public static void main(String[] args)
	{
		Node n3 = new Node("well", null);
		Node n2 = new Node("haha",n3);
		Node n1 = new Node("Palindrome",n2);	
		Palindrome p = new Palindrome();
		System.out.println(p.isPalindrome(n1));
	}
}
