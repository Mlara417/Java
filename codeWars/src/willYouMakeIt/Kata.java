package willYouMakeIt;

public class Kata {
	
	  public static boolean zeroFuel(double distanceToPump, double mpg, double fuelLeft) {
		    // Your code here!
		  
		  int milesLeft = 0;
		  milesLeft = (int) (mpg * fuelLeft);
		 
		  if(distanceToPump > milesLeft) {
			  
			  return false;
			  
		  } else {
			  
			  return true;
		  	
		  	}
		  }
	public static void main(String[] args) {
		System.out.println(zeroFuel(50, 25, 2));

	}

}
