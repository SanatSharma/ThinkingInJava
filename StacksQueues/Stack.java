package StacksQueues;

 public class Stack {
	 Node top;
	 Node pop()
	 {
		 if(top!=null)
		 {
			 Object item = top.data;
			 top = top.next;
			 return (Node) item;
		 }
		 return null;
	 }
	 
	 void push(Object item)
	 {
		 Node t = new Node(item);
		 t.next = top;
		 top = t;
	 }
	 
	 
		private class Node
		{
			// reference to the next node in the chain,
			// or null if there isn't one.
			Node next;
			// data carried by this node.
			// could be of any type you need.
			Object data;
			

			// Node constructor
			public Node(Object data)
			{
				next = null;
				this.data = data;
			}
			
			// another Node constructor if we want to
			// specify the node to point to.
			public Node(Object data, Node next)
			{
				this.next = next;
				this.data = data;
			}
			
			// these methods should be self-explanatory
			public Object getData()
			{
				return data;
			}
			
			public void setData(Object data)
			{
				this.data = data;
			}
			
			public Node getNext()
			{
				return next;
			}
			
			public void setNext(Node next)
			{
				this.next = next;
			}
		}

}
