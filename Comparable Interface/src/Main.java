import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer val1, val2, val3;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println ("What is value 1?");
		val1 = scan.nextInt();
		
		System.out.println ("What is value 2?");
		val2 = scan.nextInt();
		
		System.out.println ("What is value 3?");
		val3 = scan.nextInt();
		
		Compare3.largest(val1, val2, val3);

	}

}
