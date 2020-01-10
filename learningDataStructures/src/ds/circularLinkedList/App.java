package ds.circularLinkedList;

public class App {

	public static void main(String[] args) {
		
		CircularLinkedList myList = new CircularLinkedList();
		myList.insertFirst(100);
		myList.insertFirst(50);
		myList.insertFirst(1032);
		myList.insertFirst(12);
		myList.insertLast(99999);
		
		myList.displayList();

	}

}
