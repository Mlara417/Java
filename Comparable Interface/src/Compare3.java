
public class Compare3 {

	public static void largest(Short val1 , Short val2  , Short val3) {
		
		val1 = 1;
		val2 = 2;
		val3 = 3;
		
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
