
public class DoublyLinkedList<E> {
	//nested Node class
	private static class Node<E> {
		private E element;     //reference to the element stored at this node
		private Node<E> prev;  //reference to previous node in list
		private Node<E> next;  //reference to the subsequest node in list
		
		public Node(E e, Node<E> p, Node<E> n) {
			element = e;
			prev = p;
			next = n;
			
		}
		public E getElement() {return element;}
		public Node<E> getPrev() {return prev;}
		public Node<E> getNext() {return next;}
		public void setPrev(Node<E> p) {prev = p;}
		public void setNext(Node<E> n) {next = n;}
		
	}
	// end of nested node class
	
	private Node<E> header;
	private Node<E> trailer;
	private static int size = 3;
	//constructs new empty list
	public DoublyLinkedList() {
		header = new Node<>(null, null, null);
		trailer = new Node<>(null, header, null);
		header.setNext(trailer);
	}

	//returns the number of elements in the linked list
	public int size() {
		return size;
	}
	//tests wehther the linked list is empty
	public boolean isEmpty() {return size == 0; }
	//returns (but does not remove) the first element of the list
	public E first() {
		if(isEmpty()) return null;
		return header.getNext().getElement();
	}
	//returns but does not remove the last element of the list
	public E last() {
		if(isEmpty()) return null;
		return trailer.getPrev().getElement();
	}
	//public update methods
	//adds element e to the front of the list
	public void addFirst(E e) {
		addBetween(e, header, header.getNext());
	}
	//adds element e to the end of the list
	public void addLast(E e) {
		addBetween(e, trailer.getPrev(), trailer);
	}
	//removes and returns the first element of the list
	public E removeFirst() {
		if(isEmpty()) return null;
		return remove(header.getNext());
	}
	//removes the last element of the list
	public E removeLast() {
		if(isEmpty()) return null;
		return remove(trailer.getPrev());
	}
	//private update methods
	//adds element e to the linked list in between the given nodes
	private void addBetween(E e, Node<E> predecessor, Node <E> successor) {
		//create and link a new node
		Node<E> newest = new Node <>(e, predecessor, successor);
		predecessor.setNext(newest);
		successor.setPrev(newest);
		size++;
	}
	//removes the given node from the list and returns its element
	private E remove(Node<E> node) {
		Node <E> predecessor = node.getPrev();
		Node <E> successor = node.getNext();
		predecessor.setNext(successor);
		successor.setPrev(predecessor);
		size--;
		return node.getElement();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(DoublyLinkedList.size);

	}

}