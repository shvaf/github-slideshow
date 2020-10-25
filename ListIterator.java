import java.awt.List;
import java.util.Iterator;

//package java.util;
public class ListIterator<T> implements Iterator<T>{
	MyNode<T> current; 
    
    // initialize pointer to head of the list for iteration 
//    public ListIterator(List<T> list) 
//    { 
//        current = list.getHead(); 
//    } 
      
    public ListIterator() {
		// TODO Auto-generated constructor stub
	}

	// returns false if next element does not exist 
    public boolean hasNext() 
    { 
        return current != null; 
    } 
      
    // return current data and update pointer 
    public T next() 
    { 
        T data = current.getData(); 
        current = current.getNext(); 
        return data; 
    } 
      
    // implement if needed 
    public void remove() 
    { 
        throw new UnsupportedOperationException(); 
    } 
	
	
	
}
