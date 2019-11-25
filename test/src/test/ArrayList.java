package test;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException; 
import java.util.Scanner; 


public class ArrayList<E> implements List<E> {
	public static final int CAPACITY=16; 
	private E[] data;
	private int size = 0;
	public ArrayList() { 
		this(CAPACITY);
	} 
	public ArrayList(int capacity) {
		data = (E[]) new Object[capacity];
		// default array capacity
		// generic array used for storage
		// current number of elements
		// constructs list with default capacity 
		// constructs list with given capacity 
		// safe cast; compiler may give warning
	}
	public int size() { 
		return size; 
	}
	public boolean isEmpty() { 
		return size == 0;
	}
	public E get(int i) throws IndexOutOfBoundsException { 
		checkIndex(i, size);
		return data[i]; 
	}
	public E set(int i, E e) throws IndexOutOfBoundsException { 
		checkIndex(i, size);
		E temp = data[i];
		data[i] = e;
		return temp; 
	}
	public void add(int i, E e) throws IndexOutOfBoundsException {
		checkIndex(i, size + 1); 
		if (size == data.length)
			resize(2 * data.length);
		for (int k=size-1; k >= i; k--)
			data[k+1] = data[k]; data[i] = e;
			size++;
			// not enough capacity
			// so double the current capacity 
			// start by shifting rightmost
			// ready to place the new element
	}
	public E remove(int i) throws IndexOutOfBoundsException {
		checkIndex(i, size);
		E temp = data[i];
		for (int k=i; k < size-1; k++)
			data[k] = data[k+1]; data[size-1] = null; size--;
			return temp;
			// shift elements to fill hole
			// help garbage collection
	}
	protected void checkIndex(int i, int n) throws IndexOutOfBoundsException {
		if (i < 0 || i >= n)
			throw new IndexOutOfBoundsException("Illegal index: " + i);
	}
	protected void resize(int capacity) {
		E[] temp = (E[]) new Object[capacity]; 
		for (int k=0; k < size; k++)
			temp[k] = data[k]; data = temp;
			// safe cast; compiler may give warning
			// start using the new array
	}
	protected void trimToExactSize(int capacity) {
		E[] temp = (E[]) new Object[capacity]; 
		for (int k=0; k < size; k++)
			temp[k] = data[k]; data = temp;
			// safe cast; compiler may give warning
			// start using the new array
	}
	
	
//---------------- nested ArrayIterator class ----------------
private class ArrayIterator implements Iterator<E> {
	/** Index of the next element to report. */
	private int j = 0; // index of the next element to report 
	private boolean removable = false; 
	// can remove be called at this time?
	public boolean hasNext() { 
		return j < size; 
	} 
	// size is field of outer instance 
	public E next() throws NoSuchElementException {
		if (j == size) throw new NoSuchElementException("No next element");
		removable = true; // this element can subsequently be removed
		return data[j++]; // post-increment j, so it is ready for future call to next
	}
	public void remove() throws IllegalStateException {
		if (!removable) throw new IllegalStateException("nothing to remove"); 
		ArrayList.this.remove(j-1); // that was the last one returned
		j--; // next element has shifted one cell to the left 
		removable = false; // do not allow remove again until next is called
	}
} 
//------------ end of nested ArrayIterator class ------------ 

	public Iterator<E> iterator() {
		return new ArrayIterator(); // create a new instance of the inner class 
	}
	public String toString() {
		StringBuilder sb = new StringBuilder("("); 
		for (int j = 0; j < size; j++) {
			if (j > 0) sb.append(", ");
			sb.append(data[j]); 
		}
		sb.append(")");
		return sb.toString(); 
	}
	 public static void main(String[] args){
		 final int namesCapacity = 6;
		 final int numberCapacity = 10;
		 int count = 0;
		 ArrayList<String> names = new ArrayList<String>(namesCapacity);
		 ArrayList numbers = new ArrayList(numberCapacity);
		 ArrayList<String> userName = new ArrayList();
		 
		 
		 names.add(0, "Mike");
		 names.add(1, "John");
		 names.add(2, "Sarah");
		 names.add(3, "Joe");
		 names.add(4, "Lilo");
		 
		 
		 //Problem 4 Assignment 4
		 names.trimToExactSize(names.size);
		 System.out.println("The array size is " + names.size);
		 
		 Scanner scan = new Scanner(System.in); 
		 
		 for (int i = 0; i < namesCapacity; i++) {
			 
			 Iterator <String> iter = names.iterator();
			 
			 count = 0;  
			 
			 System.out.println("Enter name " + (i+1) + ":");
			 userName.add(i, scan.nextLine());
			 
			 while(iter.hasNext()) {
				 
				 String name = iter.next();
				 
				 if (name.equals(userName.get(i))) {
					 
					 count++;
					 
				 }
			}
			 
			 if (count == 1) {
			 
			 System.out.println("True");
			
			 } else {
				 
				 System.out.println("false"); 
				 
			 }
			 
		 }
		 
		 //names.get(11); Problem 3 Assigment 4
		 
	 }
}

