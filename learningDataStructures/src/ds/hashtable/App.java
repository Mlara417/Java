package ds.hashtable;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashTable table = new HashTable(19);
		
		table.insert("apple");
		
		System.out.println(table.find("apple"));
		
		table.displayTable();

	}

}
