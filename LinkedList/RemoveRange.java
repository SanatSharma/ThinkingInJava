package LinkedList;
/*public class LinkedList314<E> {
 private Node<E> first; // refers to first node
private int size; // number of elements and nodes in list
}
The Node class.
public class Node<E> {
public Node(E item, Node<E> next)
public E getData()
public Node<E> getNext(
public void setData(E item)
public void setNext(Node<E> next)
}
Examples. of removeRange(int start, int stop)
[].removeRange(0, 0) -> resulting list []
[A].removeRange(0, 0) -> resulting list [A]
[A].removeRange(0, 1) -> resulting list []
[A].removeRange(1, 1) -> resulting list [A]
[B, A, D, C, G, X].removeRange(2, 4) -> [B, A, G, X]
[B, A, D, C, G, X].removeRange(0, 5) -> [X]
[B, A, D, C, G, X].removeRange(1, 5) -> [B, X]
[B, A, D, C, G, X].removeRange(0, 6) -> []
*/
public class RemoveRange extends LinkedList314{
		
	LinkedList314 l = new LinkedList314();
	//this method would ideally be part of a linked list class
	/* pre: 0 <= start <= size(), start <= stop <= size
	 post: remove the elements from start inclusive to stop exclusive
	from this list.
	*/
	public void removeRange(int start, int stop){
		if(start<0 || start>l.size() || start>stop || stop>l.size()){
			throw new IllegalArgumentException();
		}
		int index = start;
		DoubleListNode<Character> startNode= (DoubleListNode<Character>) l.get(0);
		for(int i=0;i<=index;i++){
			startNode = startNode.getNext();
		}
		DoubleListNode<Character> endNode = startNode;
		int num = stop - start;
		if(start!=0)
			num+=1;
		while(num>0){
			endNode = endNode.getNext();
			num--;
		}
		if(start==0){
			//first = endNode
			//wasn't able to implement this line since i cannot access first from this class
		}
		
		else{
		startNode.setNext(endNode);
		endNode.setPrev(startNode);
		}
		//	l.size = (stop - start);
		//can't implement this from here. Include in final solution
	}
}
