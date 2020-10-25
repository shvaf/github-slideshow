import java.lang.Object;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.lang.Iterable;
//import javafx.scene.Node;

public class BasicDoubleLinkedList<T> extends MyNode implements Iterator <T>{

	private static int it = 0; //counts the number of times the iterator was called
	//private static MyNode list;
	private MyNode head;
	private MyNode tail;
	private static int size;
	private BasicDoubleLinkedList<T> myList;
	
	

	public BasicDoubleLinkedList() {
		super(null, null);
		//head = new MyNode();
		//myList.addToEnd(null);
		//size = 0;
		//this.myList = new BasicDoubleLinkedList<T>();
	}
	
	public int getSize() {
		return size;
	}
	
	//When it asks me to return a reference to the currnet objec
	public BasicDoubleLinkedList<T> addToEnd(T data) {
		MyNode temp = new MyNode(data, null);
		MyNode current = head;
		//Object end;
		if(current != null) {
			while(current.getNext() != null) {
				current = current.getNext();
			}
			current.setNext(temp);
			//current = temp;
		}
		//current.setNext(temp);
		tail = temp;
		size++;
		return myList; 
	}
	
	public BasicDoubleLinkedList<T> addToFront(T data) {
		MyNode temp = new MyNode(data, null);
		if(head != null) {
			head = temp;
		}
		if (tail == null) {
			tail = temp;
		}
		size++;
		return this;
	}
	
	public T getFirst() {
		return (T) head.getData();
	}
	
	public T getLast() {
		return (T) tail.getData();
	}
	
	public ArrayList<T> toArrayList(){
		//return each item in the MyNode using a for loop
		ArrayList<T> output = new ArrayList<T>();
		if(head != null) {
			T current = (T) head.getData(); //casting again
			MyNode currentNode = head;
			while(current != null) {
				output.add(current);
				currentNode = head.getNext();
				current = (T) currentNode.getData();
				output.add(current);
			}
		}
		return output;
	}

	public T retrieveFirstElement() {
		if (size == 0) {
			throw new NoSuchElementException("Linked list is empty");
		}
		MyNode temp = head;
		head = head.getNext();
		size--;
		return (T) temp.getData();
	}

	@Override
	public boolean hasNext() {
		throw new UnsupportedOperationException();
	}

	@Override
	public T next() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException();
		
	}
	
    public Iterator<T> iterator() 
    { 
        return new ListIterator<T>(); 
    }


}

 class MyNode <T> {

	 
	MyNode<T> next;
	T data;
	
	public MyNode(T t) {
		next = null;
		data = t;
	}
	
	@SuppressWarnings("unchecked")
	public MyNode (T t, MyNode nextNode) {
		this.next = nextNode;
		this.data = t;
	}
	
	public T getData() {
		return data;
	}
	
	public void setData(T t) {
		data = t;
	}
	
	public MyNode<T> getNext() {
		return next;
	}
	
	public void setNext(MyNode nextNode) {
		next = nextNode;
	}
	
	public String toString() {
		return data+"";
	}
	
	

}



