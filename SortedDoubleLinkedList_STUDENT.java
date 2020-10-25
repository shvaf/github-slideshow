


import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Comparator;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;



//import SortedDoubleLinkedList.StringComparator;



public class SortedDoubleLinkedList_STUDENT {
	SortedDoubleLinkedList<String> sortedLinkedString;
	Comparator<String> comparator;

	SortedDoubleLinkedList<Double> sortedLinkedDouble;
	//StringComparator comparator;
	Comparator<Double> comparatorD;

	public String welcome = new String("Welcome");
	public String to = new String("to");
	public String our = new String("our");
	public String home = new String("home");
	
	Double x =  1.0;
	Double y =  2.0;
	Double z = 3.0;
	

	@Before
	public void setUp() throws Exception {
		sortedLinkedString = new SortedDoubleLinkedList<String>(comparator);
		sortedLinkedDouble = new SortedDoubleLinkedList<Double>(comparatorD);
	}

	@After
	public void tearDown() throws Exception {
		sortedLinkedString = null;
	}

	@Test
	public void testAddToEnd() {
		try {
			sortedLinkedString.addToEnd("Welcome");
			sortedLinkedString.addToEnd("To");
			sortedLinkedString.addToEnd("Our");
			sortedLinkedString.addToEnd("Home");
		}
		catch (UnsupportedOperationException e)
		{
			assertEquals(e.getMessage(), "Invalid operation for sorted list");
		}
	}

	
	@Test
	public void testAddToFront() {
		try {
			sortedLinkedString.addToFront("Welcome");
			assertTrue("Did not throw an UnsupportedOperationException", false);
		}
		catch (UnsupportedOperationException e)
		{
			assertTrue("Successfully threw an UnsupportedOperationException", true);
		}
		catch (Exception e)
		{
			assertTrue("Threw an exception other than the UnsupportedOperationException", false);
		}
	}

}