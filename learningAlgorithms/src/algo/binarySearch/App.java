package algo.binarySearch;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(recursiveBinarySearch(new int[] {12,26,37,43,58,69,74,88,95,107,115}, 0, 10, 95));

	}
	
	
	//Binary search compares middle and halves array and compares based on result 
	//Input array must be sorted, otherwise need to use linear search
	public static int binarySearch(int [] a, int x) {
		int p = 0;
		int r = a.length - 1;
		
		while(p <= r) {
			int q = (p + r) / 2;
			
			if(x < a[q]) {
				r = q - 1;
			}
			else if(x > a[q]) { 
				p = q + 1;
			}
			else { 
				return q;
			}
		}
		return -1;
	
	}
	
	public static int recursiveBinarySearch(int [] a, int p, int r, int x) {
		if(p > r) {
			return -1;
		} else {
			int q = (p+r) / 2;
			if(a[q] == x) {
				return q;
			} else if(a[q] > x) {
				return recursiveBinarySearch(a, p, q-1, x);
			} else {
				return recursiveBinarySearch(a, q+1, r, x);
			}
		}
	}
	

}
