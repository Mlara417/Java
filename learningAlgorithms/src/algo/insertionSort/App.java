package algo.insertionSort;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myArray[] = insertionSort(new int[] {3,4,6,2,77,44,8,4,22,43,66,89,97});
		
		for(int i = 0; i < myArray.length; i++) {
			System.out.println(myArray[i]);
		}

	}
	
	public static int[] insertionSort(int [] a) {
		for(int i = 1; i < a.length; i++) {
			int element = a[i]; // element variable contains the data we intend on bringin over to the sorted
			int j = i-1; // j variable points to the index position of the last value in the sorted area
			while(j>=0 && a[j] > element) {
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = element;
		}
		return a;
	}

}
