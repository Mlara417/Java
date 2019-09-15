
public class Compare3 {

	public static void largest(Integer val1 , Integer val2  , Integer val3) {
		
		// TODO Auto-generated method stub
		if (val1.compareTo(val2) == 1 && val1.compareTo(val3) == 1 ) {
			
		      System.out.println(val1 + " is the highest value");

			
		} else if (val2.compareTo(val1) == 1 && val2.compareTo(val3) == 1 ) {
			
			System.out.println(val2 + " is the highest value");
			
		} else {
			
			System.out.println(val3 + " is the highest value");
			
		}
		
		

	}

}
