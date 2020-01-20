package algo.mergeSort;

public class App {

	public static void main(String[] args) {
		int[] inputArray = {2,4,7,1};
		MergeSort sorter = new MergeSort();
		
		sorter.sort(inputArray);
		
		for(int i = 0; i < inputArray.length; i++) {
			System.out.println(inputArray[i]);
		}
	}

}
