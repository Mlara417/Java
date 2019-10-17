import java.util.Scanner;

public class TypeSelector {

	public static String main(String[] args) {
		// TODO Auto-generated method stub
		
		String response;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Are you trying to find the Voltage(v), \nCurrent(i), or Resistance(r)? (enter v, i, or r)\n");
		response = scan.next();
		response = response.toLowerCase();
		
		return response;

	}

}
