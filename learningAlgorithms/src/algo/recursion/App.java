package algo.recursion;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//reduceByOne(10);
		System.out.println(recursiveLinearSearch(new int[] {4,54,3,2,44,5,55,53,87}, 0, 87));
	}
	
	public static void reduceByOne(int n) {
		
		if(n != 0) {
			reduceByOne(n-1);
		}
		
		System.out.println("Completed Call: " + n);
		
	}
	
	public static int recursiveLinearSearch(int [] a, int i, int x) {
		if(i > a.length -1) { //x was not found in array
			return -1;
		} else if (a[i] == x) {
			return i;
		} else {
			System.out.println("index at: " + i);
			return recursiveLinearSearch(a, i+1, x);
		}
	}

}
