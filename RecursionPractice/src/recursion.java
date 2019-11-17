
public class recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(product(2, 4));
		
	}
	
	public static int product(int n, int m) {
		if (m == 1) {
			return 0;
		}
		else {
			return n + product(n, m-1);
		}
		
	}
}
  //#2. 15, it pushes 15 values, reads the back of 12 and pops out 3 null values