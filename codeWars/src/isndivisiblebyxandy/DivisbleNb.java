package isndivisiblebyxandy;

public class DivisbleNb {
	public static boolean isDivisible(long n, long x, long y) {
		// your code
		
		boolean result = (n % x == 0 && n % y == 0) ? true : false;
		
		return result;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(isDivisible(1,1,3));

	}

}
