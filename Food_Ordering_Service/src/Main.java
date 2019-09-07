import java.util.Scanner;
import java.lang.Math; 


public class Main {

	public static int zipCode, items;
	public static String orderType = "";

	public static void main(String[] args) {
		
		
		
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Will this be for pickup or delivery?");
		orderType = myObj.nextLine();
		orderType = orderType.toLowerCase();
		
		if (orderType.equals("pickup")) {
			
			System.out.println("How many items would you like to order?");
			items = myObj.nextInt();
			
			Order.main(args);
			
		} else if (orderType.equals("delivery")) {
			
			System.out.println("What is your zip code?");
			zipCode = myObj.nextInt();
		
			Delivery.main(args);
			
			System.out.println("How many items would you like to order?");
			items = myObj.nextInt();
			
			Order.main(args);
			
			
		} else {
			
			System.out.println("Selection not recognized, try again");
			
		}

	}

}
