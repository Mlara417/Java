package isMultiple2;
import java.util.Scanner;

public class main2 {


	public static void main(String[] args) {
		int n = 0;
		
		main2 object = new main2();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter int value");
		n = scan.nextInt();
		
		object.isMultiple(n);

	}
	
	 int isMultiple(int n) {
		 
		 int sum = 0;
		
		for(int i=0; i <= n; i++) {
			
			sum += i;
			
		}
		
		System.out.println("Your summed integer value is " + sum);
		
		return sum;
		
	}

}
