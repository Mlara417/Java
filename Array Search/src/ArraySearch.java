import java.util.Arrays;

public class ArraySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arrayA = new Integer[] {1,2,3,4,5,6,7,8,9,2};
		
		Arrays.toString(arrayA);
		
		System.out.printf("Does the array contain 2? " + contains(arrayA, 2));

	}
	
	public static <T> boolean contains(final T[] array, final T object) {
        return Arrays.asList(array).contains(object);
    }

}

