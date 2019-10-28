package isMultiple;

public class main {


	public static void main(String[] args) {
		long n = 4000000;
		long m = 1000;
		
		isMultiple(n,m);

	}
	
	public static void isMultiple(long n, long m) {
		
		if (n % m == 0) {
		      System.out.println("Is Multiple");
		      
		    } 
		else {
			System.out.println("Is Not Multiple");
		}
		
		
	}

}
