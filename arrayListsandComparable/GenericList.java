package arrayListsandComparable;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class GenericList<T> implements Iterable<T> {

    private static int DEFAULT_CAPACITY = 10;
    
    private T[] container;
    private int size;
    
    // pre: none
    // post: creates a new, empty IntList
    public GenericList() {
        this(DEFAULT_CAPACITY); // call single int constructor
//        IntList(DEFAULT_CAPACITY); // NOPE
    }
    
    // pre: initialCap > 0
    // post: creates a new, empty IntList with the given capacity
    public GenericList(int initialCap) {
        // verify precondition
        if (initialCap <= 0) {
            throw new IllegalArgumentException("violation of " + 
                    "precondition. initialCap must be > 0: "
                    + initialCap);
        }
        container = getArray(initialCap);
        size = 0;
    }
    
    public Iterator<T> iterator() {
        return new GLIterator();
    }
    
    // nested, inner class
    private class GLIterator implements Iterator<T> {
        
        private int indexOfNext; // start at 0 with default constructor
        private boolean removeOk; // start at false
        
        public boolean hasNext() {
            return indexOfNext < size;
        }
        
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException("No more elements in this iteration");
            }
            removeOk = true;
            T result = container[indexOfNext];
            indexOfNext++;
            return result;
        }
        
