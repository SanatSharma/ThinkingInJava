package arrayListsandComparable;

public class IntList {

    private static int DEFAULT_CAPACITY = 10;
    
    private int[] container;
    private int size;
    
    // pre: none
    // post: creates a new, empty IntList
    public IntList() {
        this(DEFAULT_CAPACITY); // call single int constructor
//        IntList(DEFAULT_CAPACITY); // NOPE
    }
    
    // pre: initialCap > 0
    // post: creates a new, empty IntList with the given capacity
    public IntList(int initialCap) {
        // verify precondition
        if (initialCap <= 0) {
            throw new IllegalArgumentException("violation of " + 
            		"precondition. initialCap must be > 0: "
                    + initialCap);
        }
        container = new int[initialCap];
        size = 0;
    }
    
    // return the number of elements in this list
    public int size() {
        return size;
    }
    
    // pre: none
    // post: get(size() - 1) returns value, value is added to
    // end of list, AND size() = old size() + 1
    public void add(int value) {
        insert(size, value);
    }

    
    private void increaseCapacity() {
        setCapacity(container.length * 2);
    }
    
    private void setCapacity(int newCapacity) {
        int[] temp = new int[newCapacity];
        for (int i = 0; i < size; i++) {
            temp[i] = container[i];
        }
        container = temp;
    }
    
    // pre: 0 <= position < size()
    // post: return the element at the given position in the list
    public int get(int position) {
        if( !(0 <= position && position < size())) {
            throw new IllegalArgumentException("Violation of" +
            		" precondition. Position out of bounds.");
        }
        return container[position];
    }
    
    public String toStringSLOWWWWWWW() {
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
    public void insert(int position, int value) {
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
    public int remove(int position) {
        int removedElement = container[position];
        size--;
        for (int i = position; i < size; i++) {
            container[i] = container[i + 1];
        }
        return removedElement;
    }
    
    // pre: 0 <= position <= size(), other != null
    public void insertAll(int position, IntList other) {
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
}