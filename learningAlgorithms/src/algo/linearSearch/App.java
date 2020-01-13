package algo.linearSearch;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	//searches array for value and returns array index when true otherwise defaults to -1
	public static int linearSearch(int [] a, int x) {
		int answer = -1;
		
		for(int i = 0; i < a.length; i++) {
			if(a[i] == x) {
				return i;
			}
		}
		return -1;
	}

}