//        public void remove() {
//            throw new UnsupportedOperationException("the remove operation is not supported by this iterator");
//        }
        
        public void remove() {
            if (!removeOk) {
                throw new IllegalStateException("Not okay to remove. Must call next.");
            }
            container[indexOfNext] = null;
            removeOk = false;
            size--;
        }
    }
    
    private T[] getArray(int cap) {
        return (T[]) new Object[cap];
    }
    
    // return the number of elements in this list
    public int size() {
        return size;
    }
    
    // pre: none
    // post: get(size() - 1) returns value, value is added to
    // end of list, AND size() = old size() + 1
    public void add(T value) {
        insert(size, value);
    }

    
    private void increaseCapacity() {
        setCapacity(container.length * 2);
    }
    
    private void setCapacity(int newCapacity) {
        T[] temp = getArray(newCapacity);
        for (int i = 0; i < size; i++) {
            temp[i] = container[i];
        }
        container = temp;
    }
    
    // pre: 0 <= position < size()
    // post: return the element at the given position in the list
    public T get(int position) {
        if( !(0 <= position && position < size())) {
            throw new IllegalArgumentException("Violation of" +
                    " precondition. Position out of bounds.");
        }
        return container[position];
    }
    
    /*public String toStringSLOWWWWWWW() {
        String result = "[";
        int numElementsWithCommas = size - 1;
        for (int i = 0; i < numElementsWithCommas; i++) {
            result += container[i] + ", ";
        }
        // add last element without comma, IF it exists (not empty list)
        if (numElementsWithCommas >= 0) {
            result += container[numElementsWithCommas];
        }
        result += "]";
        return result;
    }
    */
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        int numElementsWithCommas = size - 1;
        for (int i = 0; i < numElementsWithCommas; i++) {
            sb.append(container[i]);
            sb.append(", ");
        }
        // add last element without comma, IF it exists (not empty list)
        if (numElementsWithCommas >= 0) {
            sb.append(container[numElementsWithCommas]);
        }
        sb.append("]");
        return sb.toString();
    }
    
    // pre: 0 <= position <= size()
    // post: size() = old size() + 1, get(position) returns value
    // elements at old positions equal to position are
    // shifted down, to the right, one position
    public void insert(int position, T value) {
        if (size == container.length) {
            increaseCapacity();
        }
        
        // now I KNOW I have capacity available
        // shift elements down
        for (int i = size; i > position; i--) {
            container[i] = container[i - 1];
        }
        
        // insert new element
        container[position] = value;
        size++;
    }
    
    // pre: 0 <= position < size()
    // post: remove element at given position from list,
    // size() = old size() - 1, elements at spots greater
    // than position are shifted towards the front of the
    // list by one element. return element removed from list
    public T remove(int position) {
        T removedElement = container[position];
        size--;
        for (int i = position; i < size; i++) {
            container[i] = container[i + 1];
        }
        // prevent memory leak
        container[size] = null;
        return removedElement;
    }
    
    // pre: 0 <= position <= size(), other != null
    public void insertAll(int position, GenericList<T> other) {
        // old slow, N^2 way
//        for (int i = 0; i < other.size; i++) {
//            this.insert(position + i, other.container[i]);
//        }
        
        int newSize = this.size + other.size;
        if (newSize > this.container.length) {
            setCapacity(newSize + 10);
        }
        
        // shift elements
        for (int i = this.size - 1; i >= position; i--) {
            this.container[i + other.size] = this.container[i];
        }
        
        // add elements
        for (int i = 0; i < other.size; i++) {
            this.container[i + position] = other.container[i];
        }
        
        size = newSize;
    }

    /* pre: 0 <= start < size
    post: return a new GenericList with all elements in this
    GenericList from position start to the end of the list. The
    calling GenericList is not altered as a result of this method
    call.
    */
    public GenericList<T> sublist(int start) {
    	if(start<0 || start>=size)
    		throw new IndexOutOfBoundsException("start cannot be less than 0 or greater than/equal to size");
    	GenericList<T> newList = new GenericList<T>();
    	int c = 0;
    	for(int i=start;i<size;i++)
    	{
    		newList.container[c] = this.container[i];
    		c++;
    	}
    	return newList;
    }
    
    // return true if this list contains obj, false
    public boolean contains(T obj){
        for (int i = 0; i < size; i++) {
            if (container[i].equals(obj)) {
                return true;
            }
        }
        return false;
    }
    
    // pre: NONE
    public boolean equals(Object other) {
        boolean result = true;
        if (other == null) {
            result = false;
        } else if (!this.getClass().equals(other.getClass())) {
            // other is NOT a GenericList
            result = false;
        } else {
            // I KNOW other is a non null, GenericList
            GenericList<?> otherList = (GenericList<?>) other;
            result = this.size == otherList.size;
            int index = 0;
            while(result && index < size) {
                result = this.container[index].equals(otherList.container[index]);
                index++;
            }
            return result;
        }
        return result;
    }
    /* pre: other != null
    post: return a new GenericList with all the elements in other that
    are not in this GenericList. Neither this or other are changed.
    */
    /*[].inOtherListOnly([]) -> returns []
	["B", "A"]. inOtherListOnly([]) -> returns []
	[].inOtherListOnly(["A", "B"]) -> returns ["A", "B"]
	["A", "B", "A"]. inOtherListOnly(["B","A","B","A"]) -> returns []
	["A", "B"]. inOtherListOnly(["A","C","B","A", "B"]) -> returns ["C"]
	["A", "B", "B", "A"]. inOtherListOnly(["C", "B", "B", "A", "B", "C"]) -> returns ["C", "C"]
     */
    public GenericList<T> inOtherListOnly(GenericList<T> other) 
    {
    	if(other == null) throw new IllegalArgumentException();
    	GenericList<T> newList = new GenericList<T>(10);
    	for(int i =0;i<other.size;i++)
    	{
    		int currIndex =0;
    		boolean distinct = true;
    		while(distinct && currIndex<this.size)
    		{	if(other.container[i].equals(container[currIndex]))
    				distinct = false;
    			currIndex++;
    		}
    		if(distinct)
    		{
//    			System.out.println("inside here");
    			newList.container[newList.size] = other.container[i]; 
    			newList.size++;
    		}
    	}
    	return newList;
    }
    
    /*public void interleave(GenericList<E> other) {
	Examples of calls to interleave. The list after the -> is the list that invoked the method, after the
	method is completed.
	[].interleave([]) -> []
	[A, B]. interleave([]) -> [A, B]
	[].interleave([A, B]) -> [A, B]
	[A, B, C].interleave([D, E, F]) -> [A, D, B, E, C, F]
	[A, B].interleave([D, E, F, G]) -> [A, D, B, E, F, G]
	[A, B, C, D].interleave([H, I]) -> [A, H, B, I, C, D] 
     */
    //pre: other is not null
    public GenericList<T> interleave(GenericList<T> other)
    {
    	if(other ==null)
    		throw new IllegalArgumentException();
    	GenericList<T> newList = new GenericList<T>();
    	int min = Math.min(other.size,size);
    	int c=0; int l=0;
    	for(int i=0;i<min*2;i++)
    	{
    		if(i%2==0)
    		{	newList.add(container[c]);
    			c++;
    		}
    		else
    		{	newList.add(other.container[l]);
    			l++;
    		}
    	}
    	if(min==size)
    	{
    		for(int i=min;i<other.size;i++)
    			newList.add(other.container[i]);
    	}
    	else
    	{
    		for(int i=min;i<size;i++)
    			newList.add(container[i]);
    	}
    	return newList;
    }
    
    public static void main(String[] args)
    {
    	GenericList<Integer> list = new GenericList<Integer>();
    	GenericList<Integer> list2 = new GenericList<Integer>();
    	list.add(1); list.add(2);
    	list2.add(0);
    	System.out.println("Using interleaving, expecting [1,0,2], result: " + list.interleave(list2));
    	System.out.println("Using inOtherListOnly, expecting [0], result: " + list.inOtherListOnly(list2));
    }
}
