import java.util.Arrays;
import java.util.List;
import java.util.Collections;

// ***************************************************************
// ListTest.java
//
// A simple test program that creates an IntList, puts some
// ints in it, and prints the list.
//
// ***************************************************************
 public class ListTest {
	 public static void main(String[] args){
		 SortedIntList myList = new SortedIntList(10);
		 myList.add(100);
		 myList.add(50);
		 myList.add(200);
		 myList.add(25);
		 
		 
		 System.out.println(myList);
	 }
}