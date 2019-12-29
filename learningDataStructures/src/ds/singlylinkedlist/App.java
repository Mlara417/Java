package ds.singlylinkedlist;

public class App {

	public static void main(String[] args) {
		
		SinglyLinkedList myList = new SinglyLinkedList();
		myList.insertFirst(100);
		myList.insertFirst(50);
		myList.insertFirst(1032);
		myList.insertFirst(12);
		myList.insertLast(99999);
		
		myList.displayList();

	}

}
