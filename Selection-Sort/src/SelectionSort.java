import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class SelectionSort {

	public static void main(String[] args) {
		SelectionSort assignment6 = new SelectionSort();
		assignment6.TestSelectionSort();
	}
	
	//QUESTION 1: Tests PQSort method
	private void TestSelectionSort() {
		PositionalList<Integer> sequence = GetPositionalList();
		Iterator<Integer> iterator = sequence.iterator();
		String inputString = "Sequence: ";
		while(iterator.hasNext()) {
			inputString += iterator.next() + ", ";
		}
		inputString = inputString.substring(0, inputString.length() - 2);
		System.out.println(inputString);
		System.out.println();
		PQSort.pqSort(sequence, new UnsortedPriorityQueue()); //Use UnsortedPriorityQueue for selection sort
		
		System.out.println("Sorted Sequence: " + sequence);
	}
	
	//Creates  positional list to be used for testing
	private PositionalList<Integer> GetPositionalList() {
		PositionalList<Integer> sequence = new LinkedPositionalList<>();
		Position<Integer> n1 = sequence.addFirst(7);
		Position<Integer> n2 = sequence.addAfter(n1, 4);
		Position<Integer> n3 = sequence.addAfter(n2, 8);
		Position<Integer> n4 = sequence.addAfter(n3, 2);
		Position<Integer> n5 = sequence.addAfter(n4, 5);
		Position<Integer> n6 = sequence.addAfter(n5, 3);
		Position<Integer> n7 = sequence.addAfter(n6, 9);
		return sequence;
	}

}
