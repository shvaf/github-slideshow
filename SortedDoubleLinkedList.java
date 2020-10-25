import java.util.Comparator;
import java.util.Comparator;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;

//import SortedDoubleLinkedListTest.StringComparator;

public class SortedDoubleLinkedList<T> extends BasicDoubleLinkedList<T> implements ListIterator <T>{
	SortedDoubleLinkedList<T> sortedLinkedList;
	Comparator<T> comp = null;
	private static int size = 0;
	MyNode head;
	MyNode tail;
	//StringComparator comparator = new StringComparator();
	
	
	public SortedDoubleLinkedList(Comparator<T> comparator2) {
		comp = comparator2;
	}

	//how do I know what the correct position is?
	public SortedDoubleLinkedList<T> add(T data) {
		if (data == null) {
			return this;
		}
		MyNode newMyNode = new MyNode(data, null);
		if (head == null) {
			head = tail = new MyNode(data, null);
		} 
		else {
			if (comp.compare(data, (T) head.data) <= 0) {
			newMyNode.next = head;
			head = newMyNode;
			} 
			else if (comp.compare(data, (T) tail.getData()) >= 0) {
			tail.next = newMyNode;
			tail = newMyNode;
			} 
			else {
				MyNode next = head.next;
				MyNode prev = head;
				while (comp.compare(data, (T) next.getData()) > 0) {
					prev = next;
					next = next.next;
				}
				prev.next = newMyNode;
				newMyNode.next = next;
			}
		}
		size++;
		return this.sortedLinkedList;
	}
	
	//@Override
	public BasicDoubleLinkedList<T> addToEnd(T data) throws UnsupportedOperationException{
		//throw new UnsupportedOperationException();
		return null;
	}
	
	public BasicDoubleLinkedList<T> addToFront(T data) throws UnsupportedOperationException{
		throw new UnsupportedOperationException();
	}
	
	public ListIterator<T> iterator(){
		return new ListIterator<T>(this);
	}
	
	public SortedDoubleLinkedList<T> remove(T data, Comparator<T> comparator){
		
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T next() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean hasPrevious() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T previous() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int nextIndex() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int previousIndex() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void set(T e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void add(T e) {
		// TODO Auto-generated method stub
		
	}

}
